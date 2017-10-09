import java.util.Scanner;
import java.util.function.Function;

public class e02_Sum_Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        Function <String, Integer> parser = x -> Integer.parseInt(x);
        int sum = 0;
        for (String num:input) {
            sum += parser.apply(num);
        }

        System.out.println("Count = " + input.length);
        System.out.println("Sum = " + sum);
    }
}
