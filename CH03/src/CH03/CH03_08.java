//Sort three integers
package CH03;

import java.util.Scanner;

public class CH03_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three integers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if (a > b) 
		{
			int temp = a;
			a = b;
			b = temp;
		}
		
		if (b > c) 
		{
			int temp = b;
			b = c;
			c = temp;
		}
		if (a > b) 
		{
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println("The sorted numbers are " + a + " " + b + " " + c);
	}

}
