package Practical;

import javax.swing.JOptionPane;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * 2.	Write a program that inputs 10 student's marks. At the end, the program should print a message saying how many students have passed and how many students have failed. The pass mark is 50%.
		 */
		
		String Input;
		String Output;
		int Count;
		int Grade;
		int Mark = 50;
		int passMark = 0;
		int failMark = 0;
		
			Output = "Grades are : \n";
		
		for(Count = 0; Count < 10; Count++) {
			
			Input = JOptionPane.showInputDialog("Enter Grade " + (Count + 1) + " :");
			Grade = Integer.parseInt(Input);
			
			while(Grade < 0 || Grade > 100) {
				Input = JOptionPane.showInputDialog("Enter a Valid Grade from 0 to 100 " + (Count + 1) + " :");
				Grade = Integer.parseInt(Input);
			}
				
			
			if(Grade >= Mark) {
					Output += Grade + " % : Passed \n";
					Mark++;
				}else{
					Output += Grade + " % : Tray Harder \n";
					Mark++;
				}
			
		
			if(Grade >= Mark) {
				passMark++;
			}else {
				failMark++;
			}
		
		}
		
		Output += "\n Number of Students that Passed:" + passMark;
		Output += "\n Number of students who failed: " + failMark;
		
		JOptionPane.showMessageDialog(null, Output);
			
			
	}

}
