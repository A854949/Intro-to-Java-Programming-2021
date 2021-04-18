//Find the highest scores
package CH05;

import java.util.Scanner;

public class CH05_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of the students: ");
		int numberOfStudent = input.nextInt();
		double highestScore = 0;
		double tempScore = 0;
		String topStudentName = "";
		String tempName = "";
		
		for (int i = 1; i <= numberOfStudent; i++)
		{
			System.out.print("Enter a student name: ");
			tempName = input.next();
			System.out.print("Enter a student score: ");
			tempScore = input.nextDouble();
			
			if (tempScore > highestScore)
			{
				highestScore = tempScore;
				topStudentName = tempName;
			}
		}
		
		System.out.println("Top student " + topStudentName + " 's score is " + highestScore);

	}

}
