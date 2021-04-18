package CH02;

import java.util.Scanner;
 
public class CH02_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F:　");
		double t = input.nextDouble();
		
		System.out.println("Enter the wind speed (>= 2) in miles per hour:　");
		double v = input.nextDouble();
		
		double temperature = 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);
		System.out.println("The wind chill index is " + temperature);
	}

}
