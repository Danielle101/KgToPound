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
			// calculate the users bmi baser on the height and weight input
			double bmi = ((weight * 703) / (height * height));
			//converts the bmi to single place decimal format
			DecimalFormat df = new DecimalFormat("####0.0");
		System.out.println("\nBased on your height of " + height + " inches and your weight of " + weight
					+ " pounds your bmi is " + df.format(bmi) + ".");
			// print out the users bmi category
		System.out.println("\nYour BMI indicates that you are:");
			getCategory(bmi);
			//close scanner
		    scan.close();

		}

		/**
		 * @param bmi
		 */

		// calculates the bmi category based on various bmi ranges
		public static void getCategory(double bmi) {
			if (bmi < 15) {
				System.out.println("very severely underweight");
			}
			if (bmi >= 15 && bmi <= 16) {
				System.out.println("severely underweight");
			}
			if (bmi >= 16.1 && bmi <= 18.4) {
				System.out.println("underweight");
			}
			if (bmi >= 18.5 && bmi <= 24.9) {
				System.out.println("underweight");
			}
			if (bmi >= 25 && bmi <= 29.9) {
				System.out.println("overweight");
			}
			if (bmi >= 30 && bmi <= 34.9) {
				System.out.println("moderately obese");
			}
			if (bmi >= 35 && bmi <= 39.9) {
				System.out.println("severely obese");
			}
			if (bmi >= 40.0) {
				System.out.println("very severely obese");
			}
			choice = Validator.getString ("\nWould you like to convert another number? (y/n):\n");
		}
	//exit message
	System.out.println("Thanks for using the KgToPound Conversion App! Come back soon!");
	sc.close();
	}
}

