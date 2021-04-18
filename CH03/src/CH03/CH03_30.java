//Current time
package CH03;

import java.util.Scanner;

public class CH03_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

	    System.out.print("Enter the time zone offset to GMT: ");
	    long timeZoneOffset = input.nextInt();

	    long totalMilliseconds = System.currentTimeMillis();
	    long totalSeconds = totalMilliseconds / 1000;

	    long currentSecond = totalSeconds % 60;
	    long totalMinutes = totalSeconds / 60;

	    long currentMinute = totalMinutes % 60;
	    long totalHours = totalMinutes / 60;

	    long currentHour = (totalHours + timeZoneOffset) % 24;
	    
	    //%12
	    System.out.print("The current time is " + (currentHour%12) + ":"
	      + currentMinute + ":" + currentSecond);
	    
	    if (currentHour < 12)
	        System.out.println(" AM");
	    else
	        System.out.println(" PM");    
	}

}
