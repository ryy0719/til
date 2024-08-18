import java.util.List;

public class InventoryReportGenerator {

    public void generateReport(List<InventoryItem> inventoryList) {
        System.out.println("商品名\t在庫数\t単価");
        for (InventoryItem item : inventoryList) {
            System.out.println(item.getName() + "\t" + item.getQuantity() + "\t" + item.getPrice());
        }
    }
}
