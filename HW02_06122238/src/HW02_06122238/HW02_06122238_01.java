//日四B 06122238 施佳妏
package HW02_06122238;

import java.util.Scanner;

public class HW02_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("請輸入三個座標x1 y1 x2 y2 x3 y3");  //提示使用者輸入三個座標
		System.out.println("並以空白鍵分隔每個座標:");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		//計算side1
		double a1 = ( x1 - x2 ) * ( x1 - x2  );
		double a2 = ( y1 - y2 ) * ( y1 - y2 );
		double a3 = a1 + a2;
		double side1 = (Math.pow(a3 ,  0.5));
		
		//計算side2
		double b1 = ( x1 - x3 )*( x1 - x3 );
		double b2 = ( y1 - y3 ) * ( y1 - y3 );
		double b3 = b1 + b2;
		double side2 = (Math.pow(b3 ,  0.5));
		
		//計算side3
		double c1 = ( x2 - x3 ) * ( x2 - x3 );
		double c2 = ( y2 - y3 )*( y2 - y3 );
		double c3 = c1 + c2;
		double side3 = (Math.pow(c3 ,  0.5));
		
		//計算s
		double s = ( side1 + side2 + side3 ) / 2;
		
		//計算a,b,c,d
		double a = s - side1;
		double b = s - side2;
		double c = s - side3;
		double d = s * a * b * c;
		
		//計算area
		double area = (Math.pow( d , 0.5 ));
		
		System.out.printf("此三角形面積為:%.1f", area); //顯示結果
	}

}
