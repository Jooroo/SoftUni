import java.util.Arrays;
import java.util.Scanner;

public class e03_Sum_Matrix_Elements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int rows = input[0];
        int columns = input[1];

        int[][] matrix = new int[rows][columns];

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            int[] numsInput = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = numsInput[j];
                sum+=numsInput[j];
            }
        }

        System.out.println(rows);
        System.out.println(columns);
        System.out.println(sum);
    }
}
