//Binary to decimal
package CH04;

import java.util.Scanner;

public class CH04_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter binary value (0000 to 1111): ");
		int binary = input.nextInt();

		int a = binary / 1000;
		int b = binary % 1000 / 100;
		int c = binary % 100 / 10;
		int d = binary % 10;
		
		int decimal = (int)(a * Math.pow(2, 3) + b * 2 * 2 + c * 2 + d);
		
		System.out.println("Enter binary value (0000 to 1111): " + decimal);
	}

}
