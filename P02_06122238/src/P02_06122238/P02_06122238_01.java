//日四B 06122238 施佳妏
package P02_06122238;

import java.util.Scanner;

public class P02_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("請輸入身高(公尺)："); //請使用者輸入身高
		double height = input.nextDouble();
		
		System.out.println("請輸入體重(公斤)："); //請使用者輸入體重
		double weight = input.nextDouble();
		
		double BMI = weight / (height * height); //計算BMI
		System.out.printf("您的BMI為：%.2f",BMI); //顯示結果
	}

}
