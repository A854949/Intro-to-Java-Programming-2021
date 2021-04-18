package EX01_06122238;

import java.util.Scanner;

public class Hex2Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number");
		String hex = input.nextLine();
		System.out.println("The decimal value for hex number "
				+ hex + " is " + hexToDecimal(hex.toUpperCase()));
	}
	public static int hexToDecimal(String hex) {
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			//decimalValue = decimalValute
		}
		return decimalValue;
	}
}
