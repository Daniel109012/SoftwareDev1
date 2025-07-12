package Assignment01;

import javax.swing.*;
import java.util.Random;

public class assessment01Methods {

	public static void grid() {
		
		
		String rowAsString; //input number of rows in a string
		String columnAsString; // input number of columns in a string
		int N ; //rows
		int M ; //columns
		
		
		do{
			rowAsString = JOptionPane.showInputDialog("Enter the number of Rows between 3 and 10");
		N = Integer.parseInt(rowAsString); // convert string to Integer for number of rows
		}while(N < 3 || N > 10); // only accepts values between 3 and 10
		
		do{
		columnAsString = JOptionPane.showInputDialog("Enter the number or Columns  between 3 and 10");
		M = Integer.parseInt(columnAsString);  // convert string to Integer for number of columns
		}while(M < 3 || M > 10); // only accepts values between 3 and 10
		
		int[][] grid = gridNumbers(N , M); // calls random numbers from the above input

		assessment01Methods.table(grid); // calls the table to input the data

	} // end grid method
	
	
	//--------------------------------------------------------------------------------------
	
	
	public static int[][] gridNumbers(int N, int M){
		
		// collect random numbers based on the user input from above
		
		int[][] grid = new int[N][M]; // 2D array for table
		Random randomNum = new Random(); 
		String output;

		
		output = (" Assignment One \n\n");
		
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if(r %2 == 0) {
					grid[r][c] = 2 * randomNum.nextInt(100) + 1;//generate random numbers from 1 - 1000
					
				}else {
					grid[r][c] = 1 + 2 * randomNum.nextInt(100) + 1;//generate random numbers from 1 - 1000
				}
			
			}
			
		}
		
		JOptionPane.showMessageDialog(null, output);
		
		return grid; //returns the randome numbrs 
		
	}//exit gridNumbers method
	
	
	//--------------------------------------------------------------------------------------
	
	
	public static void table(int[][] grid) {
		
		//to display the table
		
		int N = grid.length;
		int M = grid[0].length;
		
		Object[][] matrix = new Object[N][M];
		for(int r = 0; r < N; r++) {
			for(int c = 0; c < M; c++) {
				matrix[r][c] = grid[r][c];
				
			}//exit for
		}//end for
		
		String[] MName = new String[M];
		for(int c = 0; c < M; c++) {
			MName[c] = "C" + (c + 1);
		}//exit column nameing for
		
		JTable table = new JTable(matrix, MName);
		JScrollPane scrollPane = new JScrollPane(table);
		JOptionPane.showMessageDialog(null, scrollPane, "Assignment One", JOptionPane.INFORMATION_MESSAGE);
		
	}//exit table method	
	
	
	//-------------------------------------------------------------------------------------

}//end class


