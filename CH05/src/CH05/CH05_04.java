//Coversion from inch to centimerter
package CH05;

public class CH05_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%s%20s\n", "Inches", "Centimeters");
		for (int i = 1; i <= 3; i++)
			System.out.printf("%-3d%16.2f\n", i, i * 2.54);
		for (int i = 4; i <= 10; i++)
			System.out.printf("%-3d%17.2f\n", i, i * 2.54);
	}

}
