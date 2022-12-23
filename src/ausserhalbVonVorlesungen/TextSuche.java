package ausserhalbVonVorlesungen;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TextSuche {
    public static void main(String[] args) {
        String text = " Hier ein kleiner Text .";
        String patternString = " ein .";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(" -> " + matcher.start() + " - " + matcher.end() + " ’" + text.substring(matcher.start(), matcher.end()) + "’");
        }
    }
}