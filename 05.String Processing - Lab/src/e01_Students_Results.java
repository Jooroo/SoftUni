import java.util.Scanner;

public class e01_Students_Results {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[]studentsInfo = scan.nextLine().split("-");
        String name = studentsInfo[0];
        String[] grades = studentsInfo[1].split(",");
        double javaAdv = Double.parseDouble(grades[0]);
        double javaOOP = Double.parseDouble(grades[1]);
        double advOOp = Double.parseDouble(grades[2]);
        double average = (javaAdv + javaOOP + advOOp) / 3;

        System.out.printf("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|\n","Name", "JAdv", "JavaOOP", "AdvOOP", "Average");
        System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",name,javaAdv,javaOOP,advOOp,average));

    }
}
