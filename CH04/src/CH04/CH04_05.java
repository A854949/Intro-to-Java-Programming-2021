//Geometry: area of a regular polygon
package CH04;

import java.util.Scanner;

public class CH04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of sides: ");
		int n = input.nextInt();
		
		System.out.println("Enter the side: ");
		double s = input.nextDouble();
		
		double area = n * s * s / (4 * Math.tan(Math.PI / n));
		System.out.println("The area of the polygon is " + area);
		
		}

}
