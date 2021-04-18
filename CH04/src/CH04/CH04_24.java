//Ennter three countries
package CH04;

import java.util.Scanner;

public class CH04_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first country: ");
		String c1 = input.nextLine();
		System.out.print("Enter the second country: ");
		String c2 = input.nextLine();
		System.out.print("Enter the third country: ");
		String c3 = input.nextLine();
		
		if (c1.compareTo(c2) < 0) //若c1字序較c2字序前面則swap
		{
			String temp = c1;
			c1 = c2;
			c2 = temp;			
		}
		
		if (c2.compareTo(c3) < 0)
		{
			String temp = c2;
			c2 = c3;
			c3 = temp;			
		}
		if (c1.compareTo(c2) < 0)
		{
			String temp = c1;
			c1 = c2;
			c2 = temp;			
		}
		System.out.println("The three cities in alphabetical order are " 
			      + c1 + " " + c2 + " " + c3);
			
	}

}
