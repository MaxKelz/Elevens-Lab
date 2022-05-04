/**
 * This is a class that tests the Deck class.
 */
public class DeckTester
 {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *    @param args is not used.
     */
    public static void main(String[] args) {
        String[] deck1Rank = new String[]{"A", "B", "C"};
        String[] deck1Suits = new String[]{"Giraffes", "Lions"};
        int[] deck1PointValues = new int[]{2, 1, 6};
        Deck deck1 = new Deck (deck1Rank, deck1Suits, deck1PointValues);
        System.out.println(deck1.isEmpty());
        System.out.println(deck1.size());
        System.out.println(deck1);
        System.out.println(deck1.deal());
        System.out.println("=====================");
        
        String[] deck2Rank = new String[]{"Jack", "Queen", "King", "Ace"};
        String[] deck2Suits = new String[]{"Spades", "Hearts", "Diamonds"};
        int[] deck2PointValues = new int[]{11, 12, 13, 1};
        Deck deck2 = new Deck (deck2Rank, deck2Suits, deck2PointValues);
        System.out.println(deck2.isEmpty());
        System.out.println(deck2.size());
        System.out.println(deck2.deal());
        System.out.println(deck2.deal());
        System.out.println(deck2.deal());
        System.out.println(deck2);
        System.out.println("=====================");
        
        String[] deck3Rank = new String[]{"Queen", "King"};
        String[] deck3Suits = new String[]{"Clubs"};
        int[] deck3PointValues = new int[]{12, 13};
        Deck deck3 = new Deck (deck3Rank, deck3Suits, deck3PointValues);
        System.out.println(deck3.size());
        System.out.println(deck3.deal());
        System.out.println(deck3.deal());
        System.out.println(deck3.isEmpty());
        System.out.println(deck3);
        System.out.println("=====================");
 
        
    }
}
