//Student major and status
package CH04;

import java.util.Scanner;

public class Ch04_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two characters: ");	
		String s = input.nextLine();
		char major = s.toUpperCase().charAt(0);
		char status = s.charAt(1);
		
		switch(major)
		{
			case 'A': System.out.print("Accouting "); break;
			case 'C': System.out.print("Computer Science "); break;
			case 'I': System.out.print("Information Technology "); break;
			default : System.out.println("Invalid input");		
		}

		switch(status)
		{
			case '1': System.out.println("Freshman"); break;
			case '2': System.out.println("Sophomore"); break;
			case '3': System.out.println("Junior"); break;
			case '4': System.out.println("Senior"); break;
			default : System.out.println("Invalid input");
		}

	}

}
