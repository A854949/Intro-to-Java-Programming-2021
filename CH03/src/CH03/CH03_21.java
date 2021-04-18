//Science: day of week
package CH03;

import java.util.Scanner;

public class CH03_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		
		System.out.println("Enter month: 1-12: ");
		int m = input.nextInt();
		
		if (m == 1 || m == 2)
		{
			m = (m == 1) ? 13 : 14;
			year--;
		}
		
		System.out.println("Enter the day of the month: 1-31:  ");
		int q = input.nextInt();
		
	    int h = (q + (26 * (m + 1)) / 10 + (year % 100) + (year % 100) / 4 + 
	    		(year / 100) / 4 + 5 * (year / 100)) % 7;
	    
	    System.out.print("Day of the week is ");
	    
	    switch (h)
	    {
	    	case 0:  System.out.println("Saturday"); break;
	    	case 1:  System.out.println("Sunday"); break;
	    	case 2:  System.out.println("Monday"); break;
	    	case 3:  System.out.println("Tuesday"); break;
	    	case 4:  System.out.println("Wednesday"); break;
	    	case 5:  System.out.println("Thursday"); break;
	    	case 6:  System.out.println("Friday");
	    }
		
	}

}
