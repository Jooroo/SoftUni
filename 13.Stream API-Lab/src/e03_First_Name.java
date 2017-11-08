import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class e03_First_Name {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> namesList = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        HashSet<Character> letters = new HashSet<>();

        Stream.of(scan.nextLine().split("\\s+"))
                .map(l -> l.toLowerCase().charAt(0))
                .forEach(c -> letters.add(c));

        Optional<String> name = namesList.stream()
                .filter(s -> letters.contains(s.toLowerCase().charAt(0)))
                .sorted()
                .findFirst();

        if (name.isPresent()) {
            System.out.println(name.get());
        }
        else {
            System.out.println("No match");
        }
    }
}
