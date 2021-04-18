//日四B 06122238 施佳妏
package HW07_06122238;

import java.util.Scanner;

public class HW07_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double sum = 0; //設總和
		double sumOfSquare = 0; //設平方和
		double mean = 0; //設平均值		 	
		double deviation = 0; //設標準差	
		System.out.print("Enter 10 numbers: "); //請使用者輸入十個數字

		for (int i = 1; i <= 10; i++) {
			double number = input.nextDouble();
			sum += number; //得出總和
			sumOfSquare += Math.pow(number, 2); //得出平方和
		}
		mean = sum / 10; //得出平均值
		//得出標準差
		deviation =  Math.sqrt((sumOfSquare - (Math.pow(sum, 2) / 10)) / (10 - 1));

		//顯示結果
		System.out.printf("The mean is %.2f\n", mean);
		System.out.printf("The standard deviation is %.5f\n", deviation);

	}

}
