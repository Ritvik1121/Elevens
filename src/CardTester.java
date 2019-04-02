/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("four", "hearts", 4);
		Card card2 = new Card("five", "clubs", 5);
		Card card3 = new Card("four", "hearts", 4);
		Card card4 = new Card("ace", "spades", 1);

		System.out.println(card1.suit());
		System.out.println(card2.suit());
		System.out.println(card1.rank());
		System.out.println(card1.matches(card3));

		
	}
}
