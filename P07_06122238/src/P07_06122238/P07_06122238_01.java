//日四B 06122238 施佳妏
package P07_06122238;

import java.io.*;
import java.util.*;

public class P07_06122238_01 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:/4IN.txt");
		Scanner input = new Scanner(file);
		Scanner input2 = new Scanner(System.in);
		
		String name[] = new String[50];
		int price[] = new int[50];		
		int index = 0;
		
		while (input.hasNext()) {
			name[index] = input.next();
			price[index] = input.nextInt();
			index++;
		}
		input.close();
		
		System.out.print("");
		String x = input2.next();
		int y = input2.nextInt();
		
		boolean isName = false;
		for (int i = 0; i < index; i++) {
			isName = true;
			if (name[i].equals(x)) {
				System.out.println(x + " " + price[i] + " " + y + " " + y * price[i]);
			}				
		}
		if (isName == false)
			System.out.print("商品編號" + x + "不存在");
	}

}
