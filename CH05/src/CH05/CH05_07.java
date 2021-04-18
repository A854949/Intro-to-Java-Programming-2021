//Financial application: compute future tuition
package CH05;

public class CH05_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuitionPerYear = 10000;
		double sum = 0;
		
		for (int year = 1; year <= 14; year++)
		{
			tuitionPerYear *= 1.06;
			if (year == 10)
				System.out.println("The tuition fee in ten year is $" + tuitionPerYear);
			if (year > 10)
				sum += tuitionPerYear;			 	
		}
		System.out.println(
		 		"The total cost of 4 years tuition after the tenth year is $" + sum);
		
	}

}
