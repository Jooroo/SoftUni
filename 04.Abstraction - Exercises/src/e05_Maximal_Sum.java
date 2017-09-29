import java.util.Arrays;
import java.util.Scanner;

public class e05_Maximal_Sum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = input[0];
        int cols = input[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = numbers[j];
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;

        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                int currentSum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]
                        + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];

                if (currentSum > maxSum) {
                    startRow = i;
                    startCol = j;
                    maxSum = currentSum;
                }
            }
        }

        System.out.printf("Sum = %d\n", maxSum);
        System.out.printf("%d %d %d\n",matrix[startRow][startCol], matrix[startRow ][startCol + 1],
                matrix[startRow][startCol + 2]);
        System.out.printf("%d %d %d\n",matrix[startRow + 1][startCol], matrix[startRow + 1][startCol + 1],
                matrix[startRow + 1][startCol + 2]);
        System.out.printf("%d %d %d\n",matrix[startRow + 2][startCol], matrix[startRow + 2][startCol + 1],
                matrix[startRow + 2][startCol + 2]);

    }
}
