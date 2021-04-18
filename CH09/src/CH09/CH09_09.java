package CH09;

public class CH09_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6, 4);
		RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("r1's perimeter is " + r1.getPerimeter() + " and area is " + r1.getArea());
		System.out.println("r2's perimeter is " + r2.getPerimeter() + " and area is " + r2.getArea());
		System.out.println("r3's perimeter is " + r3.getPerimeter() + " and area is " + r3.getArea());
	}

}

class RegularPolygon{
	private int n = 3;
	private double side = 1;
	private double x;
	private double y;
	
	RegularPolygon(){
		
	}
	
	RegularPolygon(int newN, double newSide){
		n = newN;
		side = newSide;
		//x = 0;
		//y = 0;
	}
	
	RegularPolygon(int newN, double newSide, double newX, double newY){
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}
	
	public int getN() {
		return n;
	}
	
	public void setN(int newN) {
		n = newN;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double newSide) {
		side = newSide;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double newX) {
		x = newX;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double newY) {
		y = newY;
	}
	
	public double getPerimeter() { //instance method → use object to call
		return n * side;
	}
	
	public double getArea() { //instance method → use object to call
		return n * side * side / (4 * Math.tan(Math.PI / n));
	}
}
