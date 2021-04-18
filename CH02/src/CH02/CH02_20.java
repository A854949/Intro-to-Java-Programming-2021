package CH02;

import java.util.Scanner;

public class CH02_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

		    // Obtain input
		    System.out.print("Enter balance and annual interest rate: ");
		    double balance = input.nextDouble();
		    double annualInterestRate = input.nextDouble();

		    double interest =  balance * annualInterestRate / 1200;

		    // Display output
		    System.out.println("The interest is " + (100* interest) / 100);

	}

}
