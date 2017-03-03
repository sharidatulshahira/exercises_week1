/**
Exercise 72.3
 * 
 */
package E72;

/**
 * @author SIsmail
 *
 */
public class Transfer {
	private double balance;

	
	
	
	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Transfer(double balance) {
		
		setBalance(balance);
	}


	public static void transfer (Transfer from, Transfer to, double howMuch){
		from.withdrawal(howMuch);
		to.deposit(howMuch);	
	}
	
	public double withdrawal(double withdraw){
		return balance -= withdraw;	
	}
	
	public double deposit (double deposit){
		return balance += deposit;
	}
	
	public String toString(){
		return   " " + balance;
		
	}

}
