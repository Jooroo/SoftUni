import java.util.Arrays;
import java.util.Scanner;

public class e06_Overlapping_Intervals {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] secondNums = new int[n];
        int[] firstNums = new int[n];
        boolean overlap = false;

        for (int i = 0; i < firstNums.length; i++) {

            int[] temp = Arrays.stream(scan.nextLine().split(",")).mapToInt(Integer:: parseInt).toArray();
            firstNums[i] = temp[0];
            secondNums[i] = temp[1];
        }
        for (int i = 0; i < firstNums.length - 1; i++)
        {
            for (int j = i + 1; j < firstNums.length; j++)
            {
                if (firstNums[i] > firstNums[j])
                {
                    int temp = firstNums[i];
                    int secTemp = secondNums[i];

                    firstNums[i] = firstNums[j];
                    secondNums[i] = secondNums[j];

                    firstNums[j] = temp;
                    secondNums[j] = secTemp;
                }
            }
        }
        for (int i = 0; i < secondNums.length - 1; i++) {
            if(secondNums[i] >= firstNums[i + 1]) {
                overlap = true;
            }
        }
        System.out.println(overlap);

    }
}
