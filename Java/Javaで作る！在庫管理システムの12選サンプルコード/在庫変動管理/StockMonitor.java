// 在庫の変動を監視するクラス
public class StockMonitor implements StockObserver {
    @Override
    public void onStockChanged(int newQuantity) {
        System.out.println("在庫が変動しました。現在の在庫：" + newQuantity);
    }
}
