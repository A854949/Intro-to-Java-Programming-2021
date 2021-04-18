//日四B 06122238 施佳妏
package HW07_06122238;

import java.util.Scanner;

public class HW07_06122238_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入字串: "); //請使用者輸入字串
		String str = input.nextLine();

		 for(int i = 0; i < 10; i++){ //設一迴圈判斷0~9分別出現幾次
			 int count = 0; //設count計算出現幾次
	         char number = (i + "").charAt(0); //將數字轉為字元
	         for (int j = 0; j < str.length(); j++) { //設一迴圈取出每個字元去判斷
	        	 if (str.charAt(j) == number) { //判斷字元是否等於數字
	        		 count++; //是的話count++
	             }
	         }
	     System.out.println(i + " occurs " + count + " times."); //顯示結果
	     }
		 
	}

}
