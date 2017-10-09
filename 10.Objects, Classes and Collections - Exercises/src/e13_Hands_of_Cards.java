import java.util.*;

public class e13_Hands_of_Cards {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(":");
        LinkedHashMap<String, HashSet<String>> players = new LinkedHashMap<>();

        while (!input[0].equals("JOKER")) {
            String name = input[0];
            HashSet<String> cards = new HashSet<>();
            String[] allCards = input[1].trim().split(", ");
            Collections.addAll(cards, allCards);

            if (!players.containsKey(name)){
                players.put(name, cards);
            }
            else {
                for (String card: cards) {
                    if (!players.get(name).contains(card)) {
                        players.get(name).add(card);
                    }
                }
            }
            input = scan.nextLine().split(":");
        }

        for (String player:players.keySet()) {
            int sum = 0;
            for (String card : players.get(player)) {
                sum += cardValue(card);
            }
            System.out.println(player + ": " + sum);
        }
    }

    private static int cardValue(String card) {
        List<String> type = Arrays.asList("0","C","D","H","S");
        List<String> cardsValues = Arrays.asList("0","1","2","3","4","5","6","7","8","9","10","J","Q","K","A");

        String cardValue = card.substring(0,card.length() - 1);
        String cardType = card.substring(card.length() - 1);

        return type.indexOf(cardType) * cardsValues.indexOf(cardValue);
    }
}
