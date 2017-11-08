import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e08_Bounded_Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> bounds = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers = numbers.stream()
                .filter(n -> n >= Math.min(bounds.get(0), bounds.get(1))
                         && n <= Math.max(bounds.get(0), bounds.get(1)))
                .collect(Collectors.toList());

        System.out.println(String.join(" ",numbers.toString().replaceAll("[\\[\\],]","")));
    }
}
