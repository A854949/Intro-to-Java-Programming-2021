//讀取小計金額(subtotal)和小費率(gratuity rate)，計算小費及總金額
package CH02;

import java.util.Scanner;

public class CH02_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal and a gratuity rate:");
		
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();
		double gratuity = subtotal * rate / 100;
		double total = gratuity + subtotal;
		
		System.out.println("The gratuity is " + gratuity + " and total is " + total);
	}
}