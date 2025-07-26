package practicals;

import javax.swing.JOptionPane;

public class DemoRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		Rectangle r4 = new Rectangle();
		
		r1.displayDetails();
		
		r2.setHeight(5);
		r2.setWidth(4);
		r2.displayDetails();

		r3.setHeight(1);
		r3.setWidth(1);
		r3.increaseHeightBy(4);
		r3.increaseWidthBy(2);
		r3.displayDetails();
		
		r4.setHeight(1);
		r4.setWidth(1);
		r4.increaseBy(3);
		r4.displayDetails();
		
		String Instance = "Number of Rectangle Instance count" + Rectangle.getRectangleInstanceCount();
		JOptionPane.showMessageDialog(null, Instance);
	}

}
