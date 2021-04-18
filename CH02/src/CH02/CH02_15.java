//計算兩點間距離
package CH02;

import java.util.Scanner;
 
public class CH02_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double d = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		double distance = Math.pow(d, 0.5);
		
		System.out.println("The distance between two points is:  " + distance);
	
	}

}
