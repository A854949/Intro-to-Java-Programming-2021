//Game: heads or tails
package CH03;

import java.util.Scanner;

public class CH03_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int)(Math.random() * 2);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess head or tail? Enter 0 for head and 1 for tail: ");

		int guess = input.nextInt();
		
		if (guess == number)
			System.out.println("Correct!");
		else
			System.out.println("Incorrect!");
	}

}
