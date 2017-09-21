import java.util.Scanner;

public class e07CharacterMultiplier {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[] first = scan.next().toCharArray();
        char[] second = scan.next().toCharArray();

        int total = 0;

        if (first.length == second.length) {
            for (int i = 0; i < first.length; i++) {
                total += first[i] * second[i];
            }
        }else {
            char[] shorter = (first.length < second.length) ? first : second;
            char[] longer = (first.length > second.length) ? first : second;

            for (int i = 0; i < shorter.length; i++) {
                total += shorter[i] * longer[i];
            }
            for (int i = shorter.length; i < longer.length; i++) {
                total += longer[i];
            }
        }
        System.out.println(total);
    }
}
