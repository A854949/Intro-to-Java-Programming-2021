//日四B 06122238 施佳妏
package HW12_06122238_01;

import java.util.Scanner;

public class HW12_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: "); //請使用者輸入四點座標
        double[][] points = new double[4][2]; //創建一個二維陣列

        for(int i = 0; i < points.length; i++){ //將四個座標讀進來
            for(int j = 0; j < points[i].length; j++){
                points[i][j] = input.nextDouble();
            }
        }
        double[] result = getIntersectingPoint(points); //得到交點座標
        
        if (result == null) //印出結果
            System.out.println("The two lines are parallel");
        else 
        	System.out.println("The intersecting point is at (" + result[0] + ", " + result[1] + ")");

    }	
    public static double[] getIntersectingPoint(double[][] points){
        double a = points[0][1] - points[1][1]; // y1 - y2
        double b = -(points[0][0] - points[1][0]); // -(x1 - x2)
        double c = points[2][1] - points[3][1]; // y3 - y4
        double d = -(points[2][0] - points[3][0]); // -(x3 - x4)
        double e = (points[0][1] - points[1][1]) * points[0][0] - 
        		(points[0][0] - points[1][0]) * points[0][1]; // (y1 - y2) * x1 - (x1 - x2) * y1
        double f = (points[2][1] - points[3][1]) * points[2][0] - 
        		(points[2][0] - points[3][0]) * points[2][1]; // (y3 - y4) * x3 - (x3 - x4) * y3
        
        if (a * d - b * c == 0) //若平行
            return null;
        else //否則有交點
        {
        	double[] result = new double[2]; //求出交點座標
            result[0] = (e * d - b * f) / (a * d - b * c);
            result[1] = (a * f - e * c) / (a * d - b * c);
            return result;
        }
           
    }

}
