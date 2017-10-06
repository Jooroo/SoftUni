import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class e05_Palindromes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("[, .?!]+");
        TreeSet<String> palindromes = new TreeSet<>();


        for (int i = 0; i < input.length; i++) {
            StringBuilder sb = new StringBuilder(input[i]);
            String reversed = sb.reverse().toString();
            if (input[i].equals(reversed) && !input[i].equals(" ")) {
                palindromes.add(input[i]);
            }
        }
        palindromes.toArray();

        System.out.println(palindromes);

    }

}
