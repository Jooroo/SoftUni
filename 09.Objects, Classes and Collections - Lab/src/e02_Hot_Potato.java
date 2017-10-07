import java.util.ArrayDeque;
import java.util.Scanner;

public class e02_Hot_Potato {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] names = scan.nextLine().split(" ");
        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < names.length; i++) {
            queue.offer(names[i]);
        }

        while (queue.size() > 1) {
            for (int i = 0; i < n - 1; i++) {
                queue.offer(queue.peek());
                queue.remove();
            }
            System.out.println("Removed " + queue.peek());
            queue.remove();
        }
        System.out.println("Last is " + queue.peek());
    }
}
