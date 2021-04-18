package CH08;

import java.util.Scanner;

public class CH08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double m[][] = new double[3][4];
		System.out.println("Enter a 3-by-4 matrix row by row:");
		for(int i = 0;i < m.length; i++) {
			for(int j = 0;j < m[0].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		for(int i = 0;i < 3; i++) {
			System.out.println("Sum of the elements at row " + i + " is " + sumRow(m, i));
		}
	}
	
	public static double sumRow(double[][] m, int rowIndex) {
		double sum = 0;
		for(int i = 0; i < m[0].length; i++) {
			sum += m[rowIndex][i];
		}
		return sum;
	}

}
