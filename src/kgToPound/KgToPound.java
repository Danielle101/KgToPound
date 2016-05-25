package kgToPound;

import java.util.Scanner;

import inchConverter.Validator;

public class KgToPound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		// welcome message
		System.out.println("Welcome to the KG to LBS conversion app!");
		// ask for user input
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Would you like to convert kilograms to pounds or pounds to kilograms?\n");
		//conversion selection menu
			System.out.println("Selection Menu:\n1 for Kilograms to Pounds\n2 for Pounds to Kilograms");
			System.out.println("\nPlease enter a number (1 or 2):");
			int userSelect = Validator.getValidInt(1, 2);
			if (userSelect == 1) {
				System.out.println("Please enter your measurement in kilograms:");
				double userKilo = Validator.readValidInt();
				double LBSCon = userKilo * 2.2;
				System.out.println(userKilo + " kilograms is equivalent to " + LBSCon + " pounds.");
			
	}

}
}
