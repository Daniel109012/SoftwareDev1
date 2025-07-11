package Assignment01;

import java.util.Random;

import javax.swing.JOptionPane;

public class Assessment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		String rowAsString;
		String columnAsString;
		String output;
		int N ;
		int M ;
		
		Random randomNum = new Random(); 
		
		do{
			rowAsString = JOptionPane.showInputDialog("Enter the number of Rows between 3 and 10");
		N = Integer.parseInt(rowAsString);
		}while(3 > N || 10 < N);
		
		do{
		columnAsString = JOptionPane.showInputDialog("Enter the number or Columns");
		M = Integer.parseInt(columnAsString);
		}while(3 > M || 10 < M);
		
		int[][] grid = new int[N][M];

		
		output = (" Assignment One \n\n");
		
		for(int r = 0; r < N; r++) {
			for(int c = 0; c < M; c++) {
				grid[r][c] = randomNum.nextInt(1000);//generate random numbers from 0 - 1000
				
				output = output + ("   "+ grid[r][c]);
			}
			
			output += "\n"; // Add a newline after each row
		}
		
			JOptionPane.showMessageDialog(null, output);
		
	}//end main

}//end class
