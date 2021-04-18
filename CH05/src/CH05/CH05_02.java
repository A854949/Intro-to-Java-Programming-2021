//Repeat multiplications
package CH05;

import java.util.Scanner;

public class CH05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER_OF_QUESTIONS = 10;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		Scanner input = new Scanner(System.in);
		
		while (count < NUMBER_OF_QUESTIONS)
		{
			int number1 = (int)(Math.random() * 12 + 1);
			int number2 = (int)(Math.random() * 12 + 1);
			System.out.print("What is " + number1 + " x " + number2 + "? ");
			int answer = input.nextInt();
			
			if (number1 * number2 == answer)
				correctCount++;
			
		count++;
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println("Correct count is " + correctCount + "\nTest time is " +
				testTime / 1000 + " seconds");
	}

}
