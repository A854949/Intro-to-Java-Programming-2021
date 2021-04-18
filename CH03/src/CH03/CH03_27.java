//Geometry: points in triangle
package CH03;

import java.util.Scanner;

public class CH03_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point's x- and y-coordinates: ");
		  double x = input.nextDouble();
		  double y = input.nextDouble();
		  double y2 = -x / 2 + 100;
		 
		 
		  // Check if y and x is in range and under the line
		System.out.print("The point is" + ((y > 0) && (x > 0) && (x + 2 * y < 200) 
				? " " : " not ") + "in the triangle");
	}

}
