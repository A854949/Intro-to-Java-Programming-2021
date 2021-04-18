//日四B 06122238 施佳妏
package HW09_06122238;

import java.util.Scanner;

public class HW09_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10]; //宣告陣列numbers為10個double空間
		System.out.print("Enter 10 numbers: "); //請使用者輸入10個數字
		for (int i = 0; i < numbers.length; i++) //將10個數字input進來
			numbers[i] = input. nextDouble();
		System.out.println("The mean is " + mean(numbers)); //呼叫方法mean並印出
		System.out.println("The standard devition is " + devition(numbers)); //呼叫方法numbers並印出

	}
	
	public static double devition(double[] x) {
		double sum = 0; //設sum起始值為0
		for (int i = 0; i < x.length; i++) 
			sum += Math.pow(x[i] - mean(x),2); //sum=每一數值-平均的平方並加總
        return Math.sqrt(sum / (x.length - 1)); //回傳sum除n-1的平方根
	}
	
	public static double mean(double[] x) {
		double sum = 0; //設sum起始值為0
        for (int i = 0; i < x.length; i++) 
            sum += x[i]; //sum=所有個數加總
        return sum / x.length; //回傳sum/n
	}

}
