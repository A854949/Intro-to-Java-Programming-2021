//公尺換英尺
package CH02;

import java.util.Scanner;

public class CH02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value for meter:");
		double meter = input.nextDouble();		
		double feet = meter * 3.2786;
		System.out.println(meter + " meters is " + feet + " feet");
		
	}

}
