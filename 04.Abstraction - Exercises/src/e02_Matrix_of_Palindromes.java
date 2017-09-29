import java.util.Scanner;

public class e02_Matrix_of_Palindromes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();
        int col = scan.nextInt();

        char first = 'a';
        char second = 'a';
        char third = 'a';


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%c%c%c ",first + i, second + i + j, third + i);
            }
            System.out.println();
        }
    }
}
