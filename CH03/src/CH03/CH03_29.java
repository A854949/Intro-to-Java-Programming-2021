//Geometry: two circles
package CH03;

import java.util.Scanner;

public class CH03_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        System.out.print("Enter circle1's center x-,y-coordinates,and radius: ");
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        System.out.print("Enter circle2's center x-,y-coordinates,and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        double o1o2 = Math.pow((Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)), 0.5);

        if (r1 - r2 >= o1o2)
        	System.out.println("circle2 is inside circle1");
        else if (r1 + r2 >= o1o2)
        	System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");
	}

}
