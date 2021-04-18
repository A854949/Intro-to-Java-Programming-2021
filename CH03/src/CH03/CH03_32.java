//Geometry: point position
package CH03;

import java.util.Scanner;

public class CH03_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Prompt the user to enter the three points
        System.out.print("Enter three points for p0, p1, and p2: ");
        Scanner input = new Scanner(System.in);
        double xP0 = input.nextDouble();
        double yP0 = input.nextDouble();
        double xP1 = input.nextDouble();
        double yP1 = input.nextDouble();
        double xP2 = input.nextDouble();
        double yP2 = input.nextDouble();

        double discriminant = ((xP1 - xP0) * (yP2 - yP0) - (xP2 - xP0) * (yP1 - yP0));

        if(discriminant > 0)
            System.out.println("p2 is on the left side of the line");
        else if(discriminant == 0)
            System.out.println("p2 is on the same line");
        else
            System.out.println("p2 is on the right side of the line");
	}

}
