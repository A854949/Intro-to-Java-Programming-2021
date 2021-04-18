//Compute the perimeter of a triangle
package CH03;

import java.util.Scanner;

public class CH03_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 edges for triangle: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double perimeter = a + b + c;
		
		if (a + b > c ^
			a + c > b ^
			b + c > a )
			System.out.println("The perimeter is " + perimeter);
		else
			System.out.println("The input is valid");
	}

}
