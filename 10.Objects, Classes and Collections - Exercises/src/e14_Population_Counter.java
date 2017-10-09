import java.util.LinkedHashMap;
import java.util.Scanner;

public class e14_Population_Counter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        LinkedHashMap<String, Long> countries = new LinkedHashMap<>();
        LinkedHashMap<String, LinkedHashMap<String, Long>> countriesCities = new LinkedHashMap<>();

        while (!input.equals("report")) {

            String[] current = input.split("\\|");

            String city = current[0];
            String country = current[1];
            long population = Long.parseLong(current[2]);

            countries.putIfAbsent(country, 0L);
            countries.put(country,countries.get(country) + population);

            countriesCities.putIfAbsent(country, new LinkedHashMap<>());

            countriesCities.get(country).putIfAbsent(city,0L);
            countriesCities.get(country).put(city,countriesCities.get(country).get(city) + population);

            input = scan.nextLine();
        }

        countriesCities.entrySet().stream()
                .sorted((c1, c2) -> countries.get(c2.getKey()).compareTo(countries.get(c1.getKey())))
                .forEach(country -> {
                        System.out.println(String.format("%s (total population: %d)",country.getKey(),countries.get(country.getKey())));
                        country.getValue().entrySet().stream().sorted((ci1,ci2) -> ci2.getValue().compareTo(ci1.getValue()))
                                .forEach(city -> System.out.println(String.format("=>%s: %d", city.getKey(), city.getValue())));
                });
    }
}
