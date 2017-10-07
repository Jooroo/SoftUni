import java.util.Arrays;
import java.util.Scanner;


public class e03_Binary_Search {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int searchedNum = Integer.parseInt(scan.nextLine());

        System.out.println(binarySearch(numbers, searchedNum, 0, numbers.length - 1));

    }

    private static int binarySearch(int[] numbers, int searchedNum, int start, int end) {

        if (start > end) {
            return -1;
        }
        int middle = (end + start) / 2;

        if (searchedNum < numbers[middle]) {
            return binarySearch(numbers, searchedNum, start, middle -1);
        } else if (searchedNum > numbers[middle]) {
            return binarySearch(numbers, searchedNum, middle + 1, end);
        } else {
            return middle;
        }


    }
}
