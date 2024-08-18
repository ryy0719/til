public class Main {
    public static void main(String[] args) {
        InventoryManagement im = new InventoryManagement();
        im.addItem("商品A");
        im.addItem("商品B");
        im.displayInventory();

        im.removeItem("商品A");
        im.displayInventory();
    }
}
