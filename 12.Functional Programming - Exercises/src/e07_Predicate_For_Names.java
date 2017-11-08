import java.util.Scanner;
import java.util.function.Predicate;

public class e07_Predicate_For_Names {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        String[] names = scan.nextLine().split(" ");

        Predicate<Integer> length = n -> n <= num;

        for (String name:names) {
            if(length.test(name.length())) {
                System.out.println(name);
            }
        }
    }
}
