import java.util.ArrayList;
import java.util.List;

// 在庫データを管理するクラス
public class Stock {
    private int quantity;
    private List<StockObserver> observers = new ArrayList<>();

    public Stock(int initialQuantity) {
        this.quantity = initialQuantity;
    }

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void decreaseStock(int amount) {
        if (amount <= 0 || amount > quantity) {
            return;
        }

        quantity -= amount;
        notifyObservers();  // すべてのオブザーバーに通知
    }

    public int getQuantity() {
        return quantity;
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.onStockChanged(quantity);
        }
    }
}
