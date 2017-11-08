import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class e06_Reverse_And_Exclude {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int num = Integer.parseInt(scan.nextLine());

        int[] output = Arrays.stream(input).filter(n -> n % num != 0).toArray();

        for (int i = output.length - 1; i >= 0 ; i--) {
            System.out.print(output[i] + " ");
        }
    }
}
