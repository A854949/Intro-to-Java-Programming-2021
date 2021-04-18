//日四B 06122238 施佳妏
package HW05_06122238;

import java.util.Scanner;

public class HW05_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//請使用者輸入員工姓名
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		//請使用者輸入每周工作小時數
		System.out.print("Enter number of hours worked in a week: ");
		double hour = input.nextDouble();
		//請使用者輸入時薪
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		//請使用者輸入聯邦所得稅稅率
		System.out.print("Enter federal tax withholding rate: ");
		double federal = input.nextDouble();
		//請使用者輸入州所得稅稅率
		System.out.print("Enter state tax withholding rate: ");
		double state = input.nextDouble();
		//計算淨工資(net pay) = 工資總額(gross pay) - (稅收)deductions
		double netPay = hour * payRate - federal * hour * payRate - state * hour * payRate;
		
		System.out.printf("Employee Name: %s\n", name);
		System.out.printf("Hours worked: $%.1f\n", hour);
		System.out.printf("Pay Rate: $%.2f\n", payRate);
		System.out.printf("Gross Pay: $%.1f\n", hour * payRate);
		System.out.printf("Deductions: \n");
		System.out.printf("  Federal Withholding (%.1f%%): $%.1f\n", 
				federal * 100, federal * hour * payRate);
		System.out.printf("  State Withholding (%.1f%%): $%.2f\n",
				state * 100, state * hour * payRate);
		System.out.printf("  Total Deduction: $%.2f\n", 
				federal * hour * payRate + state * hour * payRate);
		System.out.printf("Net Pay: $%.2f\n", netPay);
	}

}
