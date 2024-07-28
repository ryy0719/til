⚪︎キャッシュ設定</br>
ディストリビューションでは、CloudFront がクエリ文字列をオリジンに転送するかどうかと、すべてのパラメータまたは一部のパラメータのどちらに基づいてコンテンツをキャッシュするかを選択できる。

【参照】</br>
クエリ文字列パラメータに基づくコンテンツのキャッシュ - Amazon CloudFront</br>
https://docs.aws.amazon.com/ja_jp/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html</br>
</br></br>
⚪︎フィールドレベル暗号化</br>
アップロード時のデータの暗号化を実施することで、ユーザーによるデータアップロード時の暗号化することができる。さらに、フィールドレベル暗号化では、特定のデータに特定のアプリケーションのみがアクセスできるように制限することができる。

【参照】</br>
フィールドレベル暗号化を使用した機密データの保護 - Amazon CloudFront</br>
https://docs.aws.amazon.com/ja_jp/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html</br>
</br></br>
⚪︎ファイル圧縮</br>
リクエストヘッダーにAccept-Encoding:gzipを含めた場合は、CloudFrontが自動的に特定のタイプのファイルを圧縮して、圧縮ファイルを供給するように設定できる。圧縮されたコンテンツはファイルサイズが小さくなるため、ダウンロード時間が短縮される。JavaScriptやCSSなどのファイルでは特に効果的で、ダウンロード時間の短縮によりページの表示が高速化される。また、CloudFrontのデータ転送コストは供給されたデータの総量に基づくため、圧縮ファイルの提供は非圧縮ファイルよりもコストが安くなります。

【参照】</br>
圧縮ファイルの供給 - Amazon CloudFront</br>
https://docs.aws.amazon.com/ja_jp/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html</br>
</br></br>
⚪︎AWS WAFとの連携</br>
すべてのWEBサイトトラフィックをAWS WAFによって監視することができる。AWS WAFは、ウェブACLで設定した基準に基づいて、ウェブリクエストの検査と管理を開始する。</br>

【参照】</br>
AWS WAFでWordPressの管理画面を保護する</br>
https://kizawa.info/awswaf-1</br>
</br></br>
⚪︎地理的制限</br>
特定の国からのアクセスをブロックするには、ブロックリストを選択する。</br>

【参照】</br>
地理的制限を有効にする - Amazon CloudFront</br>
https://repost.aws/ja/knowledge-center/cloudfront-geo-restriction</br>
