import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class e04_Find_Evens_or_Odds {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] size = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer:: parseInt).toArray();
        String searched = scan.nextLine();

        int[] numbers = new int[size[1] - size[0] + 1];
        int index = 0;

        for (int i = size[0]; i <= size[1]; i++) {
            numbers[index] = i;
            index++;
        }

        if (searched.equals("even")){
            printSearchedNums(numbers, 0);
        }
        else {
            printSearchedNums(numbers, 1);
        }

    }

    private static void printSearchedNums(int[] input, int i) {
        Predicate<Integer> isEven = n -> Math.abs(n % 2) == i;
        for (Integer num: input) {
            if (isEven.test(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
