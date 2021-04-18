//Find the character of an ASCII code
package CH04;

import java.util.Scanner;

public class CH04_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code (0~127): ");
		int number = input.nextInt();
		
		System.out.println("The character for ASCII code " + 
				number + " is " + (char)number);

	}

}
