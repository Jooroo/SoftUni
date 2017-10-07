import java.util.Arrays;
import java.util.Scanner;

public class e07_Find_the_Missing_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int[] numbers = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        numbers = sort(numbers);
        System.out.println(missingNumberSearch(numbers, length));
    }

    private static int missingNumberSearch(int[] numbers, int length) {
        int missingNumber = numbers.length + 1;
        if (numbers[numbers.length - 1] == length) {
             missingNumber = 1;
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] + 1 != numbers[i + 1]) {
                missingNumber = numbers[i] + 1;
            }
        }

        return missingNumber;
    }

    private static int[] sort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input;
    }
}


