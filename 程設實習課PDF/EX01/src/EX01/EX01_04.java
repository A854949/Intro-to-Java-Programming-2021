package EX01;

import java.util.Scanner;

public class EX01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("輸入第一個整數 : ");
		int a = input.nextInt();

		System.out.print("輸入第二個整數 : ");
		int b = input.nextInt();

		int count = 0;// 建立count用來記錄已輸出的質數數量

		if (a > b) {// 先判斷輸入的數字大小 決定好順序 以利後面迴圈執行
			int temp = b;
			b = a;
			a = temp;
		}

		for (int i = b; i >= a; i--) {// i從最大數字開始慢慢減到最小數字，去判斷每個數字是不是為質數
			boolean k = true;// 建立boolean去記錄是否為質數

			for (int n = 2; n < i; n++) {// 因為1不管誰都能整除，所以從2開始往上找有沒有任何數能夠整除當前正在判斷的i
				if (i % n == 0) {// 如果當前判斷的這個i能夠被整除就代表i並非質數
					k = false;// 透過boolean改成false來記錄i並非質數
					break;// 竟然已經確定當前判斷的i並非質數，代表並不需要再繼續找其他數字去測試i了，可以直接break停止迴圈
				}
			}

			if (k == true) {// 接下來就是要去看剛剛boolean的紀錄來確定剛剛判斷的i是否為質數
				System.out.print(i + " ");// 是的話就輸出該質數
				count++;// 順便記錄目前已輸出的質數數量
				
				if (count % 6 == 0)// 去判斷當輸出的數量為六的倍數時
					System.out.println();// 每六個要換一行
			}
		}
		System.out.println("\n總個數 : " + count);// // 將最後輸出的質數總數量顯示出來
	}

}
