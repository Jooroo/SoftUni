import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class e06_Academy_Graduation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        HashMap<String, Double> students = new HashMap<>();


        for (int i = 0; i < num; i++) {
            String name = scan.nextLine();
            double[] grades = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            double grade = 0.00;
            for (Double gr: grades) {
                grade += gr;
            }
            double avgGrade = grade / grades.length;

            students.put(name, avgGrade);
        }

        for (String st: students.keySet()) {
            System.out.println(st + " " + "is graduated with" + " " + students.get(st));
        }


    }
}
