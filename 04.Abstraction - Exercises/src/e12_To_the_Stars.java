import java.util.Scanner;

public class e12_To_the_Stars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] stars = new String[3][3];

        for (int i = 0; i < stars.length; i++) {
            String[] star = scan.nextLine().split(" ");
            for (int j = 0; j < stars[i].length; j++) {
                stars[i][j] = star[j];
            }
        }

        String[] shipPos = scan.nextLine().split(" ");
        int turns = Integer.parseInt(scan.nextLine());

        double shipPosX = Double.parseDouble(shipPos[0]);
        double shipPosY = Double.parseDouble(shipPos[1]);

        for (int i = 0; i <= turns ; i++) {
            boolean isStar = false;
            for (int j = 0; j < stars.length; j++) {
                double starposX = Double.parseDouble(stars[j][1]);
                double starposY = Double.parseDouble(stars[j][2]);

                if ((shipPosY >= starposY - 1) && (shipPosY <= starposY + 1) &&
                        (shipPosX >= starposX - 1) && (shipPosX <= starposX + 1)) {
                    System.out.println(stars[j][0].toLowerCase());
                    isStar = true;
                    break;
                }
            }
            if(!isStar){
                System.out.println("space");
            }

            shipPosY++;
        }
    }
}
