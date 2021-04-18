//Pass or fail
package CH05;

import java.util.Scanner;

public class CH05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int score = 0;
		while (score != -1)
		{
			System.out.print("Enter your score: ");
			score = input.nextInt();
			if(score >= 60)
				System.out.println("You pass the exam.\n");
			else if (score >=0)
				System.out.println("You don't pass the exam.\n");
		}
		
		System.out.println("No numbers are entered expect 0");
	}

}
