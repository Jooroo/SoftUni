import java.util.Arrays;
import java.util.Scanner;

public class e03_Diagonal_Difference {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer:: parseInt).toArray();
            for (int j = 0; j < n; j++) {
                matrix[i][j] = numbers[j];
            }
        }
        int diagonalOne = 0;
        int diagonalTwo = 0;

        for (int i = 0; i < n; i++) {
            diagonalOne += matrix[i][i];
            diagonalTwo += matrix[i][n - 1 -i];
        }
        int diff = Math.abs(diagonalOne - diagonalTwo);

        System.out.println(diff);
    }
}
