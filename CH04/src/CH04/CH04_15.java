//Phone key pads
package CH04;

import java.util.Scanner;

public class CH04_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");	
		String s = input.nextLine();
		char letter = s.toUpperCase().charAt(0);
		int number = 0;
		
		if (Character.isLetter(letter))
		{
			if (letter >= 'W')
				number = 9;
			else if (letter >= 'T')
				number = 8;
			else if (letter >= 'P')
				number = 7;
			else if (letter >= 'M')
				number = 6;
			else if (letter >= 'J')
				number = 5;
			else if (letter >= 'G')
				number = 4;
			else if (letter >= 'D')
				number = 3;
			else if (letter >= 'A')
				number = 2;
			System.out.println("The corresponding number is " + number);		
		}
		else
			System.out.println(letter + " is an invalid input");

	}

}
