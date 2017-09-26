import java.util.Scanner;

public class e04_Calculate_Expression {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        double powerF1 = (num1 + num2 + num3) / Math.sqrt(num3);
        double powerF2 = num1 - num2;

        double f1 = Math.pow(((Math.pow(num1, 2) + Math.pow(num2, 2)) / (Math.pow(num1, 2) - Math.pow(num2, 2))), powerF1);
        double f2 = Math.pow((Math.pow(num1, 2) + Math.pow(num2, 2) - Math.pow(num3, 3)), powerF2);

        double avg1 = (num1 + num2 + num3) / 3;
        double avg2 = (f1 + f2) / 2;

        double diff = Math.abs(avg1 - avg2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",f1 ,f2 ,diff);
    }
}
