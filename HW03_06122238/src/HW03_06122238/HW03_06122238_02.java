//日四B 06122238 施佳妏
package HW03_06122238;

import java.util.Scanner;

public class HW03_06122238_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入本月使用度數: ");  //提示使用者輸入度數
		double degree = input.nextDouble();
		
		double billpay = 0;
		
		if (degree <= 100) //若使用100度(含)以下
			billpay = degree * 3.12;
		else if (degree <= 300) //若使用101~300度(含)
			billpay = (100 * 3.12) + ((degree - 100) * 4.52);
		else //若使用300度以上
			billpay = (100 * 3.12) + (200 * 4.52) + (degree - 300) * 5.53;
		
//		System.out.println("本月電費為 " + billpay + " 元");
		System.out.printf("本月電費為: %.0f 元 ", billpay);
	}

}
