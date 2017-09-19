import java.util.Scanner;

public class e05TransportPrice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int distance = Integer.parseInt(scan.nextLine());
        String timeOfTravel = scan.nextLine();

        double cost = 0;

        if (distance < 20){
            if(timeOfTravel.equals("day")){
                cost = 0.70 + (distance * 0.79);
            }else {
                cost = 0.70 + (distance * 0.90);
            }
        }else if (distance >= 20 && distance < 100){
            cost = distance * 0.09;
        }else {
            cost = distance * 0.06;
        }
        System.out.printf("%.2f", cost);
    }
}
