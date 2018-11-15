/**
 * 
 */
package csc201;

/**
 * @author AJALA MICHAEL OORE-OFE
 *
 */
import java.util.*;
public class VendingMachine {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Printing user options
	char choice;
	int gum = 0;
	int choc = 0;
	int juice = 0;
	int pop = 0;
	// total = 0;
	System.out.println ("Welcome to this supermarket\r\n"
			+ "You can select from a variety of options: \r\n"
			+ "1. Get gum\r\n"
			+ "2. Get chocolate\r\n"
			+ "3. Get juice\r\n"
			+ "4. Get popcorn\r\n"
			+ "5. Display items in the shopping cart\r\n"
			+ "6. Quit\r\n");
	
	System.out.println ("No other input is allowed!");
	
	Scanner keyboard = new Scanner (System.in);
	
	do {

	choice = (char) keyboard.nextInt();

	switch (choice) {
	case 1 :
		System.out.println ("Please enjoy your gum.");
		gum ++;
		break;
	case 2 :
		System.out.println ("You can have your chocolate.");
		choc ++;
		break;
	case 3 :
		System.out.println ("Your juice is now ready.");
		juice ++;
		break;
	case 4 :
		System.out.println ("Please collect your popcorn.");
		pop ++;
		break;
	case 5 :
		System.out.println ("\r\nYOUR SHOPPING CART: ");

		if (gum != 0) 
			System.out.println (gum + " pieces of chewing of gum sold.");
		if (choc != 0) 
			System.out.println (choc + " bars of chocolate sold.");
		if (juice != 0) 
			System.out.println (juice + " cups of juice sold.");
		if (pop != 0) 
			System.out.println (pop + " packs of popcorn sold.");
		break;
	case 6 :
		System.out.println ("You selected exit.\r\nThank you for patronizing us. Please call again.");
		keyboard.close();
		
	
	}	// End switch
	
	}	// End do
	while (choice != 0);	// End do-while loop
	
	}	// End main	
}	// End VendingMachine Class