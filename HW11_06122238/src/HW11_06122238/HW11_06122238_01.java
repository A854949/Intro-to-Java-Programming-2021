//日四B 06122238 施佳妏
package HW11_06122238;

import java.io.IOException;
import java.util.*;

public class HW11_06122238_01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int scores[] = new int[100]; //設陣列scores存放所有學生成績
		double total = 0; //設total計算成績總和
		int index = 0; //設index計算有幾筆資料
		
		java.net.URL url = new java.net.URL("http://liveexample.pearsoncmg.com/data/Scores.txt");
		Scanner input = new Scanner(url.openStream());
		while (input.hasNext()) { //當還有下一筆資料
			scores[index] = input.nextInt(); //讀入成績
			total += scores[index]; //加總
			index++; //讀完一筆index++
		}
		
		for (int i = 0; i < index; i++) { //將所有成績遞減排列
			int currentMax = scores[i]; //設第一個成績是最大值
			int currentMaxIndex = i; //設第一個成績的引數是最大值所在的引數
			for (int j = i + 1; j < index; j++) { //在剩餘未排列的陣列找最大值
			if (currentMax < scores[j]) { //若找到最大值
				currentMax = scores[j]; //得到最大值
				currentMaxIndex = j; //得到最大值引數
				}
			}
			if (currentMaxIndex != i) { //將為排序陣列中的第一個元素與找到的最大值交換
			scores[currentMaxIndex] = scores[i]; 
			scores[i] = currentMax;
			}
		}
		
		System.out.println("Score: "); //印出學生成績
		for(int i = 0; i < index; i++) {
			if (i % 10 == 9 && i != 0) { //老師要求十個一排
				System.out.println(scores[i]);
			}
			else
				System.out.print(scores[i] + " ");
		}
			
		System.out.println("\nTotal: " + total); //印出總和
		System.out.println("Average: " + total / index); //印出平均
			
		
	}

}
