import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e14_Sum_of_All_Values {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String keyString = scan.nextLine();
        String textString = scan.nextLine();

        Pattern startPattern = Pattern.compile("^[a-zA-Z_]+(?=\\d)");
        Pattern endPattern = Pattern.compile("(?<=\\d)[a-zA-Z_]+$");
        Matcher startMatcher = startPattern.matcher(keyString);
        Matcher endMatcher = endPattern.matcher(keyString);

        String startKey = "";
        String endKey = "";

        if (startMatcher.find() && endMatcher.find()) {
            startKey = startMatcher.group();
            endKey = endMatcher.group();

            String regex = startKey + "[\\d.]+?" + endKey;
            Pattern digits = Pattern.compile(regex);
            Matcher digitsMatcher = digits.matcher(textString);
            double sum = 0;

            while (digitsMatcher.find()) {

                double value = Double.parseDouble(digitsMatcher.group()
                        .substring(startKey.length(), digitsMatcher.group().length() - endKey.length()));

                sum += value;
            }

            if (sum == 0) {
                System.out.println("<p>The total value is: <em>nothing</em></p>");
            } else {
                if (sum % 1 == 0) {
                    System.out.printf("<p>The total value is: <em>%.0f</em></p>", sum);
                } else {
                    System.out.printf("<p>The total value is: <em>%.2f</em></p>", sum);
                }
            }
        }
        else {
            System.out.println("<p>A key is missing</p>");
        }
    }
}
