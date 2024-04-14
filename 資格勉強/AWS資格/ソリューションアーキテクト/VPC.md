⚪︎セキュリティグループ</br>
EC2インスタンスなどに適用するファイアウォール機能で、主にVPCリソースのトラフィックを制御するのに使われる。</br>

⚪︎ネットワークACL</br>
サブネット単位で設定するファイアウォール機能で、主にサブネット間の制御に使われる。</br>

【参照】</br>
セキュリティグループ vs ネットワークACL</br>
https://ex-ture.com/blog/2021/07/14/securitygroup-and-networkacl/</br>
</br></br>

⚪︎VPCエンドポイント</br>
VPCエンドポイントを作成することで、VPC内のインスタンスとVPC外のサービスをプライベート接続で通信できるようになる。</br>
ゲートウェイ型とインターフェイス型の2種類がある。</br>
①ゲートウェイ型 VPCエンドポイント：</br>
・VPCのルートテーブルのルーティング設定を行い、ゲートウェイ経由でサービスにアクセスできる。</br>
・S3とDynamoDBのみ対応している。</br>
</br>
②インターフェイス型 VPCエンドポイント：</br>
・PrivateLinkを使用して他のAWSアカウントまたはVPC内のAWSリソースにプライベートにアクセスできる。</br>
・PrivateLinkの実体はVPC内のENI(Elastic Network Interface) になり、ENIがIPアドレスを持ってVPCの中にエンドポイントが出来ます。</br>

【参照】</br>
インターフェイス VPC エンドポイント (AWS PrivateLink) - Amazon Virtual Private Cloud</br>
https://dev.classmethod.jp/articles/vpc-endpoint-gateway-type</br>
VPCエンドポイント（インターフェースエンドポイント）はVPCの中に1つあれば動作するという話</br>
https://dev.classmethod.jp/articles/interface-endpoint-vpc-one-ok</br>
</br></br>
