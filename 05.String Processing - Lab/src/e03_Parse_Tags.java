import java.util.Scanner;

public class e03_Parse_Tags {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String open = "<upcase>";
        String closed = "</upcase>";

        while (input.contains(open)) {
            int stardIndex = input.indexOf(open);
            int endIndex = input.indexOf(closed);
            String textToReplace = input.substring(stardIndex + open.length(), endIndex);
            String upperCaseText = textToReplace.toUpperCase();

            input = input.replaceFirst(textToReplace,upperCaseText);
            input = input.replaceFirst(open, "");
            input = input.replaceFirst(closed, "");
        }
        System.out.println(input);
    }
}
