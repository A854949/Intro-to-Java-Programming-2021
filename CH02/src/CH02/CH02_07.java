package CH02;

import java.util.Scanner;

public class CH02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes:");
		
        long minutes = input.nextLong();
      
        long years = minutes / (365 * 24 * 60);
        long days = minutes % (365 * 24 * 60) / (24 * 60);
     
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days ");
		
	}

}
