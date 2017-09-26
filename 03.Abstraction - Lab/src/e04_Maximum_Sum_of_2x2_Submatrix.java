import java.util.Arrays;
import java.util.Scanner;

public class e04_Maximum_Sum_of_2x2_Submatrix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int rows = input[0];
        int cols = input[1];

        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] numsInput = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = numsInput[j];
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers[0].length - 1; j++) {
                int currentSum = numbers[i][j] + numbers[i][j + 1] + numbers[i + 1][j] + numbers[i + 1][j + 1];

                if (currentSum > maxSum) {
                    startRow = i;
                    startCol = j;
                    maxSum = currentSum;
                }
            }
        }
        System.out.printf("%d %d\n",numbers[startRow][startCol], numbers[startRow ][startCol + 1]);
        System.out.printf("%d %d\n",numbers[startRow + 1][startCol], numbers[startRow + 1][startCol + 1]);
        System.out.println(maxSum);
    }
}
