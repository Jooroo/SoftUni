import java.util.Scanner;

public class e02_Triangle_Area {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int point1X = scan.nextInt();
        int point1Y = scan.nextInt();
        int point2X = scan.nextInt();
        int point2Y = scan.nextInt();
        int point3X = scan.nextInt();
        int point3Y = scan.nextInt();

        int area = Math.abs(((point1X * (point2Y - point3Y)) + (point2X * (point3Y - point1Y)) + (point3X * (point1Y - point2Y))) / 2);

        System.out.println(area);
    }
}
