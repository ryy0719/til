import java.util.HashMap;

public class InventoryManagement {
    private HashMap<Integer, Item> inventory = new HashMap<>();

    // 商品を登録するメソッド
    public void registerItem(int id, String name, int stock) {
        Item item = new Item(id, name, stock);
        inventory.put(id, item);
    }

    // 登録した商品を表示するメソッド
    public void displayItem(int id) {
        Item item = inventory.get(id);
        System.out.println("商品ID: " + item.getId() + ", 商品名: " + item.getName() + ", 在庫数: " + item.getStock());
    }
}

class Item (
    private int id;
    private String name;
    private int stock;

    public Item(int id, String name, int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }
)
