//平方煥坪
package CH02;

import java.util.Scanner;

public class CH02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number in square meters:");
		double number = input.nextDouble();
		double ping = number * 0.3025;
		System.out.println(number + " square meters is " + ping + " pings");
	}

}
