import java.util.Scanner;

public class e09ExtractABitFromInteger {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int pos = scan.nextInt();

        int mask = number >> pos;
        int bit = mask & 1;

        System.out.println(bit);
    }
}
