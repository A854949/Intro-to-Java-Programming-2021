//日四B 06122238 施佳妏
package P04_06122238;

import java.util.Scanner;

public class P04_06122238_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = (int)(Math.random() * 100 + 1); //隨機產生1~100
		Scanner input = new Scanner(System.in);
		
		int count = 0; //設count(猜測次數)=0
		int guess = 0; //設guess(使用者猜的數字)=0，保證會進入迴圈
		
		while (guess != number) //當沒猜中時進入迴圈
		{
			System.out.print("請輸入猜測數字(1~100): "); //請使用者輸入猜測的數字
			guess = input.nextInt();
			
			if (guess == number) //若猜中則跳出迴圈
				System.out.println("You win, you guess " + count + " times");
			else if (guess > number) //當猜的數字大於電腦產生的數字
				System.out.println("too high");
			else //當猜的數字小於電腦產生的數字
				System.out.println("too low");
			
			count++; //計算猜測次數
		}
	}

}
