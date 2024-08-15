import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManagement im = new InventoryManagement();
        // Scannerオブジェクトを作成し、標準入力からデータを読み取る準備をする
        Scanner scanner = new Scanner(System.in);

        System.out.print("商品IDを入力してください: ");
        int id = scanner.nextInt(); // 整数を読み取り

        scanner.nextLine(); // 改行文字の読み飛ばし

        System.out.print("商品名を入力してください: ");
        String name = scanner.nextLine();

        System.out.print("在庫数を入力してください: ");
        int stock = scanner.nextInt();

        im.registerItem(id, name, stock);

        System.out.println("商品が登録されました。");
        im.displayItem(id);
    }
}
