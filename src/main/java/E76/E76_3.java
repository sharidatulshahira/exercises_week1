/**
Exercise 76.3: Clearing the menu
 * 
 */
package E76;

/**
 * @author SIsmail
 *
 */
public class E76_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exercise76_menu newMenu = new Exercise76_menu();
		
		
				newMenu.addmeal("Nasi Lemak");
				newMenu.addmeal("Nasi Ayam");
				newMenu.addmeal("Nasi Goreng");
				newMenu.addmeal("Nasi Goreng");


				
		
				newMenu.clearMenu("Nasi Lemak");
				newMenu.printMeal();

	}

}
