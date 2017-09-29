
import java.util.Scanner;


public class e01_Fill_the_Matrix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\,\\s+");

        int matrixLength = Integer.parseInt(input[0]);
        String fillPattern = input[1];

       if(fillPattern.equals("A")) {
            print(patternA(matrixLength));
       } else {
           print(patternB(matrixLength));
       }


    }

    private static int[][] patternB(int length) {
        int[][] matrix = new int[length][length];

        int counter = 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if(i % 2 == 0) {
                    matrix[j][i] = counter;
                }else {
                    matrix[matrix.length - 1 - j][i] = counter;
                }
                counter++;
            }
        }
        return matrix;
    }

    private static int[][] patternA(int length) {
        int[][] matrix = new int[length][length];

        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < length; j++) {
                if (j < 1) {
                    matrix[i - 1][j] = i ;
                } else {
                    matrix[i - 1][j] = matrix[i - 1][j - 1] + length;
                }
            }
        }
        return matrix;
    }

    private static void print (int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
