import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class e05_Filter_By_Age {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        LinkedHashMap<String, Integer> peopleInfo = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(", ");
            String name = input[0];
            int age =Integer.parseInt(input[1]);

            peopleInfo.put(name, age);
        }

        String condition = scan.nextLine();
        int conditionAge = Integer.parseInt(scan.nextLine());
        String printCondition = scan.nextLine();

        Predicate<Integer> tester =  createTester(condition, conditionAge);
        Consumer<Map.Entry<String, Integer>> printer = createPrinter(printCondition);

        printFilteredInfo(peopleInfo, tester, printer);
    }

    private static void printFilteredInfo(LinkedHashMap<String, Integer> peopleInfo, Predicate<Integer> tester, Consumer<Map.Entry<String, Integer>> printer) {
        for (Map.Entry<String, Integer> person : peopleInfo.entrySet()) {
            if (tester.test(peopleInfo.get(person.getKey()))) {
                printer.accept(person);
            }
        }
    }

    private static Consumer<Map.Entry<String,Integer>> createPrinter(String printCondition) {
        switch (printCondition) {
            case "name age":
                return p -> System.out.printf("%s - %d%n",p.getKey(),p.getValue());
            case "name":
                return p -> System.out.printf("%s%n",p.getKey());
            case "age":
                return p -> System.out.printf("%d%n",p.getValue());
            default:
                return  null;
        }
    }

    private static Predicate<Integer> createTester(String condition, int conditionAge) {
        switch (condition) {
            case "younger":
                return x -> x < conditionAge;
            case "older":
                return x -> x >= conditionAge;
            default:
                return null;
        }
    }
}
