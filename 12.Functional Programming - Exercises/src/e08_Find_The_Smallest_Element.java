import java.util.*;
        import java.util.function.Function;
        import java.util.stream.Collectors;

public class e08_Find_The_Smallest_Element {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> smallestElement =  n -> n.lastIndexOf(Collections.min(input));
        System.out.println(smallestElement.apply(input));
    }
}
