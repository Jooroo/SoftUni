import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e15_Valid_Usernames {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("(?<=[\\/\\\\() ]|^)[a-zA-Z][a-zA-Z0-9_]{2,25}(?=[\\/\\\\() ]|$)");
        Matcher matcher = pattern.matcher(input);

        List<String> names = new ArrayList<>();

        while (matcher.find()) {
            names.add(matcher.group());
        }

        int maxLength = -1;
        int firstIndex = 0;

        for (int i = 0; i < names.size() - 1; i++) {
            int currentLength = names.get(i).length() + names.get(i + 1).length();

            if (currentLength > maxLength) {
                maxLength = currentLength;
                firstIndex = i;
            }

        }
        System.out.println(names.get(firstIndex));
        System.out.println(names.get(firstIndex + 1));

    }
}
