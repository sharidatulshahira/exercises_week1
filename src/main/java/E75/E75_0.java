/**
 * Exercise 75.0: Decreasing counter
 * 
 */
package E75;

/**
 * @author SIsmail
 *
 */
public class E75_0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercise75_decreasingCounter counter = new Exercise75_decreasingCounter(10);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

	}

}
