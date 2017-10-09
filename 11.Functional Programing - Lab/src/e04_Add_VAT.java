import java.util.Scanner;
        import java.util.function.Function;

public class e04_Add_VAT {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        Function<String, Double> vat = x -> Double.parseDouble(x) * 1.20;

        System.out.println("Prices with VAT:");

        for (String anInput : input) {
            System.out.println(String.format("%.2f", vat.apply(anInput)).replace(".", ","));
        }
    }
}
