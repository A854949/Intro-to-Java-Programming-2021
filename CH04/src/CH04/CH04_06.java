//Random points on a circle
package CH04;

public class CH04_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double alpha = Math.random() * (2 * Math.PI);
		double x1 = 40 * Math.cos(alpha);
		double y1 = 40 * Math.sin(alpha);
		
		alpha = Math.random() * (2 * Math.PI);
		double x2 = 40 * Math.cos(alpha);
		double y2 = 40 * Math.sin(alpha);
		
		alpha = Math.random() * (2 * Math.PI);
		double x3 = 40 * Math.cos(alpha);
		double y3 = 40 * Math.sin(alpha);
		
		double a = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double b = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		
		double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double angleC = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * b * a)));
		
		System.out.printf("The first angle in degree is %.2f\n", angleA);
		System.out.printf("The second angle in degree is %.2f\n", angleB);
		System.out.printf("The third angle in degree is %.2f\n", angleC);
		
	}

}
