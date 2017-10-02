import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e05_Vowel_Count {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern p = Pattern.compile("[aoueiyAOUEIY]");
        Matcher matcher = p.matcher(input);
        int count = 0;

        while (matcher.find()) {
            count++;
        }
        System.out.printf("Vowels: %d", count); }
}
