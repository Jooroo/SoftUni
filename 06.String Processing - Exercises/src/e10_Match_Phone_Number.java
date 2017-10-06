import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e10_Match_Phone_Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("^\\+359( |-)[0-9]{1}\\1[0-9]{3}\\1[0-9]{4}$");

        while (!input.equals("end")){
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()) {
                System.out.println(input);
            }
            input = scan.nextLine();
        }
    }
}
