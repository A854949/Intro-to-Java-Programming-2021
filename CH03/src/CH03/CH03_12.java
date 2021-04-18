//Palindrome integer (迴文數)
package CH03;

import java.util.Scanner;

public class CH03_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a three-digit integer: ");
		int number = input.nextInt();
		
		if(number / 100 == number % 10)
			System.out.println(number + " is a palindrome");
		else 
		    System.out.println(number + " is not a palindrome");
		
	}

}
