/**
 * Java source code for CSC201 Laboratory
 * Date: 25/10/2016
 * Venue: Telepresence Lab
 */
import java.util.*;

/**
 * @author AJALA MICHAEL OORE-OFE
 * @number TP15/16/H/1869
 *
 */
public class InterestAccountType {

	/**
	 * Now, the main method
	 */
	public static void main(String[] args) {
	    
		System.out.print("Select an account.\r\n");		// Allows the user to enter a selection
		System.out.print("Type A, B, C or X for the corresponding account type.\r\n");	// Four account types, four selections
		System.out.println("Please, use only upper case letters!\r\n");     // Only capital letters
		
		String  choice;         // variable for the one-character selection
		double principal;       // variable for the amount entered
		
		Scanner key_in = new Scanner(System.in);        // initiates a scanner object
		
		try {
			choice =  key_in.next();            // Fault tolerance
		}
		finally {
			
		}
		System.out.println("Enter your deposit amount in numbers only: ");
		try {
			principal = key_in.nextDouble();    // Fault tolerance
		}
		finally {
			
		}
		
		System.out.print("After one annum, the interest you earn on " + principal + " Naira is: ");
		/**
		 * Here comes the switch block
		 * It forces the user to account type X if something else is selected
		 * The code executes the simple interest formula
		 *      I == (P * R * T) / 100;
		 */
		switch (choice) {
		case "A" :
			System.out.print(principal * 1.5 * 1 / 100); break;   // Type A
		case "B" :
			System.out.print(principal * 2.0 * 1 / 100); break;   // Type B
		case "C" :
			System.out.print(principal * 1.5 * 1 / 100); break;   // Type C
		case "X" : default :
			System.out.print(principal * 5.0 * 1 / 100);          // Type X, or any other selection
		}
		System.out.print(" Naira.");
		
		key_in.close();
	}

}
