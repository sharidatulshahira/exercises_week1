/**
Exercise 77.5: Loading a negative amount
 * 
 */
package E77;

/**
 * @author SIsmail
 *
 */
public class E77_5 {

	
	public static void main(String[] args) {
			Exercise77_lyyraCard card = new Exercise77_lyyraCard(10);
	        System.out.println("Pekka: " + card);
	        card.loadMoney(-15);
	        System.out.println("Pekka: " + card);
	}

}
