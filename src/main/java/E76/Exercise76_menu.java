/**
Exercise 76 (class Menu)
 * 
 */
package E76;

import java.util.ArrayList;

/**
 * @author SIsmail
 *
 */

public class Exercise76_menu {
	public ArrayList<String> meals;

	
	public Exercise76_menu() {
		this.meals = new ArrayList<String>();
	}
	
	
	public void addmeal(String meal){
//		for (String stringMeal : meals){
	if (!meals.contains(meal)){
		this.meals.add(meal);
	}
		
	}
	
	public void printMeal(){
		for (String newstringMeal : meals){
		//	if (!meals.contains(newstringMeal)){
				System.out.println(newstringMeal);
		}
		
		
	}


	
	
	public void clearMenu(String meal){
		this.meals.remove(meal);
	}

}
