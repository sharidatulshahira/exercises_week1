/**
Exercise 79.1: Amount of numbers
 * 
 */
package E79;

/**
 * @author SIsmail
 *
 */
public class E79_1 {

	
	public static void main(String[] args) {
		Exercise79_NumberStatistics stats = new Exercise79_NumberStatistics();
	      stats.addNumber(3);
	      stats.addNumber(5);
	      stats.addNumber(1);
	      stats.addNumber(2);
	      System.out.println("Amount: " + stats.amountOfNumbers());

	}

}
