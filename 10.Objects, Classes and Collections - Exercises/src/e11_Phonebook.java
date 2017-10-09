import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class e11_Phonebook {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("-");

        HashMap<String, String> phonebook = new HashMap<>();

        while (!input[0].equals("search")) {
            String name = input[0];
            String number = input[1];

            phonebook.put(name, number);

            input = scan.nextLine().split("-");
        }

        String name = scan.nextLine();

        while (!name.equals("stop")) {

            if (phonebook.containsKey(name)) {
                System.out.println(name + " -> " + phonebook.get(name));
            }
            else {
                System.out.println("Contact " + name + " does not exist.");
            }
            name = scan.nextLine();
        }
    }
}
