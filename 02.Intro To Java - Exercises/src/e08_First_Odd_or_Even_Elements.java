import java.util.Arrays;
import java.util.Scanner;

public class e08_First_Odd_or_Even_Elements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] input = scan.nextLine().split(" ");

        int limit =Integer.parseInt(input[1]);
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (input[2].equals("odd") && count < limit){
                if (numbers[i] % 2 != 0 ){
                    System.out.print(numbers[i] + " ");
                    count ++;
                }
            }
            if (input[2].equals("even")){
                if (numbers[i] % 2 == 0 && count < limit){
                    System.out.print(numbers[i] + " ");
                    count ++;
                }
            }
        }
    }
}
