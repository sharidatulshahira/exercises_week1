/**
Exercise 73 (Product class)
 * 
 */
package E73;

/**
 * @author SIsmail
 *
 */
public class Exercice73_Product {
	private String nameAtStart;
	private double priceAtStart;
	private int amountAtStart;

	
	public  Exercice73_Product (String nameAtStart, double priceAtStart, int amountAtStart){
		this.nameAtStart = "banana";
		this.priceAtStart = 1.1;
		this.amountAtStart = 13;
		
		

	}
	
	public void printProduct() {
		System.out.println(this.nameAtStart + " price " + this.priceAtStart + " amount " + this.amountAtStart);
		
	}
	
	

}
