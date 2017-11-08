import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class e04_Average_of_Doubles {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> nums = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

        OptionalDouble avg = nums.stream()
                .filter(n -> !n.isEmpty())
                .mapToDouble(Double::valueOf)
                .average();

        if (avg.isPresent()) {
            System.out.printf("%.2f",avg.getAsDouble());
        }
        else {
            System.out.println("No match");
        }
    }
}
