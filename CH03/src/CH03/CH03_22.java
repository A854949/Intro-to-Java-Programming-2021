//Geometry: point in a circle
package CH03;

import java.util.Scanner;

public class CH03_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double d = Math.pow(x * x + y * y, 0.5);
		
		if (d <= 10)
			System.out.println("Point (" + x + "), " + y + " is in the circle");
		else
			System.out.println("Point (" + x + ", " + y + ") is not in the circle");
	}

}
