//日四B 06122238 施佳妏
package P04_06122238;

import java.util.Scanner;

public class P04_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入密碼"); //請使用者輸入密碼
		String a = input.nextLine().trim(); //刪去兩端使用者誤輸入的空白
		String b = ""; //設輸出的b字串起始為空值
		//用for迴圈判斷，設i從0開始，當a.length()>i時，執行迴圈內容，執行完後i++
		for (int i = 0; i < a.length(); i++)
		{
			if('A' <= a.charAt(i) && a.charAt(i) <= 'U') //若字元在A~U之間
				b += (char)(a.charAt(i) + 37); //+32轉為小寫，再+5因應題目要求
			else if('V' <= a.charAt(i) && a.charAt(i) <= 'Z') //另外判斷若字元在V~Z之間
				b += (char)(a.charAt(i) + 11); //+32轉為小寫，再+5因應題目要求，最後-26回到a
			else if('a' <= a.charAt(i) && a.charAt(i) <= 'u') //若字元在a~u之間
				b += (char)(a.charAt(i) - 27); //-32轉為小寫，再+5因應題目要求
			else if('v' <= a.charAt(i) && a.charAt(i) <= 'z') //另外判斷若字元在v~z之間
				b += (char)(a.charAt(i) - 53); //-32轉為小寫，再+5因應題目要求，最後-26回到A
			else //若為非字母字元時
				b += a.charAt(i);
		}
		
		System.out.println(b); //輸出加密後密碼b
	}

}
