import java.util.ArrayDeque;
import java.util.Scanner;

public class e03_Math_Potato {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] names = scan.nextLine().split(" ");
        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String name : names) {
            queue.offer(name);
        }
        int cycle = 0;
        while (queue.size() > 1) {

            for (int i = 0; i < n - 1; i++) {
                queue.offer(queue.peek());
                queue.remove();
            }
            cycle++;

            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            }
            else {
                System.out.println("Removed " + queue.peek());
                queue.remove();
            }

        }
        System.out.println("Last is " + queue.peek());
    }

    private static boolean isPrime(int num) {
        boolean prime = true;
        for (int p = 2; p < num; p++) {
            if (num % p == 0) {
                prime = false;
                break;
            }
        }
        if (num == 1){
            prime = false;
        }
        if (num == 2){
            prime = true;
        }

        return prime;
    }

}
