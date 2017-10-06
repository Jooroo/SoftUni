import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class e02_Searching {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int searchedNum = Integer.parseInt(reader.readLine());
        int index = -1;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == searchedNum) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
