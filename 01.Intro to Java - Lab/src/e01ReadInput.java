import java.util.Scanner;

public class e01ReadInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstWord = scan.next("\\w+");
        String secondWord = scan.next();
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();
        int thirdNum = scan.nextInt();
        scan.nextLine();
        String thirdWord = scan.nextLine();

        int sum = firstNum + secondNum + thirdNum;

        System.out.println(firstWord + " " + secondWord + " " + thirdWord + " " + sum);
    }
}
