import org.w3c.dom.stylesheets.LinkStyle;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e07_Valid_Usernames {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern p = Pattern.compile("^[a-zA-Z0-9_\\-]{3,16}$");
        List<String> output = new ArrayList<>();

        while (!input.equals("END")) {
            Matcher match = p.matcher(input);

            if (match.find()) {
                output.add("valid");
            } else {
                output.add("invalid");
            }
            input = scan.nextLine();
        }
        if (output.contains("valid")) {
            output.forEach(System.out::println);
        }
    }
}
