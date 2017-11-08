import java.util.Scanner;
        import java.util.function.Consumer;

public class e01_Consumer_Print {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        Consumer<String> print = m -> System.out.println(m);

        for (String st: input) {
            print.accept(st);
        }
    }
}
