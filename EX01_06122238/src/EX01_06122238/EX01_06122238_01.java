package EX01_06122238;

import java.io.*;
import java.util.*;

public class EX01_06122238_01 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C://4IN.TXT");
		Scanner input = new Scanner(file);
		int index = 0;
		String[] name = new String[50];
		int[] tel = new int[50];
		
		while (input.hasNext()) {
			name[index] = input.next();
			tel[index] = input.nextInt();
			index++;
		}
		input.close();
		//bubble sort
		for (int i = 0; i < index; i++) {
			for (int j = i; j < index - 1; j++) {
				if (tel[j] > tel[j+1]) {
					int temp1 = tel[j];
					tel[j] = tel[j+1];
					tel[j+1] = temp1;
					
					String temp2 = name[j];
					name[j] = name[j+1];
					name[j+1] = temp2;
				}
			}
		}
		
		File ofile = new File("C://4OUT.TXT");
		PrintWriter output = new PrintWriter(ofile);
		for (int i = 0; i < index ; i++) {
			output.print(name[i]);
			output.print("0" + tel[i]);
			output.println();
		}
	}

}
