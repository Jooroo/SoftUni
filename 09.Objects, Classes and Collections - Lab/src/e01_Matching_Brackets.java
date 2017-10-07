import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class e01_Matching_Brackets {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(i);
            }
            else if (input.charAt(i) == ')'){
                int startIndex = stack.pop();
                String output = input.substring(startIndex, i + 1);

                System.out.println(output);
            }
        }

    }
}
