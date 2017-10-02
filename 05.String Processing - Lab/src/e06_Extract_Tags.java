import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e06_Extract_Tags {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Pattern p = Pattern.compile("<.*?>");

        while (!input.equals("END")) {
            Matcher match = p.matcher(input);
            while (match.find()) {
                System.out.println(match.group());
            }
            input = scan.nextLine();
        }


    }
}
