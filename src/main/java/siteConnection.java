import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Scanner;

public class siteConnection {
    public static Document getPage() throws IOException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Введите дату в формате yyyy-mm-dd");
        String date = sc.nextLine();
        String url = "https://football.ua/default.aspx?menu_id=scoreboard&dt=" + date;
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    };
}
