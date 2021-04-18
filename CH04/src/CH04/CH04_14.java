//Covert letter grade to number
package CH04;

import java.util.Scanner;

public class CH04_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter grade: ");
		char grade = input.nextLine().charAt(0);
		grade = Character.toUpperCase(grade);
		
		if ('A' <= grade && grade <= 'F' && grade != 'E')
		{
			System.out.print("The numeric value for grade " + grade + " is ");
			switch (grade)
			{
			case 'A': System.out.println("4"); break;
			case 'B': System.out.println("3"); break;
			case 'C': System.out.println("2"); break;
			case 'D': System.out.println("1"); break;
			case 'F': System.out.println("0");
			}
		}
		else
			System.out.println(grade + " is an invalid grade");

	}

}
