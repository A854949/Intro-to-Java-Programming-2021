package EX01;

import java.util.Scanner;

public class EX01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("輸入包裹重量(單位 : 公斤，0表結束):");
		double kg = input.nextDouble();// 第一次輸入公斤數
		
		int pay;// 每次輸入公斤數後的運費
		int total = 0;// 總費用
		
		while (kg != 0) {// 判斷是否為0
			pay = 60;// 起始價60元
			
			if (kg <= 1) {// 判斷公斤數是否大於1
				total += pay;// 公斤數小於1的話，就基本起始價60元
				System.out.println("費用 : " + pay);
			} else {// 公斤數大於1的則進到else
				kg = kg - 1;// 因為第一公斤的費用固定為60元，所以先將第一公斤扣掉，留剩下的公斤數去算出費用
				
				if (kg % 0.5 == 0) {// 判斷小數點是否為.0或.5
					pay += (kg / 0.5) * 35;// 是的話就直接計算有"幾個"半公斤後乘上運費
					total += pay;// 記得要把該次運費加進總費用裡做最後計算
					System.out.println("費用 : " + pay);
				} else {// 小數點不是.0或.5的話則進到else
					double temp1 = (int) (kg / 0.5);// 因為不足半公斤要用半公斤去算，所以先算出有"幾個"半公斤然後取整數的部分
					double temp2 = temp1 + 1;// 再加上"一個"半公斤來表示要無條件進位那塊不足半公斤的部分
					pay += temp2 * 35;//// 計算有"幾個"半公斤後乘上運費
					total += pay;// 記得要把該次運費加進總費用裡做最後計算
					System.out.println("費用 : " + pay);
				}
			}
			
			System.out.print("輸入包裹重量(單位 : 公斤，0表結束):");// 該次運費已計算完成，可以準備進行下一次的運費計算
			kg = input.nextDouble();// 再次輸入新的公斤數
		}
		System.out.print("總費用:" + total);// 將最後加總的全部運費顯示出來
	}

}
