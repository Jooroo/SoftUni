import java.util.Scanner;

public class e03_Text_Filter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] bannedWords = scan.nextLine().split(", ");
        String input = scan.nextLine();

        for (String bannedWord: bannedWords) {
            String censored = new String(new char[bannedWord.length()]).replace('\0','*');
            input = input.replaceAll(bannedWord, censored);
        }

        System.out.println(input);
    }
}
