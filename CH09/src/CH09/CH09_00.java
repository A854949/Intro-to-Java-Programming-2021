package CH09;

import java.util.Scanner;

public class CH09_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		String b = input.next();
		for (int i = 0; i < b.length(); i++) { //個別判斷輸入的數字
			for (int j = 0; j < 10; j++) { //判斷為0~9哪一個
				if (b.charAt(i) - j - 48 == 0) //若符合
					a[j]++;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			if (a[i] != 0)
				System.out.printf("%d %d\n", i, a[i]);
		}
	}
}
