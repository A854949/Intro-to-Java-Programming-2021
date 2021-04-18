//日四B 06122238 施佳妏
package HW04_06122238;

import java.util.Scanner;

public class HW04_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double r = input.nextDouble();
        //計算P1座標
        double x1 = r * Math.cos(Math.toRadians(18));
        double y1 = r * Math.sin(Math.toRadians(18));
        //計算P2座標
        double x2 = r * Math.cos(Math.toRadians(90));
        double y2 = r * Math.sin(Math.toRadians(90));
        //計算P3座標
        double x3 = r * Math.cos(Math.toRadians(162));
        double y3 = r * Math.sin(Math.toRadians(162));
        //計算P4座標
        double x4 = r * Math.cos(Math.toRadians(234));
        double y4 = r * Math.sin(Math.toRadians(234));
        //計算P5座標
        double x5 = r * Math.cos(Math.toRadians(306));
        double y5 = r * Math.sin(Math.toRadians(306));
        //顯示結果
        System.out.println("The coordinates of five points on the pentagon are");
        System.out.printf("(%.2f, %.2f)\n", x1, y1);
        System.out.printf("(%.2f, %.2f)\n", x2, y2);
        System.out.printf("(%.2f, %.2f)\n", x3, y3);
        System.out.printf("(%.2f, %.2f)\n", x4, y4);
        System.out.printf("(%.2f, %.2f)\n", x5, y5);
        
	}
}
