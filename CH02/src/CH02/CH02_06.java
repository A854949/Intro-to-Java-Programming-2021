//將一個整數的每位數相乘
package CH02;

import java.util.Scanner;

public class CH02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
        System.out.println("Enter a number between 0 and 1000: ");
        // Read the input
        int integer = input.nextInt();
        // Extract digits (count begins from right to left)
        int digit1 = integer % 10;
        int digit2 = (integer / 10) % 10;
        int digit3 = ((integer / 10) / 10) % 10;
        // Add all digits and display sum
        int multiplication = digit1 * digit2 * digit3;
        System.out.println("The multiplication of the digits in " + integer + " is " + multiplication);
	}

}
