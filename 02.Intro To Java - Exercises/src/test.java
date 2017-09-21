import com.sun.deploy.util.StringUtils;
import com.sun.javafx.collections.IntegerArraySyncer;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //String input = Integer.toHexString(Integer.parseInt(scan.nextLine())).toUpperCase();
        //double d = Double.parseDouble(scan.nextLine());
        //String hex = Integer.toHexString(input);
        //input = String.format("%-10s",input);


        //System.out.printf("%-10s|",input);
        //System.out.printf("%10.2f|", d);
       // System.out.printf("%-10.3f|", d);

        int num1 = Integer.parseInt(scan.nextLine());
        String binary = Integer.toBinaryString(num1);
        System.out.println(binary);
        System.out.println(num1);

        num1 = num1 & (1 << 3);
        String binary2 = Integer.toBinaryString(num1);

        //System.out.println(binary);
        System.out.println(num1);
        System.out.println(binary2);
    }
}
