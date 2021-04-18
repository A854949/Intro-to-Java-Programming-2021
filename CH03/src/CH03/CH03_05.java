//Find future dates
package CH03;

import java.util.Scanner;

public class CH03_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter today's day: ");
		int day = input.nextInt();
		
		System.out.println("Enter the number of days elapsed since today: ");
		int elapsed = input.nextInt();
		 
		if (day == 0) 
		  System.out.print("Today is Sunday ");
	    else if (day == 1) 
	      System.out.print("Today is Monday ");
	    else if (day == 2) 
	      System.out.print("Today is Tuesday ");
	    else if (day == 3) 
	      System.out.print("Today is Wednesday ");
	    else if (day == 4) 
	      System.out.print("Today is Thursday ");
	    else if (day == 5) 
	      System.out.print("Today is Friday ");
	    else if (day == 6) 
	      System.out.print("Today is Saturday ");
		
		int futureDate = (day + elapsed) % 7;
		
		if (futureDate == 0) 
			  System.out.print("and the future day is Sunday");
	    else if (futureDate == 1) 
	      System.out.print("and the future day is Monday");
	    else if (futureDate == 2) 
	      System.out.print("and the future day is Tuesday");
	    else if (futureDate == 3) 
	      System.out.print("and the future day is Wednesday");
	    else if (futureDate == 4) 
	      System.out.print("and the future day is Thusday");
	    else if (futureDate == 5) 
	      System.out.print("and the future day is Friday");
	    else if (futureDate == 6) 
	      System.out.print("and the future day is Saturday");
	}

}
