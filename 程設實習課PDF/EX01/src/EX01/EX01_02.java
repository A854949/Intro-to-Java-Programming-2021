package EX01;

import java.util.Scanner;

public class EX01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an double (半徑) : ");
		double r = input.nextDouble();// 輸入半徑

		System.out.print("Enter an integer (邊數) : ");
		double n = input.nextDouble();// 輸入為幾邊行

		double x, y;// 建立x、y為多邊形各點的點座標
		double degree = 360 / n;// 圓內角為360度，故要算出該n邊行內每角各是多少度

		for (int i = 0; i < n; i++) {// 因為n邊行有n個內角，所以用迴圈算出n個x座標、n個y座標
			x = r * Math.cos(Math.toRadians(90 + degree * i));// 因題目規定從(0,r)開始逆時針算，所以角度從90度開始往左邊依次加上圓內角角度去算每點的x、y座標
			y = r * Math.sin(Math.toRadians(90 + degree * i));// 座標算法：算出角度後用toRadians換成弧度，再用sin跟cos算出x、y座標
			System.out.printf("第%d個點座標 : (%6.3f),(%6.3f) %n", i + 1, x, y);// 每算出一組x、y座標就先輸出，以免迴圈重新執行會新的會蓋掉舊的
		}

	}

}
