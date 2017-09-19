import java.math.BigDecimal;
        import java.util.Scanner;

public class e03EuroTrip {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double quantity = scan.nextDouble();

        BigDecimal exchangeRate = new BigDecimal("4210500000000");
        BigDecimal priceInLeva = new BigDecimal(quantity * 1.20);

        BigDecimal total = priceInLeva.multiply(exchangeRate);

        System.out.printf("%.2f marks", total);
    }
}
