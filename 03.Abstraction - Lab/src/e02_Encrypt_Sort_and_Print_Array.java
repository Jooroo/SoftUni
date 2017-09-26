import java.util.*;

public class e02_Encrypt_Sort_and_Print_Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.nextLine());
        
        Integer[] encrypted = new Integer[n];

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            encrypted[i] = encrypt(name);
        }

        print(encrypted);
    }

    private static Integer encrypt(String name) {
        List<Character> vowels = new ArrayList<>();
        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        int sum = 0;

        for (int i = 0; i < name.length(); i++) {
            if (vowels.contains(name.charAt(i))) {
                sum += name.charAt(i) * name.length();
            } else {
                sum += name.charAt(i) / name.length();
            }
        }
        return sum;
    }

    private static void print (Integer[] arrToPrint) {
        Arrays.sort(arrToPrint);

        for (int i = 0; i < arrToPrint.length; i++) {
            System.out.println(arrToPrint[i]);
        }
    }

}

