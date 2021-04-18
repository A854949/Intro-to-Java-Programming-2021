//日四B 06122238 施佳妏
package HW08_06122238;

public class HW08_06122238_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i < 1200; i++) { // i從2開始檢查，直到i<1200
			if (isPrime(i) && isPrime(i + 2)) { // 若i和i+2皆為質數
				System.out.printf("(%d, %d)\n", i, i + 2); // 顯示結果			
			}			
		}
		
	}
		
	public static boolean isPrime(int number) { // 檢查number是否為質數
		for (int divisor = 2; divisor <= number / 2; divisor++) { // divisor從2開始檢查
			if (number % divisor == 0) { // 若整除則number不為質數
				 return false; // 回傳false
			}
		}
		return true; // 回傳true
	}

}
