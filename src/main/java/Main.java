import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        Document page = siteConnection.getPage();
        Elements forName = page.select("section[class=content]");
        Elements names = forName.select("table[class=match-center-table]");
        Element date = forName.select("p[class=match-date]").first();
        Elements nameLine = names.select("tr");
        String stringDate = date.text();
        System.out.println("                 "+ defineRightDate.getRightDate(stringDate));
        int j =0;
        for(int i = 0; i < names.size(); i++){
            System.out.println("Время    Команда №1    Счет    Команда №2");
            do {
                Element row = nameLine.get(j);
                Elements cols = row.select("td");
                System.out.print(cols.get(0).text() + "  ");
                System.out.print(cols.get(1).text() + "  ");
                System.out.print(cols.get(2).text() + "  ");
                System.out.print(cols.get(3).text() + "  ");
                System.out.print(cols.get(4).text() + "  ");
                System.out.println("\n");
            }while(j<0);
            j++;
        }

    }
}
