import java.util.Scanner;

public class e01_Rectangle_Area {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double sideA = scan.nextDouble();
        double sideB = scan.nextDouble();

        double area = sideA * sideB;

        System.out.printf("%.2f", area);
    }
}
