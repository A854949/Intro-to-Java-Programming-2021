//Game: multiplication quiz
package CH03;

import java.util.Scanner;

public class CH03_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random() * 1000);
		int b = (int)(Math.random() * 1000);
		
		System.out.println("What is " + a + " x " + b + " ? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if(a * b == answer)
			System.out.println("You are correct!");
		else 
		{
			System.out.println("Your answer is wrong.");
			System.out.println(a + " x " + b + " is " + (a * b));
		}
	}

}
