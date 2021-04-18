//日四B 06122238 施佳妏
package HW04_06122238;

import java.util.Scanner;

public class HW04_06122238_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery = (int)(100 + Math.random() * 900); //隨機產生100~999
		System.out.println(lottery);
		int a = lottery / 100; //得出樂透號碼每一位數值
		int b = lottery % 100 / 10;
		int c = lottery % 10;
		
		Scanner input = new Scanner(System.in);
		System.out.println("輸入您想猜的號碼(100~999): ");
		int guess = input.nextInt();
		System.out.println("輸入您想投注的金額(1000元內): ");
		int money = input.nextInt();
	
		int d = guess / 100; //得出使用者猜的號碼的每一位數值
		int e = guess % 100 / 10;
		int f = guess % 10;
		
		if (lottery == guess) //三個數字及位置全相等
		{
			System.out.println("中獎！");
			System.out.println("正確號碼為： " + lottery);
			System.out.println("獎金： " + money * 500 +  "元");
		}
			
		else if ( a == d && b == e && c != f || //兩個數字及位置兩個相等
				  a == d && b != e && c == f ||
				  a != d && b == c && c == f)
		{
			System.out.println("中獎！");
			System.out.println("正確號碼為： " + lottery);
			System.out.println("獎金： " + money * 30 + "元");
		}

		else if (guess >= 1000 || guess < 100 || money > 1000) //若輸入的數字不在100~999或金額輸入超過1000
		{
			System.out.println("輸入錯誤");
		}
		else
		{
			System.out.println("沒中獎！");
			System.out.println("正確號碼為：" + lottery);
		}
		
	}

}
