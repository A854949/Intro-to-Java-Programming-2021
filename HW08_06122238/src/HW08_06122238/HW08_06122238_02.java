//日四B 06122238 施佳妏
package HW08_06122238;

import java.util.Scanner;

public class HW08_06122238_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner input = new Scanner(System.in);
		int pay; // 運費
		int total = 0; // 總費用
		System.out.print("輸入包裹重量(單位 : 公斤，0表結束): "); // 輸入重量
		double kg = input.nextDouble();	
		while (kg != 0) { // 當kg不為0
            pay = payment(kg); // 呼叫payment副程式將回傳值存入pay
            total += pay; //加總pay到total
			System.out.println("費用 : " + pay); // 印出pay
			System.out.print("輸入包裹重量(單位 : 公斤，0表結束): ");
			kg = input.nextDouble();
		}
        System.out.print("總費用 : " + total); // kg為0時把印出total
	}

	
	public static int payment(double a) {
		int pay = 60; // 費用在1kg(含)以下時為60
			if (a > 1) { // 若大於1kg
				a = a - 1; // 先將扣除1kg，算出剩餘的kg				
				if (a % 0.5 == 0) { // 判斷kg小數點是否為.0或.5
					pay += (a / 0.5) * 35; // 是的話計算有幾個半公斤後乘上運費算出pay
				} 
				else { // 否則進到else
					double temp1 = (int) (a / 0.5); // 不足半公斤視為半公斤，所以先算出有幾個半公斤取整數
					double temp2 = temp1 + 1; // +1表示補上不足半公斤的部分
					pay += temp2 * 35; // 乘上運費算出pay		
				}
			}			
			return pay; // 回傳pay
	}
}
