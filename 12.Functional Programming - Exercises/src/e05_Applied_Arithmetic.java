import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class e05_Applied_Arithmetic {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long[] input = Arrays.stream(scan.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();

        String command = scan.nextLine().toLowerCase();


        while (!command.equals("end")){
            switch (command){
                case "add":
                    input = Arrays.stream(input).map(n -> n + 1).toArray();
                    break;
                case "multiply":
                    input = Arrays.stream(input).map(n -> n * 2).toArray();
                    break;
                case "subtract":
                    input = Arrays.stream(input).map(n -> n - 1).toArray();
                    break;
                case "print":
                    System.out.println(Arrays.toString(input).replaceAll("[\\[\\],]", ""));
            }
            command = scan.nextLine().toLowerCase();
        }


    }
}
