import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e09_Phone_Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        StringBuilder text = new StringBuilder();
        StringBuilder output = new StringBuilder();

        while (!input.equals("END")) {
            text.append(input);

            input = scan.nextLine();
        }

        Pattern pattern = Pattern.compile("(?<name>[A-Z][A-Za-z]*)[^+A-Z]*?(?<phoneNumber>\\+?\\d+[(\\d)/.\\-\\s]*\\d+)");
        Matcher matcher = pattern.matcher(text);

        output.append("<ol>");
        boolean matchIsFound = false;

        while (matcher.find()) {
            matchIsFound = true;
            String name = matcher.group("name");
            String phone = matcher.group("phoneNumber").replaceAll("[()/.\\-\\s]", "");
            output.append((String.format("<li><b>%s:</b> %s</li>",name ,phone)));
        }
        output.append("</ol>");

        if (matchIsFound) {
            System.out.println(output);
        }
        else {
            System.out.println("<p>No matches!</p>");
        }


    }
}
