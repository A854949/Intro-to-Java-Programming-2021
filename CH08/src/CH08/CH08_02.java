package CH08;

import java.util.Scanner;

public class CH08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double m[][] = new double[4][4];
		System.out.println("Enter a 4-by-4 matrix row by row:");
		for(int i = 0;i < m.length; i++) {
			for(int j = 0;j < m[0].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		System.out.println("Averaage of the elements in the major diagonal is " + averageMajorDiagonal(m));
	}
	public static double averageMajorDiagonal(double[][] m) {
		double sum = 0;
		for(int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		double average = sum / 4;
		return average;
	}
}
