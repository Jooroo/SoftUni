import java.util.Scanner;



public class e01_Calculate_Triangle_Area_Method {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double base = scan.nextDouble();
        double height = scan.nextDouble();

        double area =calculatArea(base, height);

        print(area);
    }

    private static double calculatArea(double base, double height) {
        double area = (base * height) / 2;

        return area;
    }

    private  static  void print(double area) {
        System.out.printf("Area = %.2f", area);
    }
}
