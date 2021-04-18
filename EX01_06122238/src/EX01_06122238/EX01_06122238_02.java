package EX01_06122238;

import java.util.Scanner;

public class EX01_06122238_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		String aa[] = a.split("\\.");
		if (aa[aa.length - 1].equals("tw")) {
			
		}
		
		for (int i = aa.length - 1; i >= 0; i--) {
			System.out.print(aa[i] + " ");
		}
	}

}
