/**
Exercise 79.2: Sum and average
 * 
 */
package E79;

/**
 * @author SIsmail
 *
 */
public class E79_2 {

	
	public static void main(String[] args) {
		Exercise79_NumberStatistics stats = new Exercise79_NumberStatistics();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());

	}

}
