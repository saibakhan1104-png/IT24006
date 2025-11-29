import java.util.Random;

public class GamePickACard {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random card number from 0 to 51
        int cardNumber = random.nextInt(52);

        // Determine rank and suit
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        // Rank: remainder of cardNumber / 13
        String rank = ranks[cardNumber % 13];
        // Suit: cardNumber / 13
        String suit = suits[cardNumber / 13];

        // Display the card
        System.out.println("The card you picked is " + rank + " of " + suit + ".");
    }
}
