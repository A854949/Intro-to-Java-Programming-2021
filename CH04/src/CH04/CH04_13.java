//Vowel or consonant?
package CH04;

import java.util.Scanner;

public class CH04_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char letter = input.nextLine().charAt(0);
		letter = Character.toUpperCase(letter);
		
		if (Character.isLetter(letter))
		{
			if("AEOUI".indexOf(letter) != -1)
				System.out.println(letter + " is a vowel");
			else
				System.out.println(letter + " is a consonant");
        }
		else
			System.out.println(letter + " is an invalid input");
			
		
	}

}
