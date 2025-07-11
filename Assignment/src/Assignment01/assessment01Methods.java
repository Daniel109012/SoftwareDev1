package Assignment01;

import javax.swing.*;
import java.util.Random;
import javax.swing.table.*;
import java.awt.*;

public class assessment01Methods {

	public static void grid(int N, int M) {
		
		
		//int[] rowNames = grid;
		String rowAsString;
		String columnAsString;
		String output;
		int[][] grid = new int[N][M];
		Random randomNum = new Random();
		
		
		//Input number of Rows
		rowAsString = JOptionPane.showInputDialog("Enter the number of Rows");
		N = Integer.parseInt(rowAsString);
		
		//Enter number of Columns
		columnAsString = JOptionPane.showInputDialog("Enter the number or Columns");
		M = Integer.parseInt(columnAsString);
		
		output = " Assignment One";
		
		//generate random numbers in 2d array
		for(int r = 0; r < N; r++) {
			for(int j = 0; j < M; j++) {
				grid[r][j] = randomNum.nextInt(1001);//generate random numbers from 0 - 1000
				output = output + grid[r][j];
			}
			output = output + "\n";
		}
		
		//print out the random numbers
		
	/*	for(int r = 0; r < N; r++) {
			for(int j = 0; j < M; j++) {
				
				output = output + grid[r][j] + "\t" + "\n";
			}
			
			
		}*/
		
		JOptionPane.showMessageDialog(null, output, "assignment01", JOptionPane.INFORMATION_MESSAGE);
		

	} // end grid

}//end class
