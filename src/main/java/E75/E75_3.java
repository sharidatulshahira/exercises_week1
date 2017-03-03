/**
Exercise 75.3: Counter reset
 * 
 */
package E75;

/**
 * @author SIsmail
 *
 */
public class E75_3 {

	
	public static void main(String[] args) {
		Exercise75_decreasingCounter counter = new Exercise75_decreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrease();
        counter.printValue();

	}

}
