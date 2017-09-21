import java.util.Scanner;

public class e09ByteParty {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            int b = Integer.parseInt(scan.nextLine());
            numbers[i] = b;
        }

        while(true) {
            String[] command = scan.nextLine().split("\\s+");

            if (command[0].equals("party")) {
                for (int number : numbers) {
                    System.out.println(number);
                }
                break;
            }
            int action = Integer.parseInt(command[0]);
            int position = Integer.parseInt(command[1]);

            switch(action) {
                case -1:
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = (numbers[i] ^ (1 << position));
                    }
                    break;
                case 0:
                    int mask = ~(1<<position);
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] & mask;
                    }
                    break;
                case 1:
                    int mask1 = 1<<position;
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] | mask1;
                    }
                    break;
            }
        }
    }
}
