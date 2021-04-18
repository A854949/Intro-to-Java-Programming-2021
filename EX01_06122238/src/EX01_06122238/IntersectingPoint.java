package EX01_06122238;

import java.util.Scanner;

public class IntersectingPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入要產生幾個點: ");
		int n = input.nextInt();
		double[][] points = new double[n][2];
		for (int i = 0; i < points.length; i++) {
			points[i][0] = (Math.random() * 100);
			points[i][1] = (Math.random() * 100);
		}
		eqn(n, points);
		for (int i = 0; i < points.length; i++) {
			System.out.println("(" + points[i][0] + ", " + points[i][1] + ")");
		}
	
	 	intersect(n, points);
	 	
 }	
	public static void eqn(int n, double[][] points) {
		int index = 0;
		double[] m = new double[(n * (n - 1) / 2)];
		double[] k = new double[(n * (n - 1) / 2)];
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				m[index] = (points[i][1] - points[j][1]) / (points[i][0] - points[j][0]);
				index++;
			}			
		}		
		for (int i = 0; i < (n * (n - 1) / 2); i++) {
			System.out.println(m[i]);
		}
		System.out.println();
	}
	
	public static void intersect(int n, double[][] points) {
		int result = 0;
		for (int i = 0; i < points.length; i++) {
			
		}
		double a = points[0][1] - points[1][1]; // y1 - y2
	    double b = -(points[0][0] - points[1][0]); // -(x1 - x2)
	    double c = points[2][1] - points[3][1]; // y3 - y4
	    double d = -(points[2][0] - points[3][0]); // -(x3 - x4)
	    double e = (points[0][1] - points[1][1]) * points[0][0] - 
	      		(points[0][0] - points[1][0]) * points[0][1]; // (y1 - y2) * x1 - (x1 - x2) * y1
	    double f = (points[2][1] - points[3][1]) * points[2][0] - 
	        		(points[2][0] - points[3][0]) * points[2][1]; // (y3 - y4) * x3 - (x3 - x4) * y3
	   
	    if (a * d - b * c == 0) //若平行
	    	System.out.println("The two lines are parallel");
	    /*
	    else //否則有交點
	    {
	    	double[] result = new double[2]; //求出交點座標
	        result[0] = (e * d - b * f) / (a * d - b * c);
	        result[1] = (a * f - e * c) / (a * d - b * c);
	        return result;
	    }
	    if (result == null) //印出結果
	    	System.out.println("The two lines are parallel");
		else 
			System.out.println("The intersecting point is at (" + result[0] + ", " + result[1] + ")");	
		
		*/
	}
}
//k[i] = (-(points[i+1][0] - points[i][0]) * - points[i][1]) + 
//((points[i+1][1] - points[i][1]) * - points[i][0]);
//(-(X2-X1)*-Y1)+((Y2-Y1)*-X1);
//n * (n - 1) / 2