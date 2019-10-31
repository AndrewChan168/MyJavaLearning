import java.security.SecureRandom;

public class DeckOfCards {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;

    // random number generator
    private static final SecureRandom randomNumbers= new SecureRandom();

    // constructor fills deck of Cards
    public DeckOfCards(){
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five",  "Seven",
                "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

        
    }

}
