import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e01_Count_Substring_Occurrences {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();
        String pattern = scan.nextLine();

        int counter = 0;
        for (int i = 0; i <= inputText.length() - pattern.length(); i++) {
            if(inputText.substring(i, i + pattern.length()).toLowerCase().equals(pattern.toLowerCase()))
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
