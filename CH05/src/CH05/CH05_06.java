//Conversion from square meter to ping
package CH05;

public class CH05_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%s%23s%14s%12s\n",
				"Ping", "Square meter  |", "Square meter", "Ping");
        for(int i = 10, j = 30;i <= 80 && j <= 100;i += 5, j += 5)
		{
			System.out.printf("%-3d%21.3f", i, i * 3.305);
			System.out.printf("  |  ");
			System.out.printf("%-3d%22.3f\n", j ,j / 3.305);
		}
	}

}
