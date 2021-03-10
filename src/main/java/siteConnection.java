import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;

public class siteConnection {
    public static Document getPage() throws IOException {
        String url = "https://football.ua/scoreboard/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    };
}
