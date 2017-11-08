import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class e01_Take_Two {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        nums.stream().filter(n -> n >= 10 && n <= 20)
                .distinct()
                .limit(2)
                .forEach(n -> System.out.print(n + " "));

    }
}
