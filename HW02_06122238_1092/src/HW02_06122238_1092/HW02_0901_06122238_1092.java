//日四B 06122238 施佳妏
package HW02_06122238_1092;

public class HW02_0901_06122238_1092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1 = new Rectangle(4, 40); //創建一個寬4高40的rectangle1
		Rectangle rectangle2 = new Rectangle(3.5, 35.9); //創建一個寬3.5高35.9的rectangle2
		//顯示結果
		System.out.println("The area of a rectangle with width " + rectangle1.weight + " and height " +
				rectangle1.height + " is " + rectangle1.getArea());
		System.out.println("The perimeter of a rectangle is " + rectangle1.getPerimeter());
		System.out.println("The area of a rectangle with width " + rectangle2.weight + " and height " +
				rectangle2.height + " is " + rectangle2.getArea());
		System.out.println("The perimeter of a rectangle is " + rectangle2.getPerimeter());
	}
}
class Rectangle{ //定義一個有兩個建構子的類別Rectangle
	double weight = 1; //寬預設值為1
	double height = 1; //高預設值為1
	
	Rectangle(){ //創建一個沒有參數的預設建構子
		
	}
	
	Rectangle(double newWeight, double newHeight){ //創建一個有特定寬和高的建構子
		weight = newWeight;
		height = newHeight;
	}
	
	double getArea(){ 
		return height * weight; //回傳面積的值
	}
	
	double getPerimeter(){
		return (height + weight) * 2; //回傳周長的值
	}
}

