//日四B 06122238 施佳妏
package HW01_06122238_1092;

import java.util.Scanner;

public class HW01_0805_06122238_1092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //創建一個Scanner
		double a[][] = new double[2][2]; //宣告陣列a為2*2個double空間
		double b[][] = new double[2][2]; //宣告陣列b為2*2個double空間
		System.out.print("Enter matrix1: "); //請使用者輸入m1
		for(int i = 0;i < a.length; i++) { //用for迴圈將4個數字input進來存入a
			a[i][0] = input.nextDouble();
			a[i][1] = input.nextDouble();
		}		
		System.out.print("Enter matrix2: "); //請使用者輸入m2
		for(int i = 0;i < b.length; i++) { //用for迴圈將4個數字input進來存入b
			b[i][0] = input.nextDouble();
			b[i][1] = input.nextDouble();
		}
		double[][] matrix =  addMatrix(a, b); //宣告陣列matrix，由副程式addMatrix去得到陣列值存入matrix
		System.out.println("兩個矩陣相加如下： " ); //顯示結果
		System.out.println(a[0][0] + " " + a[0][1] + "   " + b[0][0] + " " + b[0][1]+ "   " +
				matrix[0][0] + " " + matrix[0][1]);
		System.out.println(a[1][0] + " " + a[1][1] + " + " + b[1][0] + " " + b[1][1]+ " = " +
				matrix[1][0] + " " + matrix[1][1]);
		
	}
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] matrix = new double[2][2]; //宣告陣列matrix為2*2個double空間
		for(int i = 0; i < a.length; i++) { //用巢狀for迴圈去運算，將兩陣列相加
			for(int j = 0; j < b.length; j++) {
				matrix[i][j] = a[i][j] + b[i][j];
			}
		}
		return matrix; //回傳matrix陣列
	}

}
