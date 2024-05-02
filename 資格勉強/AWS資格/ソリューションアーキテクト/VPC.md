⚪︎セキュリティグループ</br>
EC2インスタンスなどに適用するファイアウォール機能で、主にVPCリソースのトラフィックを制御するのに使われる。</br>
許可設定のみ可能。</br>

⚪︎ネットワークACL</br>
サブネット単位で設定するファイアウォール機能で、主にサブネット間の制御に使われる。</br>
許可拒否の両方の設定が可能。</br>

【参照】</br>
セキュリティグループ vs ネットワークACL</br>
https://ex-ture.com/blog/2021/07/14/securitygroup-and-networkacl/</br>
セキュリティグループ vs ネットワークACL</br>
https://aws.taf-jp.com/blog/57620</br>
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

⚪︎インターネットゲートウェイを使用したインターネット接続</br>
パブリックサブネットとしてインターネットからのアクセスを許可するためにはインターネットゲートウェイが必要。</br>
EC2インスタンスにはインターネットから自由にアクセスするWEBサイトを構築する予定である場合、下記のようにインターネットゲートウェイに対して0.0.0.0/0でフルオープンを設定する必要がある。</br>
Destination：0.0.0.0/0 -> Target：インターネットゲートウェイ</br>

【参照】</br>
インターネットゲートウェイを使用してインターネットに接続する - Amazon Virtual Private Cloud</br>
https://docs.aws.amazon.com/ja_jp/vpc/latest/userguide/VPC_Internet_Gateway.html</br>
</br></br>

⚪︎CIDRブロック</br>
VPCでは使用可能なIPアドレスの範囲を設定するのに、このCIDRを使用する。</br>
CIDRブロックの最初の4つのIPアドレス（ネットワークアドレス、DNS用など）とCIDRブロックの最後のIPアドレス（ブロードキャストアドレス）はAWSが予約済みのIPアドレスとなっている</br>
VPCの仕様により、割り当てられるCIDRブロックサイズは/16～/28のサイズにする必要がある。</br>
</br>

【参照】</br>
【AWS】Amazon VPCに割り当てるCIDRブロックはどれぐらいが良いのか</br>
https://note.com/takashi_sakurada/n/n502fb0299938</br>
VPCでCIDRを設定する際のポイント</br>
https://tracl.cloud/archives/engineerblog/what-is-cidr</br>
</br></br>
