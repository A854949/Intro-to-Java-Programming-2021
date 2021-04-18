//Science: wind-chill temperature
package CH03;

import java.util.Scanner;

public class CH03_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter the temperature in Fahrenheit: ");
		double t = input.nextDouble();

	    if (t < -58 || t > 41)
	      System.out.println("Temperature must be between -58°F and 41°F");
	      System.exit(1);
	    
		System.out.println("Enter the wind speed in miles per hour:　");
		double v = input.nextDouble();
		
		if (v < 2)
			System.out.println("Speed must be greater than or equal to 2");
		    System.exit(2);
		double temperature = 35.74 + 0.6215 * t - 35.75 * 
				Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);
		System.out.println("The wind chill index is " + temperature);
		
		}

}
