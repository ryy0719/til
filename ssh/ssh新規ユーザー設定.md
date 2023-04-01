# SSH 新規ユーザー設定手順
v-hostで複数のプロジェクトを動かしていたため、各プロジェクト専用のユーザーを作成する必要がありました。その手順をまとめました。

## 前提
- OS：CentOS 7
- サーバー環境：EC2 Apache 2.x

### ①EC2インスタンスにログインし、ユーザーを作成
```
$ sudo useradd testuser
```
### ②グループとパスワードを設定
```
// -aオプション：このオプションがないと設定が追加ではなく上書きされてしまう。
// -Gオプション：サブグループリストの指定。
$ sudo moduser -aG ec2-user -p [パスワード] testuser
```
### ③SSH鍵の設定
```
// testuserに切り替え
$ su testuser
// SSH鍵の作成
$ ssh-keygen -t rsa
```
生成された公開鍵は、~/.ssh/id_rsa.pubに保存されます。<br>
生成された公開鍵を新しいユーザーアカウントに追加するため、以下のコマンドを実行します。
```
$ sudo mkdir /home/testuser/.ssh
$ sudo touch /home/testuser/.ssh/authorized_keys
$ sudo chown testuser:ec2-user /home/testuser/.ssh
$ sudo chown testuser:ec2-user /home/testuser/.ssh/authorized_keys
$ sudo chmod 700 /home/testuser/.ssh
$ sudo chmod 600 /home/testuser/.ssh/authorized_keys
```
### ④SSHの設定ファイル（/etc/ssh/sshd_config）を編集します。以下の行を追加する。
```
Match User testuser
    ForceCommand internal-sftp
    ChrootDirectory /var/www/example.com
    PermitTunnel no
    AllowAgentForwarding no
    AllowTcpForwarding no
    X11Forwarding no
```

この設定により、新しいユーザーアカウントがSFTPのみで接続できるようになり、/var/www/example.comのみにアクセスできるようになります。

### ⑤サーバーを再起動する。
```
$ systemctl enable sshd.service
$ systemctl start sshd.service
$ systemctl status sshd.service
```
