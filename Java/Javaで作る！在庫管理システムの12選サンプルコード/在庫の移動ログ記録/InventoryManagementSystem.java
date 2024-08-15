import java.util.ArrayList;
import java.util.List;

public class InventoryManagementSystem {
    private List<InventoryMovement> movementLog = new ArrayList<>();

    // 在庫の移動ログを記録するメソッド
    public void recordMovement(String productID, int quantityMoved) {
        InventoryMovement movement = new InventoryMovement(productID, quantityMoved);
        movementLog.add(movement);
    }

    // 移動ログを表示するメソッド
    public void displayMovementLog() {
        for (InventoryMovement movement : movementLog) {
            System.out.println(movement);
        }
    }
}
