import java.util.ArrayList;

public class InventoryManagement {
    private ArrayList<String> inventoryList;

    public InventoryManagement() {
        this.inventoryList = new ArrayList<>();
    }

    public void addItem(String item) {
        inventoryList.add(item);
    }

    public void removeItem(String item) {
        if(inventoryList.contains(item)) {
            // 引数の文字列を含んでいる場合
            inventoryList.remove(item);
            System.out.println(item + "が削除されました。");
        } else {
            System.out.println(item + "は在庫に存在しません。");
        }
    }

    public void displayInventory() {
        System.out.println("現在の在庫:");
        for(String item : inventoryList) {
            System.out.println(item);
        }
    }
}
