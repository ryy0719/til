public class Main {
    public static void main(String[] args) {
        Stock itemStock = new Stock(100);

        // 2つの異なる監視者を登録
        StockMonitor monitor = new StockMonitor();
        StockAlert alert = new StockAlert();

        itemStock.addObserver(monitor);
        itemStock.addObserver(alert);

        // 在庫を10減少させる
        itemStock.decreaseStock(10);

        // 在庫をさらに80減少させ、アラートを発生させる
        itemStock.decreaseStock(80);
    }
}
