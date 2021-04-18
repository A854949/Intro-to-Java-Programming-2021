//日四B 06122238 施佳妏
package HW03_06122238;

import java.util.Scanner;

public class HW03_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");  //提示使用者輸入三個數字
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double discriminant = b * b - 4 * a * c; //計算判別式
		
		if (discriminant > 0) //判別式>0
		{
			double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a); //計算r1
			double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a); //計算r2
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		}
		else if (discriminant == 0) //判別式=0
		{
			double r1 = -b / (2 * a); //計算r1
			System.out.println("The equation has one root " + r1);
		}
		else //判別式<0
			System.out.println("The equation has no real roots");
		}
}
