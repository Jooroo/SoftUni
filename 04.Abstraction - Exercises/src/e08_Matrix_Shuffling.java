import java.util.Arrays;
        import java.util.Scanner;

public class e08_Matrix_Shuffling {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] matrixDim = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer:: parseInt).toArray();

        int matrixLength = matrixDim[0];
        int matrixHeight = matrixDim[1];

        String[][] matrix = new String[matrixLength][matrixHeight];

        for (int i = 0; i < matrixLength; i++) {
            String[] input = scan.nextLine().split(" ");
            for (int j = 0; j < matrixHeight; j++) {
                matrix[i][j] = input[j];
            }
        }

        String[] commandInput = scan.nextLine().split(" ");

        while (!commandInput[0].equals("END")) {
            if (commandInput[0].equals("swap") && commandInput.length == 5) {
                String temp = "";

                    int firstWordX = Integer.parseInt(commandInput[1]);
                    int firstWordY = Integer.parseInt(commandInput[2]);
                    int secondWordX = Integer.parseInt(commandInput[3]);
                    int secondWordY = Integer.parseInt(commandInput[4]);
                try {
                    temp = matrix[firstWordX][firstWordY];

                    matrix[firstWordX][firstWordY] = matrix[secondWordX][secondWordY];
                    matrix[secondWordX][secondWordY] =  temp;

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }

                }catch (Exception exep) {
                    System.out.println("Invalid input!");
                }
            }else {
                System.out.println("Invalid input!");
            }
            commandInput = scan.nextLine().split(" ");
        }

    }
}
