package CH02;

import java.util.Scanner;

public class CH02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter miles：");
		double mile = input.nextDouble();
			System.out.println(mile + " miles is " + mile * 1.6 + " kilometers");
	}

}
