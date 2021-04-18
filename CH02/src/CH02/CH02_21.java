package CH02;

import java.util.Scanner;

public class CH02_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        
        System.out.print("Enter annual interest rate in percent: ");
        double monthlyInterest = input.nextDouble() / 100 / 12;
        
        System.out.print("Enter the number of years: ");
        double years = input.nextDouble();
       
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterest, years * 12);

        System.out.printf("The accumulated value is $%.2f", futureInvestmentValue);

	}

}
