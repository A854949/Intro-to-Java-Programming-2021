//Cost of shipping
package CH03;

import java.util.Scanner;

public class CH03_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight of the package(in pounds): ");
		double w = input.nextDouble();	
		
		if (w <= 2)
			System.out.println("The shipping cost is $2.5");
		else if (w <= 4)
			System.out.println("The shipping cost is $4.5");
		else if (w <= 10)
			System.out.println("The shipping cost is $10");
		else if (w <= 20)
			System.out.println("The shipping cost is $20");
		else
			System.out.println("The package cannot be shipped");
	}

}
