import java.util.ArrayList;
import java.util.List;

class Item {
    private String productId;
    private String productName;
    private int stockQuantity;

    public Item(String productId, String productName, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.stockQuantity = stockQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
}

public class InventorySearch {
    private List<Item> inventory;

    public InventorySearch() {
        // 仮のデータを用意
        inventory = new ArrayList<>();
        inventory.add(new Item("12345", "Sample Product A", 100));
        inventory.add(new Item("67890", "Sample Product B", 50));
        inventory.add(new Item("54321", "Sample Product C", 30));
    }

    public Item searchItemById(String productId) {
        for (Item item : inventory) {
            if (item.getProductId().equals(productId)) {
                return item;
            }
        }

        return null;
    }

    public void searchAndPrintItemById(String productId) {
        boolean found = false;
        for (Item item : inventory) {
            if (item.getProductId().equals(productId)) {
                System.out.println("商品ID: " + item.getProductId());
                System.out.println("商品名: " + item.getProductName());
                System.out.println("在庫数: " + item.getStockQuantity());
                found = true;
                break; // 見つかったらループを抜ける
            }
        }
        if (!found) {
            System.out.println("商品が見つかりませんでした。");
        }
    }
}
