//Find numbers divisible by 3 and 4, but not both
package CH05;

public class CH05_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 100; i <= 200; i++)
		{
			if (i % 3 == 0 ^ i % 4 == 0)
			{
				count++;
				if (count % 10 == 0)
					System.out.println(i);
				else
					System.out.print(i + " ");
			}
		}

	}

}
