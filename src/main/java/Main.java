import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    private static Document getPage() throws IOException {
        String url = "https://football.ua/scoreboard/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    };
    public static void main(String[] args) throws IOException {
        Document page = getPage();
        Element nameOfTournament = page.select("section[class=content]").first();
        Element date = nameOfTournament.select("p[class=match-date]").first();
        Elements time = nameOfTournament.select("td[class=time]");
        Elements firstTeam = nameOfTournament.select("td[class=left-team]");
        Elements score = nameOfTournament.select("td[class=score]");
        Elements secondTeam = nameOfTournament.select("td[class=right-team]");

        System.out.println(date.text());
















//        String date = "";
//        System.out.println("                      Турнир                   ");
//        System.out.println(                        date                     );
//        System.out.println("Время        Команда №1     Счет     Команда №2");

    }
}
