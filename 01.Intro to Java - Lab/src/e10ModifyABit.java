import java.util.Scanner;

public class e10ModifyABit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int position = scan.nextInt();
        int bitValue = scan.nextInt();

        int mask = 0;
        int result = 0;

        if(bitValue == 0){
            mask = ~(1 << position);
            result = number & mask;
        }else {
            mask = 1 << position;
            result = number | mask;
        }
        System.out.println(result);
    }
}
