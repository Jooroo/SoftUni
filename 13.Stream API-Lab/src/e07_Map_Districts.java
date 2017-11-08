import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class e07_Map_Districts {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> input = Arrays.asList(scan.nextLine().split("\\s+"));

        HashMap<String, List<Integer>> cities = new HashMap<>();

        for (String in: input) {
            String[] cityInfo = in.split(":");
            String city = cityInfo[0];
            int population = Integer.parseInt(cityInfo[1]);

            cities.putIfAbsent(city,new ArrayList<>());
            cities.get(city).add(population);
        }
        int limit = Integer.parseInt(scan.nextLine());

        cities.entrySet().stream().filter(populationFilter(limit))
                .sorted(descendingSort())
                .forEach(print());
    }
    private static Predicate<Map.Entry<String, List<Integer>>> populationFilter(int limit) {
        return a -> a.getValue()
                .stream()
                .mapToInt(Integer::valueOf)
                .sum() >= limit;
    }

    public  static Comparator<Map.Entry<String, List<Integer>>> descendingSort() {
        return (a,b) -> Integer.compare(
                b.getValue().stream().mapToInt(Integer::valueOf).sum(),
                a.getValue().stream().mapToInt(Integer::valueOf).sum()
        );
    }

    public static Consumer<Map.Entry<String, List<Integer>>> print() {
        return s -> {
            System.out.print(s.getKey() + ": ");
            s.getValue().stream()
                    .sorted((a, b)-> b.compareTo(a))
                    .limit(5)
                    .forEach(p -> System.out.print(p + " "));
            System.out.println();
        };
    }
}
