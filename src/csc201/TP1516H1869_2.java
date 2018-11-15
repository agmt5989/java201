package csc201;
public class TP1516H1869_2 {
	
	public static void main (String args[]) {
		// Create two objects using the constructor
		Employee empOne = new Employee("James Smith");
		Employee empTwo = new Employee("Mary Anne");
		
		// Invoking methods for the above created objects
		empOne.empAge(26);
		empOne.empDesignation("Senior Software Engineer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		
		empTwo.empAge(21);
		empTwo.empDesignation("Software Engineer");
		empTwo.empSalary(500);
		empTwo.printEmployee();
	}
}
