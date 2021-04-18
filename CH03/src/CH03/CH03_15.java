//Game: lottery
package CH03;

import java.util.Scanner;

public class CH03_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery = (int)(Math.random()*1000); //隨機產生三位數
		
		int a = lottery / 100; //得出樂透號碼每一位數值
		int b = lottery % 100 / 10;
		int c = lottery % 10;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		
		int d = guess / 100; //得出使用者猜的號碼的每一位數值
		int e = guess % 100 / 10;
		int f = guess % 10;
		
		if (lottery == guess)
			System.out.println("Exact match: you win $12,000");
		else if (a == d && b == f && c == e || 
				 a == e && b == f && c == d ||
				 a == e && b == d && c == f ||
				 a == f && b == e && c == d || 
				 a == f && b == d && c == e ) 
			System.out.println("Match all digits: you win $5,000");
		else if (a == d || a == e || a == f ||
			     b == d || b == e || b == f ||
			     c == d || c == e || c == f)
			System.out.println("Match one digit: you win $2,000");
		else
			System.out.println("Sorry,no match");
	}

}
