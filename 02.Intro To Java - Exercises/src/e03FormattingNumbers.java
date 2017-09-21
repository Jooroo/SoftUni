import java.util.Scanner;

public class e03FormattingNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        String hex = Integer.toHexString(num1).toUpperCase();
        String binary = Integer.toBinaryString(num1);

        while (binary.length() < 10) {
            binary = "0" + binary;
        }

        System.out.printf("|%-10s|",hex);
        System.out.printf("%10s|", binary);
        System.out.printf("%10.2f|", num2);
        System.out.printf("%-10.3f|", num3);
    }
}
