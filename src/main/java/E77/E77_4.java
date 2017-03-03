/**
Exercise 77.4: Loading money to card
 * 
 */
package E77;

/**
 * @author SIsmail
 *
 */
public class E77_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercise77_lyyraCard card = new Exercise77_lyyraCard(10);
        System.out.println(card);

        card.loadMoney(15);
        System.out.println(card);

        card.loadMoney(10);
        System.out.println(card);

        card.loadMoney(200);
        System.out.println(card);

	}

}
