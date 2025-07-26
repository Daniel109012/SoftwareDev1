package practicals;

import javax.swing.JOptionPane;

public class Rectangle {
	
	private int width;
	private int height;
	private static int rectangleInstanceCount = 0;
	
	public Rectangle(int height, int width) {
		this.width = width;
		this.height = height;
		rectangleInstanceCount++;
	}
	
	public Rectangle() {
		this(1, 1);
	}
	
	public static int getRectangleInstanceCount() {
		return rectangleInstanceCount;
	}

	public String isSquare() {
		//returns true if the rectangle is a square, else returns false
		String output;
		
		if(width != height) {
			output = "it is a Rectangle";
		}else {
			output = "this is a square";
		}
		
		return output;
		
	}
	
//	+= adds
//	*= multiplyses 
//	to increaseby
	
	public void increaseHeightBy(int aY) {
		//increase the height of the rectangle by the amount aY
		this.height += aY;
	}
	public void increaseWidthBy(int anX) {
		//increase the width of the rectangle by the amount anX
		this.width += anX;
	}
	public void increaseBy(int aValue) {
		//increases the height of the rectangle by aValue and the width by aValue
		this.height += aValue; 
		this.width += aValue;
		
	}
	
//	getter for area
	
	public int getArea() {
		//Return the area of the rectangle
		return width * height;
	}
	
//	getter for Perimeter
	
	public int getPerimeter() {
		//Return the perimeter of the rectangle
		return 2 * (width + height);
	}
	
//	getter
	
	public int getHeight() {
		return this.height;
	}
	
//	setter
	
	public void setHeight(int height) {
		this.height = height;
	}
	
//	getter
	
	public int getWidth() {
		
		return this.width;
	}
	
//	setter
	
	public void setWidth(int width) {
		
		this.width = width;
	}
	
	public void displayDetails() {
		//Print the area and the perimeter of the rectangle
		
		String output;
		
		output = isSquare();
		JOptionPane.showMessageDialog(null, output);
		output = "Area : " + getArea();
		JOptionPane.showMessageDialog(null, output);
		output = "Perimeter : " + getPerimeter();
		JOptionPane.showMessageDialog(null, output);
		
		
	}
	

	
}
