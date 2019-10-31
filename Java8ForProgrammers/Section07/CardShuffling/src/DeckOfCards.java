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
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // create array of Card objects
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for(int counter=0; counter<NUMBER_OF_CARDS; counter++){
            deck[counter] = new Card(faces[counter%13], faces[counter/13]);
        }
    }

    // shuffle all cards
    public void shuffle(){
        currentCard = 0;

        // for each Card, pick another random Card (0-51) and swap them
        for(int first=0; first<deck.length; first++){
            // select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // swap current Card with randomly selected Card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard(){
        // determine whether Cards remain to be dealt
        if (currentCard<deck.length){
            return deck[currentCard++];
        } else {
            return null;
        }
    }
}
