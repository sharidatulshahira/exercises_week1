/**
Exercise 71: Smart combining.
In this exercise we need to combine the item(numbers) in list2 into list1 but the numbers can be on list only once.
 * 
 */
package E71;

/**
 * @author SIsmail
 *
 */
import java.util.*;
public class Exercise71 {

	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(4);
		list1.add(3);
		list2.add(10);
		list2.add(7);

		list2.add(3);
		list2.add(10);
		list2.add(7);
		
		combine(list1,list2);
		System.out.println(list1);
		//System.out.println(list2);

	}

	public static void combine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		
				smartCombine(list1,list2);
				
				Collections.sort(list1);
				
		}

	public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		for (Integer x : list2) {
			if (!list1.contains(x)){
				list1.add(x);
				
//		list1.removeAll(list2);
//		list1.addAll(list2);
			}
		}
		

	}
		
}
