import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventorySearch inventorySearch = new InventorySearch();
        Scanner scanner = new Scanner(System.in);

        System.out.print("商品IDを入力してください: ");
        String productId = scanner.nextLine();

        inventorySearch.searchAndPrintItemById(productId);
    }
}
