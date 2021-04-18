//Check substring
package CH04;

import java.util.Scanner;

public class CH04_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string1: ");
		String s1 = input.nextLine();
		System.out.print("Enter string2: ");
		String s2 = input.nextLine();
		
		if (s1.contains(s2))
			System.out.println(s2 + " is a substring of " + s1);
		else
			System.out.println(s2 + " is not a substring of " + s1);
	}

}
