//日四B 06122238 施佳妏
package P03_06122238;

import java.util.Scanner;

public class P03_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入年份: "); //請使用者輸入年份
		int year = input.nextInt();
		int zodiac = year % 12; //用年%12的餘數判斷生肖
		
		if (year < 1000) //若輸入為負數或不是四位數(即<1000的數)輸出輸入錯誤年份
			System.out.println("輸入錯誤年份");
		else if (zodiac == 0) 
			System.out.println(year + "年為猴年");
		else if (zodiac == 1) 
			System.out.println(year + "年為雞年");
		else if (zodiac == 2) 
			System.out.println(year + "年為狗年");
		else if (zodiac == 3) 
			System.out.println(year + "年為豬年");
		else if (zodiac == 4) 
			System.out.println(year + "年為鼠年");
		else if (zodiac == 5) 
			System.out.println(year + "年為牛年");
		else if (zodiac == 6) 
			System.out.println(year + "年為虎年");
		else if (zodiac == 7) 
			System.out.println(year + "年為兔年");
		else if (zodiac == 8) 
			System.out.println(year + "年為龍年");
		else if (zodiac == 9) 
			System.out.println(year + "年為蛇年");
		else if (zodiac == 10) 
			System.out.println(year + "年為馬年");
		else if (zodiac == 11) 
			System.out.println(year + "年為羊年");	
		
	}

}
