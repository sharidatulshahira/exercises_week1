/**
Exercise 78.3: The first version of the clock
 * 
 */
package E78;

/**
 * @author SIsmail
 *
 */
public class E78_3 {

	
	public static void main(String[] args) {
		Exercise78_boundedCounter minutes = new Exercise78_boundedCounter(59);
		Exercise78_boundedCounter hours = new Exercise78_boundedCounter(23);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes);   // the current time printed
            	minutes.next();
            	minutes.getValue();
            	if (minutes.getValue() == 0){
            		hours.getValue();
            		hours.next();
            i++;
        }

        }
        
	}
}
