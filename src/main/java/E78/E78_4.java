/**
Exercise 78.4: The second version of the clock
 * 
 */
package E78;

import java.util.Scanner;

/**
 * @author SIsmail
 *
 */
public class E78_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		Exercise78_boundedCounter seconds = new Exercise78_boundedCounter(59);	
		Exercise78_boundedCounter minutes = new Exercise78_boundedCounter(59);
		Exercise78_boundedCounter hours = new Exercise78_boundedCounter(23);
		
		
		System.out.print("seconds: ");
	    int s = scan.nextInt(); // read the initial value of seconds from the user
	    System.out.print("minutes: ");
	    int m = scan.nextInt();;// read the initial value of minutes from the user
	    System.out.print("hours: ");
	    int h = scan.nextInt();;// read the initial value of hours from the user

	    seconds.setValue(s);
	    minutes.setValue(m);
	    hours.setValue(h);

		
	    int i = 0;
	    while ( i < 121) {

	    		
	    		System.out.println(hours + ":" + minutes + ":" + seconds);
	    		Thread.sleep(1000); // put here the logic to advance your clock by one second
	        	seconds.next();
	        	seconds.getValue();
	        	if (seconds.getValue() == 0){
	        		minutes.getValue();
	        		minutes.next();
	        		if(minutes.getValue()==0){
	        			hours.getValue();
	        			hours.next();
	        		}
	        		
	    	} 
	        i++;
	    }

	}

}
