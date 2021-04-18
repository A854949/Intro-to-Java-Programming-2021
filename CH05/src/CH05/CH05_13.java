package CH05;

import java.util.Scanner;

public class CH05_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double number[][] = new double[3][4];
		System.out.println("Enter a 3-by-4 matrix row by row:");
		for(int i = 0;i < number.length; i++) {
			for(int j = 0;j < number[0].length; j++) {
				number[i][j] = input.nextDouble();
			}
		}
		for(int i = 0;i < 3; i++) {
			System.out.println("Sum of the elements at row " + i + " is " + sumRow(number, i));
		}
	}
	
	public static double sumRow(double[][] number, int rowIndex) {
		double sum = 0;
		for(int i = 0; i < number[0].length; i++) {
			sum += number[rowIndex][i];
		}
		return sum;
	}

}
