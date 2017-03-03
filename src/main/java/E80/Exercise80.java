/**
Exercise 80 (Main class)
 * 
 */
package E80;

/**
 * @author SIsmail
 *
 */
public class Exercise80 {

	
	public static void main(String[] args) {
		Exercise80_dice dice = new Exercise80_dice(6);

        int i = 0;
        while ( i < 10 ) {
            System.out.println( dice.roll() );
            i++;
        }

	}

}
