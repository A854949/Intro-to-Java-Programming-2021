//Coversion from C to F and F to C
package CH05;

public class CH05_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%s%20s%14s%12s\n", 
				"Celsius", "Fahrenheit     |", "Fahrenheit", "Celsius");
		
        for(int i = 1, j = 20;i <= 100 && j <= 270;i += 2, j += 5)
		{
			System.out.printf("%-3d%18.3f", i, i * 9.0 / 5 + 32);
			System.out.printf("     |     ");
			System.out.printf("%-3d%18.3f\n", j ,(j - 32) * 5.0 / 9);
		}
	
	}

}
