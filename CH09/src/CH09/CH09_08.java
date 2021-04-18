package CH09;

public class CH09_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan1 = new Fan(); 
		fan1.setSpeed(3);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		System.out.println("fan1\n" + fan1.toString());
		
		Fan fan2 = new Fan();
		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		System.out.println("\nfan2" + fan2.toString());
	}

}
class Fan{
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	Fan(){
		
	}
	
	//accessor method
	public int getSpeed() {
		return speed;
	}
	
	public boolean getOn() {
		return on;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	//mutator method
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	
	public void setOn(boolean newOn) {
		on = newOn;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public String toString() {
		return (on) ? ("speed: " + speed + "\ncolor: " + color + "\nradius: " + radius + 
				"\nThe fan is on") : ("\ncolor: " + color + "\nradius: " + radius + "\nThe fan is off");
	}
}
