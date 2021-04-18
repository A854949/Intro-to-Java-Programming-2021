package EX01_06122238;

import java.util.Scanner;

public class EX01_06122238_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double score = input.nextDouble();
		System.out.print("The grade is " + getGrade(score));
		}
	
	public static char getGrade(double score) {
		if (score >= 90.0) 
			return 'A';
		else if (score >= 80.0) 
			return 'B';
		else if (score >= 70.0) 
			return 'C';
		else if (score >= 60.0) 
			return 'D';
		else 
			return 'F';
	}

}
