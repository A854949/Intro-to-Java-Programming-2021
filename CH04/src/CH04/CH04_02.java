//Geometry: great circle distance
package CH04;

import java.util.Scanner;

public class CH04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double radius = 6371.01;
		System.out.print("Enter point 1 (latitude and longtitude) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter point 2 (latitude and longtitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double x1radian = Math.toRadians(x1);
		double y1radian = Math.toRadians(y1);
		double x2radian = Math.toRadians(x2);
		double y2radian = Math.toRadians(y2);
		
		double d = radius * Math.acos(Math.sin(x1radian) * Math.sin(x2radian) + 
				Math.cos(x1radian) * Math.cos(x2radian) * Math.cos(y1radian - y2radian));
		System.out.print("The distance between the two points is " + d + " km");
		
	}

}
