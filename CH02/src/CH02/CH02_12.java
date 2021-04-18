//計算跑道長度
package CH02;

import java.util.Scanner;

public class CH02_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter speed and acceleration: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		double length = Math.pow(v , 2) / (2 * a);
		//or double length = v * v / (2 * a);
		
		System.out.println("The minimum runway is " + length);
	
	}

}
