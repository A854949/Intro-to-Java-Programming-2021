package CH05;

import java.util.Scanner;

public class CH05_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount: ");
		String amountString = input.nextLine();
		
		int decimalPosition = amountString.indexOf('.');
		int numberOfOneDollars = 0;
		int numberOfQuarters = 0;
		int numberOfDimes = 0;
		int numberOfNickels = 0;
		int numberOfPennies = 0;
		
			
		
		int amount; // amount in cents
		
		if (decimalPosition == -1) {
			numberOfOneDollars = Integer.parseInt(amountString);
		}
		else {
			String fractionPart = amountString.substring(decimalPosition + 1);
			
			if (fractionPart.length() >= 2) {
				fractionPart = fractionPart.substring(0, 2);
			}
			else if (fractionPart.length() == 1) {
				fractionPart = fractionPart + "0";
			} 
			else {
				fractionPart = fractionPart + "00";
			}
		
			amount = Integer.parseInt(
				amountString.substring(0, decimalPosition) + fractionPart);
	
			int remainingAmount = amount;
			
			// Find the number of one dollars
			numberOfOneDollars = remainingAmount / 100;
			remainingAmount = remainingAmount % 100;
					
			// Find the number of quarters in the remaining amount
			numberOfQuarters = remainingAmount / 25;
			remainingAmount = remainingAmount % 25;

			// Find the number of dimes in the remaining amount
			numberOfDimes = remainingAmount / 10;
			remainingAmount = remainingAmount % 10;

			// Find the number of nickels in the remaining amount
			numberOfNickels = remainingAmount / 5;
			remainingAmount = remainingAmount % 5;

			// Find the number of pennies in the remaining amount
			numberOfPennies = remainingAmount;
		}


		// Display results
		System.out.println("Your amount " + amountString + " consists of \n" + 
			"\t" + numberOfOneDollars + " dollars\n" + 
			"\t" + numberOfQuarters + " quarters\n" +
			"\t" + numberOfDimes + " dimes\n" + 
			"\t" + numberOfNickels + " nickels\n" +
			"\t" + numberOfPennies + " pennies");
	}
}
