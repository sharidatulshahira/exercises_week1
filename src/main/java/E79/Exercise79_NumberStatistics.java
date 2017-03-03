/**
Exercise 79 (class numberstatistics)
 * 
 */
package E79;

import java.util.ArrayList;

/**
 * @author SIsmail
 *
 */
public class Exercise79_NumberStatistics {
	
	private int amountOfNumbers;
	private int sum;
	private double average;
	private int number;
	

	
	public Exercise79_NumberStatistics()  {
		this.amountOfNumbers = amountOfNumbers;
		this.number = number;
		this.sum =sum;
		this.average = average;
		
		
	}

	public void addNumber(int number) {
		amountOfNumbers++;
		sum += number;
		average = (double) sum/amountOfNumbers();
	}
	

	public int amountOfNumbers(){
		return amountOfNumbers;	
	}

	public int sum(){
		return sum;
	}
	
	public double average(){
		return average;
		
	}
		
		
		
		
		
		
		
		
	
}
