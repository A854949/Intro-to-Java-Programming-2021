//日四B 06122238 施佳妏
package P06_06122238;

import java.util.Scanner;

public class P06_06122238_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入字串: ");
		String a = input.nextLine();
		System.out.print("請輸入字母: ");
		String b = input.nextLine();
		char c = b.charAt(0);
		System.out.println("出現" + count(a,c) + "次");
	}	
	public static int count(String str, char a) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				count++;
			}	
		}
		return count;
	}
		

}
