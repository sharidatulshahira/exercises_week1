/**
exercise 72.3 (Main class)
This exercise is need to do money transfer 
from one person to another.
The main method does the following:
	-Creates an account "A" with the balance of 100.0
	-Creates an account "B" with the balance of 0.0
	-Creates an account "C" with the balance of 0.0
	-Transfers 50.0 from account A to account B
	-Transfers 25.0 from account B to account C
 * 
 */
package E72;

/**
 * @author SIsmail
 *
 */
public class AccountTransfer {

	public static void main(String[] args) {
		Transfer a = new Transfer(100.0);
		Transfer b = new Transfer(0.0);
		Transfer c = new Transfer(0.0);
		
		//System.out.println("<<<< : " + A.toString());
		
		
		Transfer.transfer(a, b, 50.0);
		Transfer.transfer(b, c, 25.0);
		
		System.out.println("A" + a);
		System.out.println("B" + b);
		System.out.println("C" + c);
		

	}


	

}
 