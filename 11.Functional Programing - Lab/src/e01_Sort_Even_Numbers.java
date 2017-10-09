import java.util.*;
import java.util.stream.Collectors;

public class e01_Sort_Even_Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scan.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());

        input.removeIf(n -> n % 2 != 0);
        System.out.println(String.valueOf(input).replace("[","").replace("]", ""));
        Collections.sort(input);
        System.out.println(String.valueOf(input).replace("[","").replace("]", ""));
    }
}
