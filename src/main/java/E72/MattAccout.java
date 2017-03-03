/**
Exercise 72.2
 * 
 */
package E72;

/**
 * @author SIsmail
 *
 */
public class MattAccout {
	private double balance;
	private String bankName;
	
	public MattAccout(String bankName,double balance){
		this.bankName=bankName;
		this.balance=balance;
	}

	public void mattAccount(double balance){
		this.balance=1000;	
	}
	
	public void myAcc (double balance){
		this.balance=0;
	}
	
	public double withdrawal(double withdraw){
		return balance -= withdraw;	
	}
	
	public double deposit (double deposit){
		return balance += deposit;
	}
	
	public String toString(){
		return  bankName+ " " + balance;
		
	}
	
	

}
