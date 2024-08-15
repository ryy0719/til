import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ExpirationAlertSystem system = new ExpirationAlertSystem();
        system.addItem(new Item("リンゴ", LocalDate.of(2023, 9, 10)));
        system.addItem(new Item("牛乳", LocalDate.of(2023, 9, 18)));
        system.addItem(new Item("パン", LocalDate.of(2024, 8, 20)));
        system.checkExpiredItems();
    }
}
