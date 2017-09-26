import java.util.Arrays;
import java.util.Scanner;

public class e13_Blur_Filter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long blur = Integer.parseInt(scan.nextLine());
        int[] matrixDim = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        long[][] photoMatrix = new long[matrixDim[0]][matrixDim[1]];

        for (int i = 0; i < matrixDim[0]; i++) {
            int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < matrixDim[1]; j++) {
                photoMatrix[i][j] = input[j];
            }
        }
        int[] blurCoordinates = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rowStart = Math.max(0, blurCoordinates[0] - 1);
        int rowEnd = Math.min(blurCoordinates[0] + 1, photoMatrix.length -1);
        int colStart = Math.max(0, blurCoordinates[1] - 1);
        int colEnd = Math.min(blurCoordinates[1] + 1, photoMatrix[0].length -1);

        for (int i = rowStart; i <= rowEnd; i++) {
            for (int j = colStart; j <= colEnd; j++) {
                photoMatrix[i][j] += blur;
            }
        }

        for (int i = 0; i < matrixDim[0]; i++) {
            for (int j = 0; j < matrixDim[1]; j++) {
                System.out.print(photoMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
