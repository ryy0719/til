# 暗号化、復号について

## 用語
　- 平文: 暗号化されていない元データのこと。<br>
　- 暗号文: 暗号アルゴリズムに従ってデータを変換すること。<br>
　- 鍵: データの暗号化や復号を行う際に使用する短い符号のこと。<br>
　- 初期化ベクトル: データを解読しにくくするランダムなビット列のこと。<br>
&emsp;&emsp;同じデータを常に同じ暗号文で置き換えると、その頻度から平文が推測される。<br>
&emsp;&emsp;初期化ベクトルを使用することで同じデータでも違う暗号文に置き換えることができる。

## Opensslについて
// 暗号化<br>
openssl_encrypt( $data, $method, $key, $options, $iv );<br>
// 復号<br>
openssl_decrypt( $data, $method, $key, $options, $iv );

### $data
暗号化・復号するデータのこと。

### $method
暗号化メソッドのこと。環境によって使用可能なメソッドが異なる。`openssl_get_cipher_methods()`で使用可能なメソッドの一覧を取得できる。<br>
AES-ビット数-モードで表され、ビット数は128・192・256から選択できる。大きいほど暗号強度が強くなるが、暗号の長さには影響しない。

### $key
共通鍵であり、暗号化・復号に共通して使用するパスフレーズのこと。

### $iv
初期化ベクトルのこと。暗号化メソッドによって必要な長さが変わるので、`openssl_cipher_iv_length()`で暗号ivの長さを取得する。

## 引用
> - プログラマの暗号化入門（Qiita）<br>
> https://qiita.com/asksaito/items/1793b8d8b3069b0b8d68<br>
> - 初期化ベクトルとは？暗号化で知っておくべき基礎知識を解説！（ITトレンド）<br>
> https://it-trend.jp/encryption/article/64-0091<br>
> - PHPのOpenSSLで暗号化して復号する（野良人）<br>
> https://norando.net/php_openssl
