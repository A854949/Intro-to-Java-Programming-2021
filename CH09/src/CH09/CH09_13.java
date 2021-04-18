package CH09;

import java.util.Scanner;

public class CH09_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the array: ");
		int row = input.nextInt();
		int col = input.nextInt();
		
		double array[][] = new double[row][col];
		
		System.out.println("Enter the array: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		Location location = locateLargest(array);
		System.out.println("The location of the largest element is: " + location.maxValue + 
				" at (" + location.row + " , " + location.column + "S)");
		
	}	
	public static Location locateLargest(double[][] a) {
		Location location = new Location();
		
		location.maxValue = a[0][0];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] > location.maxValue) {
					location.maxValue = a[i][j];
					location.row = i;
					location.column = j;
				}
			}
		}
		return location;
	}
}

class Location{
	public int row;
	public int column;
	public double maxValue;


}