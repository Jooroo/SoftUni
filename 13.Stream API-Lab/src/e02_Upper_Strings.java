import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e02_Upper_Strings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> text = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

        text.stream().forEach(s -> System.out.print(s.toUpperCase() + " "));
    }
}
