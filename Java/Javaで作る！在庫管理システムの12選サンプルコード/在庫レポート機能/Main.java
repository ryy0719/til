import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 在庫アイテムの追加
        List<InventoryItem> inventoryList = new ArrayList<>();

        inventoryList.add(new InventoryItem("商品A", 100, 5000));
        inventoryList.add(new InventoryItem("商品B", 200, 3000));

        // レポートの生成
        InventoryReportGenerator reportGenerator = new InventoryReportGenerator();
        reportGenerator.generateReport(inventoryList);
    }
}
