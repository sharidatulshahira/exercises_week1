/**
Exercise 81 (Main class)
 * 
 */
package E81;

/**
 * @author SIsmail
 *
 */
public class Program {

	
	public static void main(String[] args) {
		PasswordRandom randomizer = new PasswordRandom(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }

	

}
