/**
 * 
 */
package csc201;
import java.util.*;

/**
 * @author AJALA
 *
 */
public class BankAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// This is the first, generic method I will be writing
		
		System.out.print("Enter a selection\r\n");		// This means to enter a selection
		System.out.print("A, B, C or X for the corresponding account types\r\n");	// Only those four letters are allowed
		System.out.println("Only capital letters are allowed!\r\n");
		
		String  choice;
		double principal;
		
		Scanner key_in = new Scanner(System.in);
		
		try {
			choice =  key_in.next();
		}
		finally {
			
		}
		System.out.println("Enter your deposit amount in numbers only: ");
		try {
			principal = key_in.nextDouble();  
		}
		finally {
			
		}
		
		System.out.println("Your earned intrest after one year is: ");
		
		switch (choice) {
		case "A" :
			System.out.println(principal * 1.5 * 1 / 100); break;
		case "B" :
			System.out.println(principal * 2.0 * 1 / 100); break;
		case "C" :
			System.out.println(principal * 1.5 * 1 / 100); break;
		case "X" : default :
			System.out.println(principal * 5.0 * 1 / 100);
		}
		key_in.close();
	}

}
