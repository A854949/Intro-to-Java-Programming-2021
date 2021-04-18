package EX01_06122238;

import java.util.Scanner;

public class PrimeNumberMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("輸入第一個整數 : ");
		int a = input.nextInt();
		System.out.print("輸入第二個整數 : ");
		int b = input.nextInt();
		
		for (int i = a; i <= b; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;
				if(count % 10 == 0)
					System.out.println();
            }
		}
	}	
		public static boolean isPrime(int i) {
			for (int n = 2; n <= i / 2; n++) {
				if (i % n == 0) {
					return false;
				}
			}
			return true;
		}
}
