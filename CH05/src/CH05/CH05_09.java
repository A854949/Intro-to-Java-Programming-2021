//Find the two lowest scores
package CH05;

import java.util.Scanner;

public class CH05_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of students
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		int score, 					// Holds students' score		
			 lowest = 0, 			// Highest score 
			 secondLowest = 0;	// Second highest score
		String name = "", 		// Holds students' name
				 student1 = "", 	// Highest scoring student name
				 student2 = "";	// Second highest scoring student name
		
		// Prompt the user to enter each students' name and score
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Enter the student's name: ");
			name = input.next();
            System.out.print("Enter the student's score: ");
			score = input.nextInt();

			if (i == 0) {
				// Make the first student the lowest scoring student so far
				lowest = score;
				student1 = name;
			}
			else if (i == 1 && score < lowest) {
				// Second student entered scored
				// lower than first student
				secondLowest = lowest;
				lowest = score;
				student2 = student1;
				student1 = name;
			}
			else if (i == 1) {
				// Second student entered scored
				// lower than first student
				secondLowest = score;
				student2 = name;
			}		
			else if (i > 1 && score < lowest && score < secondLowest) {
				// Last student entered has the lowest score 
				secondLowest = lowest;
				student2 = student1;
				lowest = score;
				student1 = name;
			}
			else if (i > 1 && score < secondLowest) {
				// Last student entered has the second lowest score 
				student2 = name;
				secondLowest = score;
			}
		}

		// Display the student with the lowest score
		// and the student with the second-lowest score.
		System.out.println(
			"Lowest scoring student: " + student1 + 
			"\nSecond Lowest scoring student: " + student2);
		
/*        double firstLowestScore = 0;
        double secondLowestScore = 0;
        double tempScore = 0;
        String firstStudentName = "";
        String secondStudentName = "";
        String tempName = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the students: ");
        int numberOfStudent = input.nextInt();

        for(int i = 1;i <= numberOfStudent;i++)
        {
        	System.out.print("Enter the student's name: ");
            tempName = input.next();
            System.out.print("Enter the student's score: ");
            tempScore = input.nextDouble();

                if(tempScore < firstLowestScore)
                {
                    secondStudentName = firstStudentName;
                    secondLowestScore = firstLowestScore;
                    firstStudentName = tempName;
                    firstLowestScore = tempScore;
                    continue;
                }

                if(tempScore < secondLowestScore)
                {
                    secondStudentName = tempName;
                    secondLowestScore = tempScore;
                }
            }
        
            System.out.println("The name of the student with the lowest score is " + firstStudentName);
            System.out.println("The name of the student with the second-lowest score is " + secondStudentName);
*/        
	}

}
