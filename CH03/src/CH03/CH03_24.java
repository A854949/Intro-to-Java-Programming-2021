//Game: pick a card
package CH03;

public class CH03_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int card = (int)(Math.random() * 52);
		
		System.out.print("The card you picked is ");
		if (card % 13 == 0)
			System.out.print("Ace of ");//如果除以13餘數
		else if (card % 13 == 10)
			System.out.print("Jack of ");
		else if (card % 13 == 11)
			System.out.print("Queen of ");
		else if (card % 13 == 12)
			System.out.print("King of ");
		else
		    System.out.print((card % 13) + " of ");
		
		if (card / 13 == 0)
		    System.out.println("Clubs");
		else if (card / 13 == 1)
		    System.out.println("Diamonds");
		else if (card / 13 == 2)
		    System.out.println("Hearts");
		else if (card / 13 == 3)
		    System.out.println("Spades");
		
		
		
	}

}
