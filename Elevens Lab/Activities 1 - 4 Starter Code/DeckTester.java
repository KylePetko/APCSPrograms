/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"Giraffes", "Lions"};
		int[] values = {2, 1, 6};

		Deck cards = new Deck(ranks, suits, values);

		System.out.println("\nsize from accessor: " + cards.size() + "\n" + cards.toString());


		System.out.println("Card dealt: " + cards.deal());

		System.out.println("\nsize from accessor: " + cards.size() + "\n" + cards.toString());

		//deal all the cards
		cards.deal();
		cards.deal();
		cards.deal();
		cards.deal();
		cards.deal();


		//test isEmpty()
		if(cards.isEmpty())
			System.out.println("The deck IS empty");
		else
			System.out.println("The deck is NOT empty");

		//Test size() after all the cards are dealt
		System.out.println("The size of the empty deck is: " + cards.size());

		//test what happens when a card is dealt and there are no more cards left
		System.out.println("Card dealt: " + cards.deal());

	}
}
