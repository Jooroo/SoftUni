import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e10_Semantic_HTML {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<StringBuilder> html = new ArrayList<>();

        String input = scan.nextLine();


        while (!input.equals("END")) {
            html.add(new StringBuilder(editInput(input)));

            input = scan.nextLine();
        }

        html.forEach(System.out::println);
    }

    private static String editInput(String line) {
        String closingRegEx =
                "^(?<padding>\\s*)?</div>\\s*?<!--\\s*(?<tag>main|header|nav|article|section|aside|footer)\\s*-->";
        Pattern closingPattern = Pattern.compile(closingRegEx);
        Matcher closingMatcher = closingPattern.matcher(line);

        if (closingMatcher.find()) {
            return String.format("%s</%s>",
                    closingMatcher.group("padding"),
                    closingMatcher.group("tag")
            );
        }

        String openingRegEx =
                "^(?<padding>\\s*)?<div\\s*?(?<before>\\s[^\\s].*?|)?\\s+(?:id|class)\\s*?=\\s*?" +
                        "\"(?<tag>main|header|nav|article|section|aside|footer)\"\\s*?(?<after>\\s[^\\s].*?|)?\\s*?>";
        Pattern openingPattern = Pattern.compile(openingRegEx);
        Matcher openingMatcher = openingPattern.matcher(line);

        if (openingMatcher.find()) {
            String attributes = String.format("%s%s",
                    openingMatcher.group("before"),
                    openingMatcher.group("after"))
                    .replaceAll("\\s+", " ");

            return String.format("%s<%s%s>",
                    openingMatcher.group("padding"),
                    openingMatcher.group("tag"),
                    attributes
            );

        }

        return line;
    }
}