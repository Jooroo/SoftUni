import java.util.Scanner;

public class e07_Letters_Change_Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        double sum = 0.00;

        for (int i = 0; i < input.length; i++) {

            Character firstChar = input[i].charAt(0);
            Character lastChar = input[i].charAt(input[i].length() - 1);
            double num = Double.parseDouble(input[i].substring(1, input[i].length() - 1));

            if (firstChar.toString().toUpperCase().equals(firstChar.toString())) {
                sum += num / (firstChar - 64);
            }
            else {
                sum += num * (firstChar - 96);
            }

            if (lastChar.toString().toUpperCase().equals(lastChar.toString())) {
                sum -= (lastChar - 64);
            }
            else {
                sum += (lastChar - 96);
            }
        }
        System.out.printf("%.2f",sum);
    }
}
