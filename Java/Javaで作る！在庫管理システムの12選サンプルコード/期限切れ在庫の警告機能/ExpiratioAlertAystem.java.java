import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// 商品クラス
class Item {
    private String name;
    private LocalDate expirationDate;

    public Item(String name, LocalDate expirationDate) {
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}

public class ExpirationAlertSystem {
    private List<Item> items = new ArrayList<>();

    // 商品を追加するメソッド
    public void addItem(Item item) {
        items.add(item);
    }

    // 期限切れ商品をチェックし、警告するメソッド
    public void checkExpiredItems() {
        LocalDate today = LocalDate.now(); // 今日の日付を取得

        for (Item item : items) {
            if (today.isAfter(item.getExpirationDate())) {
                System.out.println(item.getName() + "の賞味期限が切れています！");
            }
        }
    }
}
