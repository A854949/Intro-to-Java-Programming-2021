//日四B 06122238 施佳妏
package P05_06122238;

import java.util.Scanner;

public class P05_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入數字: ");
		int number = input.nextInt();
		int sum = 0;
		int count = 0;
		
		while(true) {
			sum += number;
			count++;
			if (sum == 0) {
				break;
			}
			System.out.print("請輸入數字: ");
			number = input.nextInt();		
		}
		System.out.print(count);
		
	}

}
