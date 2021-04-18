//Coversion from C to F
package CH05;

public class CH05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%s%20s\n", "Celsius", "Fahrenheit");
		for (int i = 0; i <= 100; i += 2)
			System.out.printf("%-3d%24.1f\n", i, i * 9.0 / 5 + 32);
		
	}

}
