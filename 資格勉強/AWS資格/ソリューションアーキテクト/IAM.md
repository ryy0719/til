⚪︎IAM タグ</br>
タグを使用すると目的、所有者、環境など、さまざまな方法でAWSリソースを分類できる。</br>
例えば、EC2インスタンスの開発用タグで分類分けを行い、そのタグが設定されているEC2インスタンスのみに操作できるようにIAMポリシーを設定することで本番用への削除権限を与えない設定が可能になる。</br>
【参照】</br>
タグを使用した AWS リソースへのアクセスの制御 - AWS Identity and Access Management (amazon.com)</br>
https://docs.aws.amazon.com/ja_jp/IAM/latest/UserGuide/access_iam-tags.html</br>
タグを使ったIAMの権限制御をやってみる</br>
https://blog.serverworks.co.jp/control-permitions-with-resourcetag</br>
</br></br>

⚪︎サービスコントロールポリシー</br>
複数アカウントを管理されている場合、SCPを用いることで組織内のアカウントのアクセス権限を一括で制限することが可能となる。</br>
【参照】</br>
サービスコントロールポリシー (SCP) - AWS Organizations (amazon.com)</br>
https://docs.aws.amazon.com/ja_jp/organizations/latest/userguide/orgs_manage_policies_scps.html</br>
【初心者必見】はじめてのSCP</br>
https://www.ctc-g.co.jp/solutions/cloud/column/article/60.html</br>
</br></br>

⚪︎AssumeRole</br>
AWS STSのサービスの1機能のことを指し、IAMロールに設定した権限を一時的に使えるようにTokenを発行する。</br>
【参照】</br>
AssumeRoleとはなんぞや！</br>
https://zenn.dev/frusciante/articles/28cd351fe9de60</br>
</br></br>
