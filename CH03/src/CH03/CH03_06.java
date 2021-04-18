package CH03;

import java.util.Scanner;

public class CH03_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.println("Enter feet: ");
		double feet = input.nextDouble();
		System.out.println("Enter inches: ");
		double inch = input.nextDouble();
		
		double height = feet * 12 + inch;
		
		double BMI = (weight * 0.45359237) / ((height * 0.0254) * (height * 0.0254));
		System.out.println("BMI is " + BMI);
		
		if(BMI < 18.5)
			System.out.println("Underweight");
	    else if (BMI < 25)
	        System.out.println("Normal");
	    else if (BMI < 30)
	        System.out.println("Overweight");
	    else
	        System.out.println("Obese");
	}

}
