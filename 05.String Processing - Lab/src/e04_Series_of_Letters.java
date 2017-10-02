import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e04_Series_of_Letters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern p = Pattern.compile("([a-zA-Z])\\1*");
        Matcher matcher = p.matcher(input);

        StringBuilder sb = new StringBuilder();

        while (matcher.find()) {
            sb.append(matcher.group(1));
        }

        System.out.println(sb);
    }
}