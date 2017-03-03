/**
Exercise 77 (class lyyraCard)
 * 
 */
package E77;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise77_lyyraCard {
	private double balance;
	
	public Exercise77_lyyraCard(double balanceAtStart){
		this.balance = balanceAtStart;
	}
	
	public String toString(){
		return "The Card has " + this.balance + " euros";	
		
	}
	
	public void payEconomical(){
		
		if(this.balance<5){	
		}
		else if (this.balance>=5){
			double payEconomical = 2.50;
			this.balance -= payEconomical;
		}
	}
	
	public  void payGourmet(){
		
		if (this.balance>=5){
			this.balance -= 4.0;
		}
		else if (this.balance<5){
		}
		
	}
	
	public void loadMoney (double amount){
		
		if(amount > 150){
			this.balance=150;	
		}
		
		else if (amount <= -1){
			
		}
		else if (this.balance<150){
			this.balance += amount;
		}
		
		
		
	}
		
}

	
		

	


