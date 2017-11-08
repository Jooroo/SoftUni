import java.util.*;
import java.util.stream.Collectors;

public class e03_Custom_Min_Function {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        System.out.println(Collections.min(input));

    }
}
