import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class e04_Parking_Lot {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        HashSet<String> carList = new HashSet<>();

        while (!input[0].equals("END")) {

            String direction = input[0];
            String carNumber = input[1];

            if (direction.equals("IN")) {
                carList.add(carNumber);
            } else {
                carList.remove(carNumber);
            }
            input = scan.nextLine().split(", ");
        }

        if (carList.isEmpty())

        {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String number : carList) {
                System.out.println(number);
            }
        }
    }
}

