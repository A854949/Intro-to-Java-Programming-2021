package CH09;

public class CH09_02 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock stock = new Stock("ORCL", "OracleCorporation", 34.5, 34.35);
		System.out.println("The previous closing price is " + stock.previousClosingPrice);
		System.out.println("The current price is " + stock.currentPrice);
		System.out.println("The change percent is " + stock.getChangePercent() * 100 + "%");
	}
}
	
class Stock{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	public Stock(String newSymbol, String newName, double newPreviousClosingPrice, double newCurrentPrice){
		symbol = newSymbol;
		name = newName;
		previousClosingPrice = newPreviousClosingPrice;
		currentPrice = newCurrentPrice;
	}
	
	double getChangePercent(){
		return (currentPrice - previousClosingPrice) / previousClosingPrice;
	}
}

