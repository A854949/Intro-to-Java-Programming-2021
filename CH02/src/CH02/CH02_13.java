//每月存入x元，計算本金+利息
package CH02;

import java.util.Scanner;

public class CH02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double rate = 3.75 / 100 / 12;
		
		System.out.println("Enter the monthly saving amount: ");
		double a = input.nextDouble();

		double firstMonth  = a * (1 + rate);
		double secondMonth = (a + firstMonth)  * (1 + rate);
		double thirdMonth  = (a + secondMonth) * (1 + rate);
		double forthMonth  = (a + thirdMonth)  * (1 + rate);
		double fifthMonth  = (a + forthMonth) * (1 + rate);
		double sixthMonth  = (a + fifthMonth) * (1 + rate);
		
		System.out.println("After the sixth month, the account value is " + sixthMonth);
	}

}
