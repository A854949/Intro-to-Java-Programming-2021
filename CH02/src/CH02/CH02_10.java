//計算能量
package CH02;

import java.util.Scanner;

public class CH02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in kilograms: ");
		double m = input.nextDouble();
		
		System.out.println("Enter the intitial temperature:");
		double intitialTemperature = input.nextDouble();
		
		System.out.println("Enter the final temperature:");
		double finalTemperature = input.nextDouble();

		double energy = m * (finalTemperature - intitialTemperature) * 4184;
		
		System.out.println("The energy needed is " + energy);
	}

}
