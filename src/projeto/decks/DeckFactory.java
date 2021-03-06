package projeto.decks;

public class DeckFactory {

    /**
     * Um deck é contruído a partir do número passado
     * 1 - Demacia
     * 2 - Noxus
     * (...)
     */
    public static Deck obterDeck(int i){
        Deck deck = null;
        if(i == 1){
            deck = new Demacia("Demacia");
        } else if(i == 2) {
        	deck = new Noxus("Noxus");
        }
        // retorna outro tipo de deck
        return deck;
    }
}
