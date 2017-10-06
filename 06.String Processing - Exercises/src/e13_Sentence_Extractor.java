import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e13_Sentence_Extractor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String keyWord = scan.nextLine();
        String text = scan.nextLine();

        String regex = "\\b[A-Z][^!?.]*?\\b" + keyWord + "\\b[^!?.]*?[.!?]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
