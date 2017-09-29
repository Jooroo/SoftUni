import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class e10_Plus_Remove {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<char[]> originalMatrix = new ArrayList<>();
        List<char[]> copyMatrix = new ArrayList<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("END")) {
                break;
            }
            originalMatrix.add(input.toCharArray());
            copyMatrix.add(input.toUpperCase().toCharArray());
        }
        matrixManipulation(originalMatrix, copyMatrix);
        printMatrix(originalMatrix);

    }

    private static void printMatrix(List<char[]> originalMatrix) {
        for (char[] chArr : originalMatrix) {
            System.out.println(Arrays.toString(chArr).replaceAll("[\\[\\], \0]", ""));
        }
    }

    private static void matrixManipulation(List<char[]> originalMatrix, List<char[]> copyMatrix) {
        for (int i = 0; i < originalMatrix.size() - 2; i++) {
            for (int j = 0; j < originalMatrix.get(i).length; j++) {
                try {
                    char a = copyMatrix.get(i)[j];
                    char b = copyMatrix.get(i + 1)[j - 1];
                    char c = copyMatrix.get(i + 1)[j];
                    char d = copyMatrix.get(i + 1)[j + 1];
                    char e = copyMatrix.get(i + 2)[j];

                    if (a == b && a == c && a == d && a == e) {
                        originalMatrix.get(i)[j] = '\0';
                        originalMatrix.get(i + 1)[j - 1] = '\0';
                        originalMatrix.get(i + 1)[j] = '\0';
                        originalMatrix.get(i + 1)[j + 1] = '\0';
                        originalMatrix.get(i + 2)[j] = '\0';
                    }
                } catch (IndexOutOfBoundsException ex) {};
            }
        }
    }
}