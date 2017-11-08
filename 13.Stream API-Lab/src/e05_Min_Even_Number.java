import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class e05_Min_Even_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Optional<Double> minNumber = Arrays.stream(scan.nextLine().split(" "))
                .filter(n -> !n.isEmpty())
                .map(Double::valueOf)
                .filter(n -> n % 2 == 0)
                .min(Double::compare);

        if (minNumber.isPresent()){
            System.out.printf("%.2f", minNumber.get());
        }
        else {
            System.out.println("No match");
        }
    }
}
