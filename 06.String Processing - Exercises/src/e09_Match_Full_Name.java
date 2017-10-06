import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e09_Match_Full_Name {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern patern = Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");

        while (!input.equals("end")){
            Matcher matcher = patern.matcher(input);
            if(matcher.find()) {
                System.out.println(input);
            }
            input = scan.nextLine();
        }
    }
}
