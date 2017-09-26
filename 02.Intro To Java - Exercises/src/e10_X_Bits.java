import java.util.Scanner;

public class e10_X_Bits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbersArr = new int[8];

        for (int i = 0; i < 8; i++) {
            int num = Integer.parseInt(scan.nextLine());
            numbersArr[i] = num;
        }
        int mask = 7;   // 111
        int count = 0;

        for (int number = 0; number <= 5; number++) {
            for (int pos = 0; pos <= 28; pos++) {
                if ((( numbersArr[number] >> pos) & mask) == 5) {
                    if ((( numbersArr[number + 1] >> pos) & mask) == 2) {
                        if ((( numbersArr[number + 2] >> pos) & mask) == 5) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
