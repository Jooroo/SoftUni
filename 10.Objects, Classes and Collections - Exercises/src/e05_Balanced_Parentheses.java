import java.util.ArrayDeque;
import java.util.Scanner;

public class e05_Balanced_Parentheses {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[] input = scan.nextLine().toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            char current = input[i];

            switch (current) {
                case '(':
                    stack.push(current);
                    break;
                case '{':
                    stack.push(current);
                    break;
                case '[':
                    stack.push(current);
                    break;
                case ')':
                    if (stack.size() > 0 && stack.peek().equals('(')) {
                        stack.pop();
                    }
                    else {
                        stack.push(current);
                    }
                    break;
                case '}':
                    if (stack.size() > 0 && stack.peek().equals('{')){
                        stack.pop();
                    }
                    else {
                        stack.push(current);
                    }
                    break;
                case ']':
                    if (stack.size() > 0 && stack.peek().equals('[')){
                        stack.pop();
                    }
                    else {
                        stack.push(current);
                    }
                    break;
            }
        }
        if (stack.size() > 0) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
