//日四B 06122238 施佳妏
package HW09_06122238;

import java.util.Scanner;

public class HW09_06122238_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i = 0; //設i索引起始為0
		int countEven = 0; //設countEven計算偶數出現次數
		int countOdd = 0; //設countOdd計算偶數出現次數
		int[] numbers = new int[100]; //宣告陣列numbers
		System.out.println("請輸入數個整數: "); //請使用者輸入整數
		while (true) {
			numbers[i] = input.nextInt(); //將數字input進來
			if (numbers[i] == -1) //若等於-1就break掉
				break;
			else if (numbers[i] % 2 != 0) { //numbers%2不等於0為奇數
				countOdd++;
			}
			else //等於0則為偶數
				countEven++;
		i++;
		}
		//印出奇數偶數的個數
		System.out.println("奇數: " + countOdd); 
		System.out.println("偶數: " + countEven);
		Sort(numbers); //呼叫方法numbers
	}
	
	public static void Sort(int[] list) {
	 //i = list.length-1，代表第一次j迴圈會處理的陣列範圍是list.length-1，每跑完一輪就-1，直到i不大於0排序結束
		for (int i = list.length - 1; i >= 1; i--) {
			for (int j = 0; j <= i; j++) { 
				if (list[j + 1] == -1) break; //為了只排序真正有數字的部分和不排進-1，判斷遇到-1就break
				if (list[j] > list[j + 1]) { //做兩兩比較，前面數字大於後面的話就交換
					int temp = list[j]; 
					list[j] = list[j + 1];
					list[j + 1] = temp;	
				}
			}	
		}
		
		for (int i = 0; i < list.length; i++) { //印出結果
			if (list[i] == -1) break; //為了不印出一堆0和-1，判斷遇到-1就break
			System.out.print(list[i] + " ");			
		}
	}

}
