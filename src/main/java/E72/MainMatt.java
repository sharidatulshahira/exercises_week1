/**
Exercise 72.2 (Main class)
In this exercise, we need to create a program that does the following:
	-Creates an account named "Matt's account" with the balance of 1000
	-Creates an account named "My account" with the balance of 0
	- 100.0 from Matt's account
	-Deposits 100.0 to My account
	-Prints both accounts
 * 
 */
package E72;

/**
 * @author SIsmail
 *
 */
public class MainMatt {

	
	public static void main(String[] args) {
		MattAccout mattAccount = new MattAccout("Matt's Account" ,1000.0);
		MattAccout myAcc = new MattAccout("My Account",0.0);
		
		System.out.println(mattAccount);
		System.out.println(myAcc);
		
		mattAccount.withdrawal(100.0);
		System.out.println(mattAccount);
		
		myAcc.deposit(100.0);
		System.out.println(myAcc);

	}

}
