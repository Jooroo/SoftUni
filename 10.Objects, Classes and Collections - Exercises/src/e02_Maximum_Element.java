import java.util.*;

public class e02_Maximum_Element {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scan.nextLine());
        ArrayDeque<Long> nums = new ArrayDeque<>();


        for (int i = 0; i < numberOfCommands; i++) {

            long[] commands = Arrays.stream(scan.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
            int command = (int)commands[0];

            switch (command) {
                case 1:
                    nums.push(commands[1]);
                    break;
                case 2:
                    nums.pop();
                    break;
                case 3:
                    long max = maxElement(nums);
                    System.out.println(max);
                    break;
            }
        }

    }

    private static long maxElement(ArrayDeque<Long> nums) {

        return Collections.max(nums);
    }
}
