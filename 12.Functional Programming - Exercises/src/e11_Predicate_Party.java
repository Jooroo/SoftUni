import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class e11_Predicate_Party {

    private static Predicate<String> currentPredicate;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> input = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        String[] command = scan.nextLine().split("\\s+");

        while (!command[0].equals("Party!")) {

            String f = command[2];
            Predicate<String> length = s -> s.length() == Integer.parseInt(f);
            Predicate<String> startsWith = s -> s.startsWith(f);
            Predicate<String> endsWith = s -> s.endsWith(f);

            switch (command[1]) {
                case "Length":
                    currentPredicate = length;
                    break;
                case "StartsWith":
                    currentPredicate = startsWith;
                    break;
                case "EndsWith":
                    currentPredicate = endsWith;
                    break;
            }

            switch (command[0]) {
                case "Remove":
                    input.removeIf(currentPredicate);
                    break;
                case "Double":
                    int size =input.size();
                    for (int i = 0; i < size; i++) {
                        if (currentPredicate.test(input.get(i))) {
                            input.add(input.get(i));
                        }
                    }
            }
            command = scan.nextLine().split("\\s+");

        }
        if (input.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        }
        else {
            System.out.println(Arrays.toString(input.toArray())
                    .replace("]","").replace("[", "") + " are going to the party!");
        }


    }
}
