/**
Exercise 82: Lottery
 * 
 */
package E82;

/**
 * @author SIsmail
 *
 */
import java.util.ArrayList;

import java.util.Random;

public class Exercise82_lotterynumber {
	private ArrayList<Integer> numbers;
	private Random random=new Random();

	public Exercise82_lotterynumber() {
		this.numbers = new ArrayList<Integer>();
		//this.random = 
		this.drawNumbers();
	}

	public ArrayList<Integer> numbers() {
		return this.numbers;

	}

	private void drawNumbers() {
		int number = 0;
		while (number < 7) {
			// for(int i=1; i<numbers.size(); i++){
			int index = 1 + random.nextInt(39);
			if (!containsNumber(index)){
				numbers.add(index);
			number++;
			// number = numbers.get(index);
			}
		}
	}

	public boolean containsNumber(int number) {

		if (numbers.contains(number)) {
			return true;
		} else {
			return false;
		}

	}
}
