/**
 * Exercise 75.2: Value remains positive
 * 
 */
package E75;

/**
 * @author SIsmail
 *
 */
public class E75_2 {

	public static void main(String[] args) {
		Exercise75_decreasingCounter counter = new Exercise75_decreasingCounter(2);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

	}

}
