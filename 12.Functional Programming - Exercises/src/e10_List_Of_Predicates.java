import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class e10_List_Of_Predicates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number =Integer.parseInt(scan.nextLine());
        int[] testNumbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        BiPredicate<Integer, Integer> divisible = (a,b) -> a % b ==0;

        for (int i = 1; i <= number; i++) {
            boolean found = false;

            for (int num:testNumbers) {
                if (!divisible.test(i, num)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i + " ");
            }
        }
    }
}
