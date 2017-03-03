/**
Exercise 75.1: Implementing method decrease()
 * 
 */
package E75;

/**
 * @author SIsmail
 *
 */
public class E75_1 {

	
	public static void main(String[] args) {
		Exercise75_decreasingCounter counter = new Exercise75_decreasingCounter(10);

        counter.printValue();
        
        counter.decrease();
        counter.printValue();
        
        counter.decrease();
        counter.printValue(); 
        
        counter.decrease();
        counter.printValue();

	}

}
