/**

Exercise 72.1: We need to creates an account with the balance of 100.0, deposits 20.0 and print account
 * 
 */
package E72;

/**
 * @author SIsmail
 *
 */
public class Account {
	private double balance;
	private double deposit;
	private String bankName;
	public double withdrawal;;

	
	public Account (String bankName, double balance){
		this.balance=balance;
		this.bankName = bankName;
		
	}
	
	public String toString(){
		return bankName + " " + balance;
		
	}
	
	public  void bartosAccount(String bankName, double balance){
//		balance=100.0;
//		bankName = "bartos";
		
	}
	
	public void bartosSwissAccount(String bankName, double balance){
//		balance=100.0;
//		bankName = "bartos";
		
	}
	
	public double withdrawal(double withdrawal){
		return balance -= withdrawal;	
	}
	
	public double balance (){
		return balance -= deposit;
	}
	
	public double deposit(double deposit){
		return balance += deposit;
	}


}
