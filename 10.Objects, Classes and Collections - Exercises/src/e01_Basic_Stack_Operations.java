import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class e01_Basic_Stack_Operations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] commandInput = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbersInput = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int elementsToPush = commandInput[0];
        int elementsToPop = commandInput[1];
        int searchedNum = commandInput[2];

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < elementsToPush; i++) {
            stack.push(numbersInput[i]);
        }
        for (int i = 0; i < elementsToPop; i++) {
            stack.pop();
        }

        if (stack.contains(searchedNum)) {
            System.out.println("true");
        } else {
            if (stack.size() == 0) {
                System.out.println("0");
            } else {
                for (int i = 0; i < stack.size(); i++) {
                    if (stack.peek() <= minValue) {
                        minValue = stack.peek();
                    }
                    stack.pop();
                }
                System.out.println(minValue);
            }
        }
    }
}
