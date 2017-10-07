import java.util.Arrays;
import java.util.Scanner;

public class e01_Reverse_Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[]input = scan.nextLine().split(" ");

        reverseArr(input,0 ,input.length - 1);
        System.out.println(Arrays.toString(input).replaceAll("[,\\[\\]]",""));
    }

    private static void reverseArr(String[] input, int startIndex, int endIndex) {
        String temp = "";
        if(startIndex >= endIndex) {
            return;
        }
        temp = input[startIndex];
        input[startIndex] = input[endIndex];
        input[endIndex] = temp;
        reverseArr(input, startIndex + 1, endIndex - 1);
    }
}
