/**
Exercise 78.2: Printing the initial value
 * 
 */
package E78;

/**
 * @author SIsmail
 *
 */
public class E78_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercise78_boundedCounter counter = new Exercise78_boundedCounter(14);
		System.out.println("Value at start: " + counter );

        int i = 0;
        while ( i < 16){
            counter.next();
            System.out.println("value: " + counter );
            i++;
        }
    }

	

}
