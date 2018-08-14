/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {

		//Create objects
		Card test1 = new Card("queen", "diamonds", 13);
		Card test2 = new Card("queen", "diamonds", 13);
		Card test3 = new Card("seven", "spades", 7);

		//test if matches works

		//is true
		if(test1.matches(test2))
			System.out.println("test1 = test2");
		else
			System.out.println("test1 != test2");

		//is false
		if(test1.matches(test3))
			System.out.println("test1 = test3");
		else
			System.out.println("test1 != test3\n");

		//Test accessors
		System.out.println("test1 rank: " + test1.rank());
		System.out.println("test2 suit: " + test2.suit());
		System.out.println("test3 point value: " + test3.pointValue());

		//test toString
		System.out.println("\ntest1: " + test1.toString());
		System.out.println("test2: " + test2.toString());
		System.out.println("test3: " + test3.toString());


	}
}
