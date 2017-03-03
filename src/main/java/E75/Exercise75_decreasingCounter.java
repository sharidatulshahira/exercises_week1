/**
Exercise 75 (class decreasingCounter)
 * 
 */
package E75;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise75_decreasingCounter {
	private int value;

	
	public Exercise75_decreasingCounter (int valueAtStart) {
		value = valueAtStart;

	}
	
	public void printValue(){
		System.out.println("value: " + value);
	}
	
	public void decrease(){
		if (value > 0){
		value--;
	}
		else if (value <= 0){
			value=0;
		}
		
	}

	public void reset() {
		if (value <= 100){
			value = 0;
		}
		
	}
	
	

	public void setInitial() {
		value = 100;
		
	}

	

}
