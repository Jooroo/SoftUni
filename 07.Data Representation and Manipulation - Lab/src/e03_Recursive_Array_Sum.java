import java.util.Arrays;
import java.util.Scanner;

public class e03_Recursive_Array_Sum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int index = 0;
        System.out.println(sum(input,index));

    }

    private static int sum(int[] input, int index) {
        if (index == input.length - 1) {
            return input[index];
        }
        return input[index] + sum(input, index + 1);
    }


}
