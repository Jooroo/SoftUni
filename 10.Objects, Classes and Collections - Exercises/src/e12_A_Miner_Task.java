import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class e12_A_Miner_Task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        HashMap<String, Integer> resources = new HashMap<>();

        while (true) {
            String resource = scan.nextLine();
            if (resource.equals("stop")) {
                break;
            }
            int quantity = Integer.parseInt(scan.nextLine());

            if (!resources.containsKey(resource)) {
                resources.put(resource, quantity);
            }
            else {
                resources.replace(resource, resources.get(resource) + quantity);
            }
        }
        for (Map.Entry<String, Integer> res: resources.entrySet()) {
            System.out.println(res.getKey() + " -> " + res.getValue());
        }
    }
}
