///Even or odd number
package CH03;

import java.util.Scanner;

public class CH03_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer number");
		int number = input.nextInt();
		
		if (number % 2 == 0)
			System.out.println(number + " is even number");
		else
			System.out.println(number + " is odd number");
	}

}
