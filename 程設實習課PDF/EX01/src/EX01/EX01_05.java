package EX01;

import java.util.Scanner;

public class EX01_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("輸入一個字串 : ");
		String a = input.nextLine();
		String b = "";// 建立b用來記錄最後要輸出的字串

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);// 利用迴圈去找出字串裡每一個字元

			if (ch >= 'A' && ch <= 'Z') {// 判斷該字元是否為A~Z
				if (ch >= 'W')// 如果是則繼續判斷是否為W~Z
					ch = (char) (ch - 22);// 是W~Z的話，因為Z後面就是其他特殊符號了，所以需要回到一開始的A，故ASCII往回推22
				else
					ch = (char) (ch + 4);// 其他A~V的話就直接往後加4
				b += ch;// 記得要把該字元加進新字串做最後輸出用
			} else if (ch >= 'a' && ch <= 'z') {// 判斷該字元是否為a~z
				if (ch >= 'w')// 如果是則繼續判斷是否為w~z
					ch = (char) (ch - 22);// 是w~z的話，因為z後面就是其他特殊符號了，所以需要回到一開始的a，故ASCII往回推22
				else
					ch = (char) (ch + 4);// 其他a~v的話就直接往後加4
				b += ch;// 記得要把該字元加進新字串做最後輸出用
			} else if (ch >= '0' && ch <= '9') {// 判斷該字元是否為0~9
				if (ch >= '6')// 如果是則繼續判斷是否為6~9
					ch = (char) (ch - 6);// 是6~9的話，因為9後面就是其他特殊符號了，所以需要回到一開始的0，故ASCII往回推6
				else
					ch = (char) (ch + 4);// 其他0~5的話就直接往後加4
				b += ch;// 記得要把該字元加進新字串做最後輸出用
			} else// 如果上述情況都不是的話，則代表該字元為特殊符號，例：!@#$%^&*
				b += ch;// 不需要做任何加減，直接加進新字串
		}

		for (int i = b.length() - 1; i >= 0; i--) {
			System.out.print(b.charAt(i));// 利用迴圈由大到小把新字串b從最後一個位置開始依次輸出到第一個位置 (反向輸出)
		}

		System.out.print("\n長度為:" + b.length());// 記得還要輸出新字串b的長度
	}

}
