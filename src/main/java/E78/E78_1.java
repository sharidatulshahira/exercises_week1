/**
Exercise 78.1: Boundedcounter
 * 
 */
package E78;

/**
 * @author SIsmail
 *
 */
public class E78_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercise78_boundedCounter counter = new Exercise78_boundedCounter(4);
        System.out.println("Value at start: " + counter );

        int i = 0;
        while ( i < 10) {
            counter.next();
            System.out.println("Value: " + counter );
            i++;
        }
    }

	

}
