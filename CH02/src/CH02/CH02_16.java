//計算六邊形面積
package CH02;

import java.util.Scanner;

public class CH02_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of the side:　");
		double side = input.nextDouble();
		
		double area = 3 * Math.pow(3, 0.5) / 2 * side * side;
		
		System.out.println("The area of the hexagon is " + area);
	}

}
