import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class e12_Vehicle_Park {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> vehicles = new ArrayList<>(Arrays.asList(scan.nextLine().split(" ")));

        String command = scan.nextLine();

        int count = 0;

        while (!command.equals("End of customers!")) {
            char vehicleType = Character.toLowerCase(command.charAt(0));
            int seats = Integer.parseInt(command.split(" ")[2]);

            String wantedVehicle = vehicleType+""+seats;
            int price = vehicleType * seats;

            if(vehicles.contains(wantedVehicle)) {
                System.out.printf("Yes, sold for %d$\n",price);
                vehicles.remove(vehicles.indexOf(wantedVehicle));
                count++;
            }
            else {
                System.out.println("No");
            }
            command = scan.nextLine();
        }
        System.out.println("Vehicles left: " + Arrays.toString(vehicles.toArray()).replaceAll("[\\[\\]]",""));
        System.out.printf("Vehicles sold: %d", count );
    }
}
