//Use the &&, || and ^ operators
package CH03;

import java.util.Scanner;

public class CH03_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.println("Is" + number + "divisible by 4 and 5? " + 
		((number % 4 == 0) && (number % 5 == 0)));
		System.out.println("Is" + number + "divisible by 4 or 5? " + 
				((number % 4 == 0) || (number % 5 == 0)));
		System.out.println("Is" + number + "divisible by 4 or 5 but not both? " + 
				((number % 4 == 0) ^ (number % 5 == 0)));
	}

}
