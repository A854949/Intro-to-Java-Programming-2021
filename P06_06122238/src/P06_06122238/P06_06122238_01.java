//日四B 06122238 施佳妏
package P06_06122238;

import java.util.Arrays;
import java.util.Scanner;

public class P06_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] student = {"學生A", "學生B", "學生C", "學生D"}; //宣告陣列student，內容包含學生A~D
		double sum = 0; //設sum起始為0
		int[] scores = new int[12]; //宣告scores陣列為12個整數空間(四位學生*三科的成績)
		System.out.print("請輸入學生成績: "); 
		
		for (int i = 0; i < 12; i++) { //將12個分數input進來
			scores[i] = input.nextInt();
		}
		
		for (int j = 0; j < scores.length; j += 3) { //每三個成績為一組，因此+=3
			sum = scores[j] + scores[j+1] + scores[j+2]; //三個成績加總	
			double average = sum / 3; 
			System.out.print(student[j/3] + " "); //用商去對照student是哪一位
			System.out.printf(scores[j]  + " " + scores[j+1]  + " " + scores[j+2] + " 平均:%.2f\n", average);
		}
		
	}

}
