package csc201;

public class Exception {

	import java.util.Scanner;
	public static void main(String[] args) {
		int[] someArray = {12,9,3,11};
		int position = 0;

		try {
			position = getPosition ();
		} catch (java.lang.Exception e0) {
			System.out.println ("Wrong position indicated!");
		}
		try {
			display (someArray, position);
		} catch (InvalidPositionException e1) {
			exception.printStackTrace();
			System.out.println ("Unable to display Array!");
		}
		finally {
			System.out.println ("End of program");
		}
	}
	
	static int getPosition ()
	{
		System.out.println ("Enter array position to display");
		String positionEntered = EasyScanner.nextString(); // requires EasyScanner class
	}
	
	static void display (int[] arrayIn, int posting) throws InvalidPositionException
	{
		try {
			System.out.println ("Item at this position is " + arrayIn[posting]);
		} catch (InvalidPositionException e2) {
			if (exception != integer) {
				System.out.println ("Your index is not an integer!");
			}
			else {
				System.out.println ("This value is out of range!");
			}
		}
	}

	}

	public class InvalidPositionException {
		public static void main(String args[]){
			Scanner input = new Scanner.nextInt();
			getPosition = Scanner(System.in);
		}


	}
