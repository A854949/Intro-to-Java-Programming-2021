//日四B 06122238 施佳妏
package HW01_06122238;

import java.util.Scanner;

public class HW01_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a[][] = new double[2][2];
		double b[][] = new double[2][2];
		System.out.print("Enter matrix1: ");
		for(int i = 0;i < a.length; i++) {
			a[i][0] = input.nextDouble();
			a[i][1] = input.nextDouble();
		}		
		System.out.print("Enter matrix2: ");
		for(int i = 0;i < b.length; i++) {
			b[i][0] = input.nextDouble();
			b[i][1] = input.nextDouble();
		}
		double[][] matrix =  addMatrix(a, b);
		System.out.println("兩個矩陣相加如下： " );
		System.out.println(a[0][0] + " " + a[0][1] + "   " + b[0][0] + " " + b[0][1]+ "   " +
				matrix[0][0] + " " + matrix[0][1]);
		System.out.println(a[1][0] + " " + a[1][1] + " + " + b[1][0] + " " + b[1][1]+ " = " +
				matrix[1][0] + " " + matrix[1][1]);
		
	}
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] matrix = new double[2][2];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				matrix[i][j] = a[i][j] + b[i][j];
			}
		}
		return matrix;
	}
}
