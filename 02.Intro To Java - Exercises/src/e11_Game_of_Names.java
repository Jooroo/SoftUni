import java.util.Scanner;

public class e11_Game_of_Names {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int highScore = Integer.MIN_VALUE;
        String winnerName = "";

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            int score = Integer.parseInt(scan.nextLine());

            for (int j = 0; j < name.length(); j++) {
                int chNum = name.charAt(j);
                if (chNum % 2 == 0) {
                    score+= chNum;
                }
                else {
                    score -= chNum;
                }
            }
            if (highScore < score){
                highScore = score;
                winnerName = name;
            }
        }
        System.out.printf("The winner is %s - %d points",winnerName ,highScore);
    }
}
