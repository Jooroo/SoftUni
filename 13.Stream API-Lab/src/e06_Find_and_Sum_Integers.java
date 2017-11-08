import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;


public class e06_Find_and_Sum_Integers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Optional<Integer> sum = Arrays.stream(scan.nextLine().split("\\s+"))
                .filter(x -> isNumber(x))
                .map(Integer::parseInt)
                .reduce((x1, x2) -> x1 + x2);

        if (sum.isPresent()) {
            System.out.println(sum.get());
        }
        else {
            System.out.println("No match");
        }
    }

    private static boolean isNumber(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
