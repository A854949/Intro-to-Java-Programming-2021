package CH02;

import java.util.Scanner;

public class CH02_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
	    System.out.print("Enter the driving distance: ");
	    double distance = input.nextDouble();
	    
	    System.out.print("Enter miles per gallon: ");
	    double perGallon = input.nextDouble();
	    
	    System.out.print("Enter price per gallon: ");
	    double price = input.nextDouble();
	       
	    double cost = (distance / perGallon) * price;
	    System.out.printf("The cost of driving is $%.2f", cost);

	}

}
