import java.util.Arrays;
import java.util.Scanner;

public class e05_Chocolates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pacet = Integer.parseInt(scan.nextLine());
        int[] chocInPacet = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int studentNumber = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < chocInPacet.length - 1; i++) {
            for (int j = i + 1; j < chocInPacet.length; j++) {
                if (chocInPacet[i] > chocInPacet[j]) {
                    int temp = chocInPacet[i];
                    chocInPacet[i] = chocInPacet[j];
                    chocInPacet[j] = temp;
                }
            }
        }
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < chocInPacet.length + 1 - studentNumber; i++) {
            int tempDiff = chocInPacet[i + (studentNumber - 1)] - chocInPacet[i];
            if (tempDiff < minDiff) {
                minDiff = tempDiff;
            }
        }



        System.out.println("Min Difference is " + minDiff + ".");

    }
}

