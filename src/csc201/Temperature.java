/**
 * 
 */
package csc201;
import java.util.*;
/**
 * @author AJALA
 *
 */
public class Temperature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Please enter C to convert a Fahrenheit temperature to Celsius -\r\n"
				+ "Or F to convert a Celsuis temperature to Fahrenheit.");
		System.out.println ("Enter Q to Quit the program.");
		Scanner input = new Scanner (System.in);
		String menu = input.next();
		
		if (menu != "C" || menu != "F" || menu != "Q") {
			System.out.println ("It is assumed you're converting a Celsius temperature to Fahrenheit.");
			menu = "F";
		}
		if (menu == "C")	{
			System.out.println ("Input the Fahrenheit temperature to convert: ");
			double temp = input.nextInt();
			System.out.println ("The Celsius equivalent of " + temp + " Fahrenheit is: ");
			System.out.println (5 * (temp - 32) / 9 + " degrees Celsius.");
		}
		
		else if (menu == "F") {
			System.out.println ("Input the Celsius temperature to convert: ");
			double temp = input.nextInt();
			System.out.println ("The Fahrenheit equivalent of " + temp + " degrees Celsius is: ");
			System.out.println (((9 * temp) / 5) + 32 + " Fahrenheit.");
		}
			
		else if (menu == "Q") {
			System.out.println ("Thank you for using the temperature converter.\r\nGoodbye!");
			input.close();
		}
		
		else {
			System.out.println ("It is assumed you're converting a Celsius temperature to Fahrenheit.");
			System.out.println ("Please enter a value: ");
			double temp = input.nextInt();
			System.out.println ("The Fahrenheit equivalent of " + temp + " degrees Celsius is: ");
			System.out.println (((9 * temp) / 5) + 32 + " Fahrenheit.");
		}

	}

}
