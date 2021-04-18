//Find numbers divisible by 3 and 4
package CH05;

public class CH05_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count = 0;
	        for(int i = 100;i <= 1000;i++)
	        {
	            if(i % 3 == 0 && i % 4 == 0)
	            {
	                System.out.printf("%d ",i);
	                count++;
	                if(count % 10 == 0)
	                    System.out.print("\n");
	            }
	        }

	}

}
