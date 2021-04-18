//Geometry: point in a rectengle? 
package CH03;

import java.util.Scanner;

public class CH03_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double d1 = Math.pow(Math.pow(x-1, 2), 0.5);
		double d2 = Math.pow(Math.pow(y-1, 2), 0.5);
		
		if (d1 <= 10 / 2 && d2 <= 5.0 / 2) 
			System.out.println("Point " + "(" + x + "," + y + ") is in the rectangle");
		else 
			System.out.println("Point " + "(" + x + "," + y + ") is not in the rectangle");
		
	}

}
