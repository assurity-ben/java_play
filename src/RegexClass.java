import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^.*rity", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Assurity - we care");
        boolean matchFound = matcher.find();
        if(matchFound) {
            P.print("Match found");
        } else {
            P.print("Match not found");
        }
    }
}
