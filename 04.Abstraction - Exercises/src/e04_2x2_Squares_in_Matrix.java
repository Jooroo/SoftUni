import java.util.Arrays;
import java.util.Scanner;

public class e04_2x2_Squares_in_Matrix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       int[] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer:: parseInt).toArray();

       int rows = nums[0];
       int cols = nums[1];

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] input = scan.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input[j];
            }
        }

        int count = 0;

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                if (matrix[i][j].equals(matrix[i + 1][j]) && matrix[i][j].equals(matrix[i + 1][j + 1])
                        && matrix[i][j].equals(matrix[i][j + 1])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
