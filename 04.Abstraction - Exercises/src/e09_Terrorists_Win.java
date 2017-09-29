import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e09_Terrorists_Win {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("(?<bomb>\\|.*?\\|)");
        Matcher matcher = pattern.matcher(input);
        StringBuilder sb = new StringBuilder(input);

        while (matcher.find()) {
            String bomb = matcher.group("bomb");
            int power = calculateBombPower(bomb);
            int bombRangeStart = Math.max(0, matcher.start() - power);
            int bombRangeEnd = Math.min(matcher.end() + power,input.length());
            int replaceStringLength = bombRangeEnd - bombRangeStart;

            sb.replace(bombRangeStart,bombRangeEnd,replaceString(replaceStringLength));
        }
        System.out.println(sb);

    }

    private static String replaceString(int length) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < length; i++) {
            sb.append('.');
        }
        return sb.toString();
    }

    private static int calculateBombPower(String bomb) {
        int power = 0;
        for (int i = 1; i < bomb.length() - 1; i++) {
            power += bomb.charAt(i);
        }
        return power % 10;
    }
}
