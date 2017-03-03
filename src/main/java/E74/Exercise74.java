/**
Exercise 74 (Main class)
This program does the multiply operation.

 * 
 */
package E74;

/**
 * @author SIsmail
 *
 */
public class Exercise74 {

	
	public static void main(String[] args) {
		Exercise74_Multiplier threeMultiplier = new Exercise74_Multiplier(3);
		System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));

		Exercise74_Multiplier fourMultiplier = new Exercise74_Multiplier(4);
		System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));

//		System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
//		System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
	}

}
