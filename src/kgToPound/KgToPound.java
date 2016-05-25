package kgToPound;

import java.util.Scanner;

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
				System.out.println("Please enter the weight  in kilograms:");
				double userKilo = Validator.readValidInt();
				double LBSCon = userKilo * 2.2046;
				System.out.println(userKilo + " kilograms is equivalent to " + LBSCon + " pounds.");
			} else if (userSelect == 2) {
				System.out.println("Please enter the weight in pounds:");
				double userLbs = Validator.readValidInt();
				double KiloCon = userLbs/2.2046;
				System.out.println(userLbs + " pounds is equivalent to " + KiloCon+ " kilograms.");
			}

			choice = Validator.getString ("\nWould you like to convert another number? (y/n):\n");
		}
	//exit message
	System.out.println("Thanks for using the KgToPound Conversion App! Come back soon!");
	sc.close();
	}
}

