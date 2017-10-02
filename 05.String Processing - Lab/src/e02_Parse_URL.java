import java.util.Scanner;

public class e02_Parse_URL {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("://");
        try {
            String protocol = input[0];
            int serverEndIndex = input[1].indexOf("/");
            String server = input[1].substring(0, serverEndIndex);
            String resources = input[1].substring(serverEndIndex + 1, input[1].length());

            if (input.length == 2) {
                System.out.printf("Protocol = %s\n", protocol);
                System.out.printf("Server = %s\n", server);
                System.out.printf("Resources = %s", resources);
            } else {
                System.out.println("Invalid URL");
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Invalid URL");
        }
    }
}
