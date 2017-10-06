import java.util.Scanner;

public class e02_Sum_Big_Numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String stringNumber1 = scan.nextLine();
        String stringNumber2 = scan.nextLine();

        StringBuilder sb = new StringBuilder();

        int longStringLength = Math.max(stringNumber1.length(), stringNumber2.length());

        stringNumber1 = stPading(stringNumber1, longStringLength);
        stringNumber2 = stPading(stringNumber2, longStringLength);

        int add = 0;
        for (int i = longStringLength - 1; i >= 0; i--) {
            int num1 = Integer.parseInt(stringNumber1.substring(i, i + 1));
            int num2 = Integer.parseInt(stringNumber2.substring(i, i + 1));
            int remainder = (num1 + num2 + add) % 10;

            sb.append(remainder);
            add = (num1 + num2 + add) / 10;

        }
        if (add > 0) {
            sb.append(add);
        }

        sb.reverse();

        System.out.println(sb);

    }

    private static String stPading(String st, int length) {
        StringBuilder pad = new StringBuilder();
        pad.append(st);
        if (st.length() < length) {
            int diff = length - st.length();
            while (diff > 0) {
                pad.insert(0, "0");
                diff--;
            }
        }

        return pad.toString();
    }
}
