//Days of a month
package CH04;

import java.util.Scanner;

public class CH04_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter a month: ");
		String month = input.next();
		
		System.out.print(month + " " + year + " has ");
		boolean leapyear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		if (month.equals("Jan") || month.equals("Mar") || month.equals("May") ||
				month.equals("Jul") || month.equals("Aug") || month.equals("Oct") ||
				month.equals("Dec"))
			System.out.println("31 days");
		else if (month.equals("Apr") || month.equals("Jun") ||
				month.equals("Sep") || month.equals("Nov"))
			System.out.println("30 days");
		else
			System.out.println(((leapyear) ? 29 : 28) + " days");
			
	}

}
