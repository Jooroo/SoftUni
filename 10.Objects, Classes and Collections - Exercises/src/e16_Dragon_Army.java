import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class e16_Dragon_Army {
    private static  int defDamage = 45;
    private static  int defHealth = 250;
    private static  int defArmor = 10;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        LinkedHashMap<String,TreeMap<String, int[]>> dragons = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split("\\s+");

            String type =line[0];
            String name =line[1];
            int damage = line[2].equals("null") ? defDamage : Integer.valueOf(line[2]);
            int health = line[3].equals("null") ? defHealth : Integer.valueOf(line[3]);
            int armor = line[4].equals("null") ? defArmor : Integer.valueOf(line[4]);

            dragons.putIfAbsent(type,new TreeMap<String, int[]>());
            dragons.get(type).put(name,new int[] {damage, health, armor});
        }

        for (Map.Entry<String, TreeMap<String, int[]>> allDragons : dragons.entrySet()) {
            calcAverage(allDragons.getValue(), allDragons.getKey());

            for (Map.Entry<String, int[]> currentDragon : allDragons.getValue().entrySet()) {
                System.out.println("-" + currentDragon.getKey() + " -> damage: " + currentDragon.getValue()[0]
                + ", health: " + currentDragon.getValue()[1] + ", armor: " + currentDragon.getValue()[2]);
            }
        }

    }

    private static void calcAverage(TreeMap<String, int[]> value, String color) {
        double averageDamage = 0;
        double averageHealth = 0;
        double averageArmor = 0;

        for (int[] ints : value.values()) {
            averageDamage += ints[0];
            averageHealth += ints[1];
            averageArmor += ints[2];
        }
        averageDamage /= value.size();
        averageHealth /= value.size();
        averageArmor /= value.size();

        System.out.printf("%s::(%.2f/%.2f/%.2f)%n",color, averageDamage, averageHealth, averageArmor);
    }
}
