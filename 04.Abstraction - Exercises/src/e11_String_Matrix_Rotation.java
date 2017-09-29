import java.util.*;

public class e11_String_Matrix_Rotation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] command = scan.nextLine().split("[\\(\\)]");
        int degrees = Integer.parseInt(command[1]);

        List<String> words = new ArrayList<>();

        String input = scan.nextLine();

        while (!input.equals("END")) {
            words.add(input);
            input = scan.nextLine();
        }
        int longestLength = findLongestWordLength(words);

        char[][] matrix = new char[words.size()][longestLength];

        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < longestLength; j++) {
                matrix[i][j] = ' ';
                try {
                    matrix[i][j] = words.get(i).charAt(j);
                } catch (IndexOutOfBoundsException es) {
                }

            }
        }

        if (degrees % 360 == 0) {
            for (char[] word : matrix) {
                System.out.println(word);
            }
        }
        else if (degrees % 360 == 180) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[matrix.length - 1 - i][matrix[i].length - 1 - j]);
                }
                System.out.println();
            }
        }
        else if (degrees % 360 == 90){
            for (int i = 0; i < longestLength; i++) {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    System.out.print(matrix[j][i]);
                }
                System.out.println();
            }
        }
        else if (degrees % 360 == 270){
            for (int i = 0; i < longestLength; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[j][longestLength - 1 - i]);
                }
                System.out.println();
            }
        }
    }

    private static int findLongestWordLength(List<String> words) {
        int longestWordLength = 0;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() > longestWordLength) {
                longestWordLength = words.get(i).length();
            }
        }
        return longestWordLength;
    }
}
