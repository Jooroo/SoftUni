import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e11_Replace_A_Tag {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        StringBuilder sb = new StringBuilder();

        while (!input.equals("END")) {
            sb.append(input);
            sb.append("\n");

            input = scan.nextLine();
        }

        Pattern pattern = Pattern.compile("<a href=(.+?)>([\\S\\s]+?)<\\/a>", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(sb);

        String replaceUrl = "[URL href=$1]$2[/URL]";
        String output = matcher.replaceAll(replaceUrl);
        System.out.println(output);


    }
}
