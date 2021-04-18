//日四B 06122238 施佳妏
package HW03_06122238_1092;

import java.util.Scanner;

public class HW03_0911_06122238_1092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f: "); //請使用者輸入a~f
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f); //創建一個linearEquation物件
		if (linearEquation.isSolvable()) { //若true則印出x和y
			System.out.println("x is " + linearEquation.getX() + " and y is " + linearEquation.getY());
		}
		else //false則印出無解
			System.out.println("The equation has no solution");
	}

}

class LinearEquation{ 
	//private資料欄位a~f
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	//創建一個引數有a~f的建構子
	LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF){ 
		a = newA;
		b = newB;
		c = newC;
		d = newD;
		e = newE;
		f = newF;
	}
	
	//a~f的getter method
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getD() {
		return d;
	}
	
	public double getE() {
		return e;
	}
	
	public double getF() {
		return f;
	}
	
	public boolean isSolvable() { //若ad-bc不為0回傳true
		if ((a * d - b * c) != 0) 
			return true;
		else
			return false;
			
	}
	
	public double getX() { //回傳方程式的解x
		return (e * d - b * f) / (a * d - b * c);
	}

	public double getY() { //回傳方程式的解y
		return (a * f - e * c) / (a * d - b * c);
	}
}
