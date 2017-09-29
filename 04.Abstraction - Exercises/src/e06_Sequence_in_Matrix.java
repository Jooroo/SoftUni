import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class e06_Sequence_in_Matrix {

    private static List<String> tempResult = new ArrayList<>();
    private static List<String> finalResult = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] matrixSize = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String[][] matrix = new String[matrixSize[0]][matrixSize[1]];

        for (int i = 0; i < matrix.length; i++) {
            String line[] = scan.nextLine().split("\\s+");
            matrix[i] = line;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tryDiagonal(matrix, i, j);
                tryRow(matrix, i, j);
            }
        }

        System.out.println(finalResult.toString().replaceAll("[\\[\\]]", ""));


    }

    private static void tryRow(String[][] matrix, int row, int col) {
        tempResult.clear();
        tempResult.add(matrix[row][col].toUpperCase());
        for (int i = row; i < matrix.length - 1; i++) {
            if (matrix[i][col].equals(matrix[i + 1][col])) {
                tempResult.add(matrix[i][col].toUpperCase());
            } else {
                break;
            }
        }
        checkIfIsLongest();
    }

    private static void checkIfIsLongest() {
        if ( tempResult.size() >= finalResult.size()) {
            finalResult.clear();
            for (String st: tempResult) {
                finalResult.add(st.toLowerCase());
            }
        }
    }

    private static void tryDiagonal(String[][] matrix, int row, int col) {

        tempResult.clear();
        tempResult.add(matrix[row][col].toUpperCase());
        for (int i = row; i < Math.min(matrix.length - 1, matrix[row].length - 1); i++) {
            if (matrix[i][i].equals(matrix[i + 1][i + 1])) {
                tempResult.add(matrix[i][i].toUpperCase());
            } else {
                break;
            }
            checkIfIsLongest();
        }
    }
}