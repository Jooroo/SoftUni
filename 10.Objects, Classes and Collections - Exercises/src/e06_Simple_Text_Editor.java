import java.util.ArrayDeque;
import java.util.Scanner;

public class e06_Simple_Text_Editor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfOperations = Integer.parseInt(scan.nextLine());
        ArrayDeque<String> text = new ArrayDeque<>();
        String currentText = "";

        text.push(currentText);

        for (int i = 0; i < numberOfOperations; i++) {
            String[] input = scan.nextLine().split(" ");
            String command = input[0];

            switch (command) {
                case "1":
                    currentText = text.peek() + input[1];
                    text.push(currentText);
                    break;
                case "2":
                    int elementsToDelete = Integer.parseInt(input[1]);
                    int endIndex = text.peek().length() - elementsToDelete;
                    String deletedText = text.peek().substring(0,endIndex);
                    text.push(deletedText);
                    break;
                case "3":
                    int indexToPrint = Integer.parseInt(input[1]);
                    System.out.println(text.peek().charAt(indexToPrint - 1));
                    break;
                case "4":
                    text.pop();
                    break;
            }
        }
    }
}
