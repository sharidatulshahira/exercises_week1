/**
Exercise 82 (Main class)
 * 
 */
package E82;

/**
 * @author SIsmail
 *
 */
import java.util.ArrayList;
public class Exercise82 {

	
	public static void main(String[] args) {
		Exercise82_lotterynumber lottery = new Exercise82_lotterynumber();
		ArrayList<Integer> numbers = lottery.numbers();
		
		System.out.println("Lottery numbers: ");
		for(int num : numbers){
			System.out.print(num + " ");
		}
		
		System.out.print("");
	}

}
