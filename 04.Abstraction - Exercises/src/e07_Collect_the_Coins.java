import java.util.Scanner;

public class e07_Collect_the_Coins {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[][] board = new char[4][];

        for (int i = 0; i < 4; i++) {
            char[] input = scan.nextLine().toCharArray();
            board[i] = new char[input.length];
            for (int j = 0; j < input.length; j++) {
                board[i][j] = input[j];
            }
        }
        char[] commands = scan.nextLine().toCharArray();


        int coins = 0;
        int wallsHit = 0;

        int currentPosX = 0;
        int currentPosY = 0;

        for (int i = 0; i < commands.length; i++) {

            int resPosX = currentPosX;
            int resPosY = currentPosY;
            try {
                if (commands[i] == '^') {
                    currentPosX = currentPosX - 1;
                    if (ifHitCoin(board, currentPosX, currentPosY)) {
                        coins++;
                    }

                } else if (commands[i] == 'V') {
                    currentPosX = currentPosX + 1;
                    if (ifHitCoin(board, currentPosX, currentPosY)) {
                        coins++;
                    }
                } else if (commands[i] == '>') {
                    currentPosY = currentPosY + 1;
                    if (ifHitCoin(board, currentPosX, currentPosY)) {
                        coins++;
                    }
                } else if (commands[i] == '<') {
                    currentPosY = currentPosY - 1;
                    if (ifHitCoin(board, currentPosX, currentPosY)) {
                        coins++;
                    }
                }
            } catch (IndexOutOfBoundsException exception) {
                currentPosX = resPosX;
                currentPosY = resPosY;
                wallsHit++;
            }
        }
        System.out.printf("Coins = %d\n", coins);
        System.out.printf("Walls = %d\n", wallsHit);
    }

    private static boolean ifHitCoin(char[][] matrix, int pos1, int pos2) {
        if (matrix[pos1][pos2] == '$') {
            return true;
        }
        return false;
    }
}
