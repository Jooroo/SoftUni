import java.util.Scanner;

public class e02AverageOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double firstNum = scan.nextDouble();
        double secondNum = scan.nextDouble();
        double thirdNum = scan.nextDouble();

        double average = (firstNum + secondNum + thirdNum) / 3;

        System.out.printf("%.2f", average);
    }
}
