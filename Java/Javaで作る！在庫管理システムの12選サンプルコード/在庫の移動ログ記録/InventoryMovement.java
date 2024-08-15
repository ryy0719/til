import java.time.LocalDateTime;

public class InventoryMovement {
    private String productID;
    private int quantityMoved;
    private LocalDateTime movementTime;

    public InventoryMovement(String productID, int quantityMoved) {
        this.productID = productID;
        this.quantityMoved = quantityMoved;
        this.movementTime = LocalDateTime.now();
    }

    public String getProductID() {
        return productID;
    }

    public int getQuantityMoved() {
        return quantityMoved;
    }

    public LocalDateTime getMovementTime() {
        return movementTime;
    }

    // toString メソッド
    @Override
    public String toString() {
        return "InventoryMovement{" +
                "productID='" + productID + '\'' +
                ", quantityMoved=" + quantityMoved +
                ", movementTime=" + movementTime +
                '}';
    }
}
