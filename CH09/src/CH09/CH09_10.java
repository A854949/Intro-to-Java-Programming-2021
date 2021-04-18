package CH09;

import java.util.Scanner;

public class CH09_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		QuadraticEquation q = new QuadraticEquation(a, b, c);
		double discriminant = q.getDiscriminant();
		
		if(discriminant < 0) 
			System.out.println("The equation has no roots.");
		else if(discriminant == 0)
			System.out.println("The root is " + q.getRoot1());
		else
			System.out.println("The root is " + q.getRoot1() + " and " + q.getRoot2());
	}

}

class QuadraticEquation{
	private double a;
	private double b;
	private double c;
	
	QuadraticEquation(double x, double y, double z){
		a = x;
		b = y;
		c = z;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getDiscriminant() {
		return b * b - 4 * a * c;
	}
	
	public double getRoot1() {
		if (getDiscriminant() < 0)
			return 0;
		else
			return (-b * getDiscriminant()) / (2 * a);
	}
	
	public double getRoot2() {
		if (getDiscriminant() < 0)
			return 0;
		else
			return (-b * getDiscriminant()) / (2 * a);
	}
}
