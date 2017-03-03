/**
Exercise 80: Rolling the dice
 * 
 */
package E80;

/**
 * @author SIsmail
 *
 */
import java.util.Random;
public class Exercise80_dice {
	private Random random;
	private int numberOfSides;

	public Exercise80_dice(int numberOfSides) {
		this.numberOfSides = numberOfSides;
		random = new Random();
	}
	
	

	public int roll(){
			numberOfSides = 6;
			numberOfSides= 1 + random.nextInt(6-1+1);
			return numberOfSides;
		
	}

}

//others way:
//if (numberOfSides != 7){
//numberOfSides = (int) ((Math.random() * (6 - 1)) + 1);
