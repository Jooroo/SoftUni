import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class e03_Count_Uppercase_Words {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        List<String> upperCaseWords = new ArrayList<>();

        Predicate<String> startsWithUpper = x -> Character.isUpperCase(x.charAt(0));
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            if (startsWithUpper.test(input[i])) {
                upperCaseWords.add(input[i]);
                count++;
            }
        }
        System.out.println(count);
        upperCaseWords.forEach(n -> System.out.println(n));
    }
}
