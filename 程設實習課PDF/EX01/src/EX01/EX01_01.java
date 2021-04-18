package EX01;

import java.util.Scanner;

public class EX01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an interger (the input ends if it is 0) : ");
		int score = input.nextInt();// 第一次輸入分數

		double sum = 0;// 計算及格分數的總和
		int pass = 0;// 計算及格的人數
		int fail = 0;// 計算不及格的人數

		while (score != 0) {// 判斷輸入的分數是否為0，如果為0則停止迴圈
			if (score >= 60) {// 判斷輸入的成績是否及格
				pass++;// 成績及格的話，及格人數加1
				sum += score;// 成績及格的話，及格分數加總
			} else {// 成績不及格的則進到else
				fail++;// 不及格人數加1
			}
			System.out.print("Enter an interger (the input ends if it is 0) : ");// 該次成績已執行完成，可以準備進行下一次的成績判斷
			score = input.nextInt();// 輸入下一位的分數
		}

		double aver = sum / pass;// 計算最後及格分數總和的平均分數
		System.out.printf("及格 : %d 人 ; 及格平均分數 : %.2f ; 不及格 : %d 人", pass, aver, fail);// 輸出答案

	}

}
