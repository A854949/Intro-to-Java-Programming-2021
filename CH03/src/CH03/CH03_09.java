//Business: check ISBN-10
package CH03;

import java.util.Scanner;

public class CH03_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		int ISBN = input.nextInt();
		
		int d1 = ISBN / 100000000;
		int d2 = ISBN % 100000000 / 10000000;
		int d3 = ISBN % 10000000 / 1000000;
		int d4 = ISBN % 1000000 / 100000;
		int d5 = ISBN % 100000 / 10000;
		int d6 = ISBN % 10000 / 1000;
		int d7 = ISBN % 1000 / 100;
		int d8 = ISBN % 100 / 10;
		int d9 = ISBN % 10;
		
		/*
	    d1 = isbn / 100000000;
	    d2 = isbn / 10000000 % 10;
	    d3 = isbn / 1000000 % 10;
	    d4 = isbn / 100000 % 10;
	    d5 = isbn / 10000 % 10;
	    d6 = isbn / 1000 % 10;
	    d7 = isbn / 100 % 10;
	    d8 = isbn / 10 % 10;
	    d9 = isbn % 10;
		*/
		
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 *4 + d5 * 5 + d6 * 6 +
				d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if(d10 == 10)
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 
					 + d6 + d7 + d8 + d9 + "X");
		else
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 
					 + d6 + d7 + d8 + d9 + d10);

	}
}
