import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e16_Extract_Hyperlinks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        StringBuilder sb = new StringBuilder();

        while (!input.equals("END")) {
            sb.append(input);

            input =scan.nextLine();
        }

        Pattern pattern = Pattern.compile("<a\\s+([^>]+\\s+)?href\\s*=\\s*('([^']*)'|\"([^\\\"]*)|([^\\\\s>]+))[^>]*>");
        Matcher matcher = pattern.matcher(sb);

        while (matcher.find()) {
            int groupIndex = matcher.groupCount();
            while (matcher.group(groupIndex) == null) {
                groupIndex --;
            }
            String link = matcher.group(groupIndex);
            System.out.println(link);
        }
    }
}
