import java.math.BigInteger;
import java.util.Scanner;

public class e07ProductOfNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        BigInteger total = BigInteger.ONE;

        for (int i = num1; i <= num2 ; i++) {
            total = total.multiply(BigInteger.valueOf(i));
        }
        System.out.println("product[" + num1 + ".." + num2 + "] = " + total);
    }
}
