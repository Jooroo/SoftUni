import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class e03_Basic_Queue_Operations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] commandInput = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbersInput = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int elementsToPush = commandInput[0];
        int elementsToPop = commandInput[1];
        int searchedNum = commandInput[2];

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < elementsToPush; i++) {
            queue.add(numbersInput[i]);
        }
        for (int i = 0; i < elementsToPop; i++) {
            queue.poll();
        }

        if (queue.contains(searchedNum)){
            System.out.println("true");
        }
        else {
            if (queue.isEmpty()) {
                System.out.println(0);
            }
            else {
                int minValue = Integer.MAX_VALUE;
                for (Integer num:queue) {
                    if (num < minValue) {
                        minValue = num;
                    }
                }
                System.out.println(minValue);
            }
        }
    }
}
