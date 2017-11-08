import java.util.*;

public class e09_Custom_Comparator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] even = Arrays.stream(input).filter(n -> n % 2 == 0).boxed().sorted(Integer::compareTo).mapToInt(n -> n).toArray();
        int[] odd = Arrays.stream(input).filter(n -> n % 2 != 0).boxed().sorted(Integer::compareTo).mapToInt(n -> n).toArray();

        System.out.print(Arrays.toString(even).replace("]","").replace(",", "")
                .replace("[", "") + " ");
        System.out.println(Arrays.toString(odd).replace("]","").replace(",", "")
                .replace("[", "") + " ");

    }
}
