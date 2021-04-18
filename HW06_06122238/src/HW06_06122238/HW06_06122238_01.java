//日四B 06122238 施佳妏
package HW06_06122238;

public class HW06_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int line = 8; //設有八層line
		
		for (int i = 1; i <= line; i++) //控制迴圈1~8層
		{
			for (int j = 1; j <= (line - i); j++) //控制空白數，一次印五格，第1層印(line-1)次，依此類推
				System.out.print("     "); 
			for (int j = 0; j < i; j++) //控制左半邊遞增的數，印出3的0次方~i-1次方
			    System.out.printf("%5d", (int)Math.pow(3, j));
			for (int j = i - 2; j >= 0; j--) //控制右半邊遞減的數，印出3的i-2次方~0次方
			    System.out.printf("%5d", (int)Math.pow(3, j));			    
			System.out.println(); //印完一行換行
		}
	}

}
