import java.math.BigInteger;
        import java.util.Scanner;

public class e08_Multiply_Big_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String num1 = scan.nextLine();
        String num2 = scan.nextLine();

        BigInteger result = new BigInteger(num1).multiply(new BigInteger(num2));
        System.out.println(result);
    }
}
