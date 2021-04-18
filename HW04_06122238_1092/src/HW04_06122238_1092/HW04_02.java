//日四B 06122238 施佳妏
package HW04_06122238_1092;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW04_02 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:/0326IN.txt"); 
		Scanner input = new Scanner(file);
		Scanner input1 = new Scanner(System.in);
		
		String date[] = new String[50]; //陣列date存日期
		String id[] = new String[50]; //陣列number存會員編號		
		int index = 0; //index計算有幾筆資料
		
		while (input.hasNext()) { //當有下一筆資料
			date[index] = input.next(); //讀入日期
			id[index] = input.next(); //讀入會員編號
			index++; //讀完一筆index++
		}
		input.close();

		String id1 = input1.next(); //讀入使用者輸入的會員編號
		
		int count = 0; //計算有幾筆資料符合
		
		for (int i = 0; i < index; i++) {			
			if (id[i].equals(id1)) { //若相等
				count++; 
			}				
		}
		
		if (count != 0) //若count不等於0
			System.out.print("抽中 " + count + " 張抵用券,共 " + count * 50 + " 元"); //印出中幾張和金額
		else //若count=0
			System.out.print("沒中獎"); //印出沒中獎
	}
		

}
