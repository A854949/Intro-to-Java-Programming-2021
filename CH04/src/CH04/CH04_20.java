//Process a string
package CH04;

import java.util.Scanner;

public class CH04_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");	
		String s = input.nextLine();
		
		System.out.println("The length of the string is " + s.length());
	    System.out.println("The last character in the string is " + s.charAt(s.length() - 1));
	}

}
