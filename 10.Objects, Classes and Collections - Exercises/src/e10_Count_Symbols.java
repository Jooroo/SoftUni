import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class e10_Count_Symbols {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        TreeMap<Character, Integer> occurrences = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            if (!occurrences.containsKey(text.charAt(i))) {
                occurrences.put(text.charAt(i), 0);
            }
            occurrences.replace(text.charAt(i),occurrences.get(text.charAt(i)) + 1);
        }

        for (Map.Entry<Character, Integer> occ: occurrences.entrySet()) {
            System.out.println(occ.getKey() + ": " + occ.getValue() + " time/s" );
        }
    }
}
