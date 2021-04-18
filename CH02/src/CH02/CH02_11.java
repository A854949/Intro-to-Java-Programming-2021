//參照CH01_11
package CH02;

import java.util.Scanner;

public class CH02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of years: ");
		int years = input.nextInt();
		double seconds =  365 * 24 * 60 * 60;
		
		int population = (int)(312032486 + (years * seconds / 7) - (years * seconds / 13) + (years *seconds / 45));
		
		System.out.println("The population in " + years + " years is " + population);
	}

}
