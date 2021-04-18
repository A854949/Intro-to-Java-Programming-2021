package CH05;

public class CH05_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int y = 1; y <= 5; y++) {
			for (int i = 1; i <= 5-y; i++)
				System.out.print(" ");
			for (int i = 1; i <= (y*2-1); i++)
				System.out.print("*");
			
		System.out.println();
		}
		for (int y = 4; y >= 1; y--) {
			for (int i = 1; i <= 5-y; i++)
				System.out.print(" ");
			for (int i = 1; i <= (y*2-1); i++)
				System.out.print("*");
			
		System.out.println();
		}
		
		int y = 5;		
		for (int i = 1; i <= y; i++) {
			for (int j = 1; j <= y-i; j++)
				System.out.print(" ");
			for (int j = 1; j <= (i*2-1); j++)
				System.out.print("*");
			
		System.out.println();		
		}
	}

}
