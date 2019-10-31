public class Card extends Object {
    private final String face;
    private final String suit;

    public Card(String face, String suit){
        this.face = face;
        this.suit = suit;
    }

    @Override
    public String toString(){
        return face + " of " + suit;
    }
}
