//Financial: compare costs
package CH03;

import java.util.Scanner;

public class CH03_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter weight and price for package 1: ");
        Scanner input = new Scanner(System.in);
        double w1 = input.nextDouble();
        double p1 = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double w2 = input.nextDouble();
        double p2 = input.nextDouble();
        
        double c1 = p1 / w1;
        double c2 = p2 / w2;
        
        if (c1 < c2)
        	System.out.println("Package 1 has a better price.");
        else if (c1 > c2)
        	System.out.println("Package 2 has a better price.");
        else
        	System.out.println("Two packages have the same price.");
	}

}
