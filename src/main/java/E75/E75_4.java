/**
 * Exercise 75.4: Back to initial value
 * 
 */
package E75;

/**
 * @author SIsmail
 *
 */
public class E75_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercise75_decreasingCounter counter = new Exercise75_decreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();

	}

}
