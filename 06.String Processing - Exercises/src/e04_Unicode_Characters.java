import java.util.Scanner;

public class e04_Unicode_Characters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            sb.append(String.format("\\u%04x", (int)input.charAt(i)));
        }
        System.out.println(sb);
    }
}
