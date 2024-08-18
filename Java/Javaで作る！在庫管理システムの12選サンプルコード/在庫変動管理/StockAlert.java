// 在庫が少なくなったときにアラートを送信するクラス
public class StockAlert implements StockObserver {
    @Override
    public void onStockChanged(int newQuantity) {
        if (newQuantity < 20) { // 在庫が20以下の場合アラートを発生
            System.out.println("警告: 在庫が少なくなっています！現在の在庫：" + newQuantity);
        }
    }
}
