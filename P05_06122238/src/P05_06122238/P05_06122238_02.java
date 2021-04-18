//日四B 06122238 施佳妏
package P05_06122238;

import java.util.Scanner;

public class P05_06122238_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("輸入第一個整數: ");
		int a = input.nextInt();
		System.out.print("輸入第二個整數: ");
		int b = input.nextInt();	
		if (a > b) {
			int temp = b;
			b = a;
			a = temp;
		}
		find(a, b);
	}		
	public static void find (int a , int b) {		
		int count = 0;
		for (int i = b; i >= a; i--) {
		boolean k = true;

		for (int n = 2; n < i; n++) {
			if (i % n == 0) {
				k = false;
				break;
			}
		}
		if (k == true) {
			System.out.print(i + " ");
			count++;
					
			if (count % 6 == 0)
				System.out.println();
			}
		}
		System.out.println("\n總個數 : " + count);

	}

}
