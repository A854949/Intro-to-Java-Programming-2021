//日四B 06122238 施佳妏
package HW11_06122238;

import java.util.Scanner;

public class HW11_06122238_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char ans; //設ans存使用入者使用的答案
		int floor; //設floor存使用者輸入的樓層
		while (true) { 
			int price = 1000; //設price起始價為1000
			
			System.out.print("面湖嗎?(y/n)"); //問使用者的需求
			ans = Character.toLowerCase(input.next().charAt(0)); //避免錯誤將答案轉為小寫
			if (ans == 'y') //若回答y
				price += 500; //加價500
			
			do { //先問一次使用者想住幾樓
				System.out.print("希望住幾樓?(3-13)");
				floor  = input.nextInt();
				if (floor > 3 && floor <= 13) //若輸入的樓層在4~13之間
					price += (floor - 3) * 100; //4樓以上每一層樓+100
				else continue; //若輸入樓層不在4~13之間則再問一次
			} while (floor < 3 || floor > 13); //當輸入樓層不在4~13
			
			System.out.print("要附早餐嗎?(y/n)");
			ans = Character.toLowerCase(input.next().charAt(0));
			if (ans == 'y') //若回答y
				price += 500; //加價500
			
			System.out.print("國定假日嗎?(y/n)");
			ans = Character.toLowerCase(input.next().charAt(0));
			if (ans == 'y') //若回答y
				price *= 1.2; //加兩成
			
			System.out.print("是會員嗎?(y/n)");
			ans = Character.toLowerCase(input.next().charAt(0));
			if (ans == 'y') //若回答y
				price *= 0.8; //打8折
			
			System.out.println("每個人每晚費用為 " + price); //印出價錢
			
			System.out.print("要繼續試算嗎?(y/n)"); //若回答y
			ans = Character.toLowerCase(input.next().charAt(0));
			if (ans == 'y') continue; //若回答y則再試算一次
			else break; //否則結束
		}
					
	}

}
