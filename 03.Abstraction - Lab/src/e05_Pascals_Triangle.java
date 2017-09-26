import java.util.Scanner;

public class e05_Pascals_Triangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        long[][] triangle = new long[n][];

        for (int i = 0; i < n; i++) {
            triangle[i] = new long[i + 1];
            triangle[i][0] = 1;
            triangle[i][triangle[i].length - 1] = 1;
            for (int j = 1; j < triangle[i].length - 1; j++) {
                triangle[i][j] =  triangle[i -1 ][j - 1] + triangle[i - 1][j];
            }
        }
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < triangle[k].length; l++) {
                System.out.printf("%d ", triangle[k][l]);
            }
            System.out.println();
        }
    }
}
