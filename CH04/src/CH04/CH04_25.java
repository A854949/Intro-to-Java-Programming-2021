//Generate vehicle plate numbers
package CH04;

public class CH04_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter1 = (char)(int)(Math.random() * 26 + 65);
		char letter2 = (char)(int)(Math.random() * 26 + 65);
		char letter3 = (char)(int)(Math.random() * 26 + 65);
		
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		int number4 = (int)(Math.random() * 10);
		
		System.out.println("The vehicle plate numbers is " + letter1 + letter2 + 
				letter3 + number1 + number2 + number3 + number4);
	}

}
