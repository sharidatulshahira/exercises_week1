/**
Exercise 79.3: Asking for number
 * 
 */
package E79;

import java.util.Scanner;

/**
 * @author SIsmail
 *
 */
public class E79_3 {

	
	public static void main(String[] args) {
		Exercise79_NumberStatistics stats = new Exercise79_NumberStatistics();
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number: ");
		
		while (true){
			
			int number = 0;
			 number = scan.nextInt();
			
			if (number>0){
				stats.addNumber(number);	
				
			}
			else if (number<0){
				System.out.println();
				break;
			}
			
	}
		System.out.println("sum: " + stats.sum());
	}
	
}
