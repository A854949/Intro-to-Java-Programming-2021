//Find the Unicode of a character
package CH04;

import java.util.Scanner;

public class CH04_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String str = input.nextLine().trim();
		char character = str.charAt(0);
		
		System.out.println("The Unicode for character " + 
				character + " is " + (int)character);
	}

}
