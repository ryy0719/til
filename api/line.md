LINEログインとMessaging APIを使用した配信機能を実装しました.
言語はCakePHP4です。

```
<?php
// LineComponent.php
namespace App\Controller\Component;

use Cake\Controller\Component;
use Cake\Http\Client;
use Cake\Routing\Router;
use Firebase\JWT\JWT;
use Firebase\JWT\Key;
use LINE\LINEBot;
use LINE\LINEBot\HTTPClient\CurlHTTPClient;
use LINE\LINEBot\MessageBuilder\TextMessageBuilder;

class LineComponent extends Component
{
    public function initialize(array $config): void
    {
        parent::initialize($config);

        $this->lineBot = new LINEBot(new CurlHTTPClient(LINE_CHANNEL_ACCESS_TOKEN), [
            'channelSecret' => LINE_CHANNEL_SECRET
        ]);
    }

    // Authorization Codeを取得するためのリンクを生成
    public function getLoginUrl()
    {
        $uri = 'https://access.line.me/oauth2/v2.1/authorize?';
        $uri .= http_build_query([
            'response_type' => 'code',
            'client_id' => CLIENT_ID,
            'redirect_uri' => REDIRECT_URI,
            'state' => '{乱数}',
            'scope' => 'openid profile',
            'nonce' => '{乱数}',
            'bot_prompt' => 'aggressive', // ボットとの連携をしない場合は不要
            'prompt' => 'consent', // 認証・認可を必ず行うように指定
        ]);

        return $uri;
    }

    public function authorize($data = [])
    {
        if (isset($data['error'])) {
            return false;
        }
        if (!isset($data['code']) {
            return false;
        }

        // Access Tokenを取得
        $tokenUrl = 'https://api.line.me/oauth2/v2.1/token';
        $tokenCh = curl_init($tokenUrl);
        curl_setopt($tokenCh, CURLOPT_HTTPHEADER, array('Content-Type: application/x-www-form-urlencoded'));
        curl_setopt($tokenCh, CURLOPT_POST, 1);
        curl_setopt($tokenCh, CURLOPT_SSL_VERIFYPEER, false);
        curl_setopt($tokenCh, CURLOPT_RETURNTRANSFER, true);
        curl_setopt($tokenCh, CURLOPT_POSTFIELDS, http_build_query([
            'grant_type' => 'authorization_code',
            'code' => $data['code'],
            'redirect_uri' => REDIRECT_URI,
            'client_id' => CLIENT_ID,
            'client_secret' => CLIENT_SECRET,
        ]));
        $tokenResponse = curl_exec($tokenCh);
        curl_close($tokenCh);
        $decode_response = (array) json_decode($tokenResponse);
        $account = $this->_decodeToken($decode_response);

        if ($account) {
            // @TODO set property
        }
        return $account;
    }

    private function _decodeToken($decode_contents)
    {
        if (!isset($decode_contents['id_token'])) {
           return false;
        }
        $decoded = JWT::decode($decode_contents['id_token'], new Key(LINE_CLINENT_SECRET, 'HS256'));
        return $decoded;
    }

    // LINEユーザーに通知を送信する関数
    public function sendNotification(string $lineUserId, string $message) :void
    {
        $textMessage = new TextMessageBuilder($message);
        $this->lineBot->pushMessage($lineUserId, $textMessage);
    }
}
```
