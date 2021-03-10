import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class defineRightDate {
    private static Pattern pattern = Pattern.compile("\\d{1,2}\\s\\D{3,8}");

    public static String getRightDate(String stringDate) throws Exception {
        Matcher matcher = pattern.matcher(stringDate);
        if(matcher.find()){
            return matcher.group();
        }
        throw new Exception("Cant extract date from string");
    }
}
