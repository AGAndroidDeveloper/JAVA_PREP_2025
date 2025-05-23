package cardProgramme;

public class Card {
    private Suit suit;
    private int rank;
    private String face;


    @Override
    public String toString() {
        switch (suit) {
            case DIAMOND -> {
                return "9830";
            }
            case CLUB -> {

            }

            case HEART -> {

            }
            case SPADE -> {

            }
        }
        return "";
    }
}
