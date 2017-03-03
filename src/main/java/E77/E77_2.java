/**
Exercise 77.2: Paying with card
 * 
 */
package E77;

/**
 * @author SIsmail
 *
 */
public class E77_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercise77_lyyraCard card = new Exercise77_lyyraCard(50);
        System.out.println(card);

        card.payEconomical();
        System.out.println(card);

        card.payGourmet();
        card.payEconomical();
        System.out.println(card);
	}

}
