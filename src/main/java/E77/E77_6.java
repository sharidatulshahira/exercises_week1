/**
Exercise 77.6: Multiple cards
 * 
 */
package E77;

/**
 * @author SIsmail
 *
 */
public class E77_6 {

	
	public static void main(String[] args) {
		Exercise77_lyyraCard cardPekka = new Exercise77_lyyraCard(20);
		Exercise77_lyyraCard cardBrian = new Exercise77_lyyraCard(30);
		
				//(1)
				cardPekka.payGourmet();
		        System.out.println("Pekka: " + cardPekka);
		        
		        cardBrian.payEconomical();
		        System.out.println("Brian: " + cardBrian);
		        
		        //(2)
		        cardPekka.loadMoney(20);
		        System.out.println("Pekka: " + cardPekka);
		        
		        cardBrian.payGourmet();
		        System.out.println("Brian: " + cardBrian);
		        
		        //(3)
		        cardPekka.payEconomical();
		        cardPekka.payEconomical();
		        System.out.println("Pekka: " + cardPekka);
		        
		        cardBrian.loadMoney(50);
		        System.out.println("Brian: " + cardBrian);  

	}

}
