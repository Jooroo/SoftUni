import java.util.HashMap;
import java.util.Scanner;

public class e06_Magic_Exchangeable_Words {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        if (input[0].length() > input[1].length()) {
            System.out.println(isExchangeable(input[1], input[0]));
        }
        else {
            System.out.println(isExchangeable(input[0], input[1]));
        }
    }

    private static boolean isExchangeable(String first, String second) {

        HashMap<Character, Character> store = new HashMap<>();

        StringBuilder firstWord = new StringBuilder();
        StringBuilder secondWord = new StringBuilder();

        for (int i = 0; i < first.length(); i++) {
            if(!firstWord.toString().contains(first.charAt(i) + "")) {
                firstWord.append(first.charAt(i));
            }
            if (store .containsKey(first.charAt(i))) {
                if (store.get(first.charAt(i)) != second.charAt(i)) {
                    return false;
                }
            }
            else {
                store.put(first.charAt(i), second.charAt(i));
            }
        }

        for (int i = 0; i < second.length(); i++) {
            if(!secondWord.toString().contains(second.charAt(i) + "")) {
                secondWord.append(second.charAt(i));
            }
        }

        return firstWord.length() == secondWord.length();
    }
}
