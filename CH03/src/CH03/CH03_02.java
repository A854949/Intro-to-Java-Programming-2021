//Game:multiply three numbers
package CH03;

import java.util.Scanner;

public class CH03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 10 % 10);
		int number3 = (int)(System.currentTimeMillis() / 100 % 10);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is " + number1 + " x " + number2 + " x " + number3 + "? ");
		int answer = input.nextInt();
		
		System.out.println(
			number1 + " x " + number2 + " x " + number3 + " is " + 
			(number1 * number2 * number3 == answer));
	}

}
