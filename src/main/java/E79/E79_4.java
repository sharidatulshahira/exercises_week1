/**
Exercise 79.4: Many sums
 * 
 */
package E79;

import java.util.Scanner;

/**
 * @author SIsmail
 *
 */
public class E79_4 {

	
	public static void main(String[] args) {
		Exercise79_NumberStatistics stats = new Exercise79_NumberStatistics();
		Exercise79_NumberStatistics even = new Exercise79_NumberStatistics();
		Exercise79_NumberStatistics odd = new Exercise79_NumberStatistics();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number: ");
		int number = 0;
		
		while (true){
			 number = scan.nextInt();
			
			if (number>0){
				stats.addNumber(number);	
				
			}
			else if (number<0){
				System.out.println();
				break;
			}
			
			while (number%2==0){
				even.addNumber(number);	
				
				break;
			}
			
			while (number%2==1){
				odd.addNumber(number);
				
				break;
			}
			
		}
		System.out.println("sum: " + stats.sum());
		System.out.println("sum of even: " + even.sum());
		System.out.println("sum of odd: " + odd.sum());
		
		

	}

}
