import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem system = new InventoryManagementSystem();

        system.recordMovement("P12345", 50);
        system.recordMovement("P67890", 30);

        system.displayMovementLog();
    }
}
