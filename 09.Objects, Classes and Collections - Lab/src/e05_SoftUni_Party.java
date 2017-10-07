import java.util.HashSet;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class e05_SoftUni_Party {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        TreeSet<String> guestList = new TreeSet<>();

        while (true) {
            String guest = scan.nextLine();

            if (!guest.equals("PARTY")) {
                guestList.add(guest);
            }
            else {
                break;
            }
        }
        while (true) {
            String guest = scan.nextLine();

            if (!guest.equals("END")) {
                guestList.remove(guest);
            }
            else {
                break;
            }
        }
        System.out.println(guestList.size());
        for (String guest : guestList) {
            System.out.println(guest);
        }

    }
}
