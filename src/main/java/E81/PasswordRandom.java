/**
Exercise 81: Password randomizer
 * 
 */
package E81;

/**
 * @author SIsmail
 *
 */
import java.util.Random;
public class PasswordRandom {
	
	private int length;
	private Random random;

	
	public PasswordRandom (int length) {
		this.length = length;   //initialize length
		random = new Random();	//initialize random datatype
	}
	
	public String createPassword(){
		
	
		int number = 17;	
		String password = "";
		
		for (int i=1; i<length; i++){
			number = random.nextInt(25);
			char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
			password += symbol;						
		}
		
		return password;
		
	}

}
