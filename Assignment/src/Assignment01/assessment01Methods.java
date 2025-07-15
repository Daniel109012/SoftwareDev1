package Assignment01;

import javax.swing.*;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.util.Random;

public class assessment01Methods {

	public static void grid() {
		
		
		String rowAsString; //input number of rows in a string
		String columnAsString; // input number of columns in a string
		int N = 0; //rows
		int M = 0 ; //columns
		String digitPattern = "\\d+";
		boolean validInput;
		
		
		do{
			
			validInput = true;
			
			rowAsString = JOptionPane.showInputDialog("Enter the number of Rows between 3 and 10");
			if (rowAsString == null || rowAsString.trim().isEmpty() || !rowAsString.trim().matches(digitPattern)) {
				JOptionPane.showMessageDialog(null, "Enter the number of Rows between 3 and 10");
				validInput = false;
				continue;
			}
			
			
			N = Integer.parseInt(rowAsString); // convert string to Integer for number of rows
		
			if(N < 3 || N > 10 || rowAsString == null || rowAsString.trim().isEmpty() || !rowAsString.trim().matches(digitPattern)) {
				JOptionPane.showMessageDialog(null, "Enter the number of Rows between 3 and 10");
				validInput = false;
			}
		
		}while(!validInput); // only accepts values between 3 and 10
		
			//==========================================================================//
		
		
		do{
			
			validInput = true;
			
		columnAsString = JOptionPane.showInputDialog("Enter the number or Columns  between 3 and 10");
		if (columnAsString == null || columnAsString.trim().isEmpty() || !columnAsString.trim().matches(digitPattern)) {
			JOptionPane.showMessageDialog(null, "Enter the number of Columns between 3 and 10");
			validInput = false;
			continue;
		}
		M = Integer.parseInt(columnAsString);  // convert string to Integer for number of columns
		
		if(M < 3 || M > 10) {
			JOptionPane.showMessageDialog(null, "Enter the number of Columns between 3 and 10");
			validInput = false;
		}
		
		}while(!validInput); // only accepts values between 3 and 10
		
			//========================================================================//
		
		int[][] grid = gridNumbers(N, M); // calls random numbers from the above input

		assessment01Methods.table(grid); // calls the table to input the data

	} // end grid method
	
	
	//--------------------------------------------------------------------------------------//
	
	
	public static int[][] gridNumbers(int N, int M){
		
		// collect random numbers based on the user input from above
		
		int[][] grid = new int[N][M]; // 2D array for table
		Random randomNum = new Random(); 

		
		
		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {
				if(r %2 == 0) {
					grid[r][c] = 2 * randomNum.nextInt(100) + 1;//generate random numbers from 1 - 1000
					
				}else {
					grid[r][c] = 1 + 2 * randomNum.nextInt(100) + 1;//generate random numbers from 1 - 1000
				}
			}	
		}
	
		return grid; //returns the random numbers 
		
	}//exit gridNumbers method
	
	
	//--------------------------------------------------------------------------------------
	
	
	public static void table(int[][] grid) {
		
		//to display the table
		int N = grid.length; //rows
		int M = grid[0].length; //columns
		

	 // Column headers (add one for row label and one for row average)
		String[] colName = new String[M + 2];
		colName[0] = "Row";
			for (int c = 1; c <= M; c++) {
				colName[c] = "C" + c;
			}
			colName[M + 1] = "Row Avg";
			

		// Table data (add one row for column averages)
		Object[][] matrix = new Object[N + 1][M + 2];
		

			// Fill in data and compute row averages
		for (int r = 0; r < N; r++) {
			matrix[r][0] = "R" + (r + 1); // Row label
			int rowSum = 0;
			for (int c = 0; c < M; c++) {
				matrix[r][c + 1] = grid[r][c];
				rowSum += grid[r][c];
			}
		matrix[r][M + 1] = String.format("%.2f", (double) rowSum / M); // Row average
		}
	

		// calculate column averages
		matrix[N][0] = "Col Avg";
		for (int c = 0; c < M; c++) {
			int colSum = 0;
			for (int r = 0; r < N; r++) {
				colSum += grid[r][c];
			}
			matrix[N][c + 1] = String.format("%.2f", (double) colSum / N);
		}


		// calculate average of whole matrix
		double total = 0;
		int count = 0;
		for (int r = 0; r < N; r++) {
			for(int c = 0; c < M; c++) {
			total += grid[r][c];
			count++;
			}
		}
		matrix[N][M + 1] = String.format("%.2f", total / count);

		
		

		// Create the JTable
		JTable table = new JTable(matrix, colName);
		

		// Optional: Set in column widths (you can adjust these)
	//	for (int i = 0; i < table.getColumnCount(); i++) {
	//		table.getColumnModel().getColumn(i).setPreferredWidth(60);
	//	}

		// Wrap in scroll pane
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(800, 200)); // Set dialog initial size here
		
		


	// Get second-largest averages
	String summary = secondLargestAvg(matrix, N, M);
	JTextArea summaryArea = new JTextArea(summary);
	summaryArea.setEditable(false);
	summaryArea.setOpaque(false);
	summaryArea.setLineWrap(true);
	summaryArea.setWrapStyleWord(true);
	summaryArea.setAlignmentX(Component.CENTER_ALIGNMENT);

	// Combine table and summary in one panel
	JPanel panel = new JPanel();
	panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	panel.add(scrollPane);
	panel.add(Box.createVerticalStrut(10));
	panel.add(summaryArea);



		
		// Create a dialog
		JDialog dialog = new JDialog((Frame) null, "Assignment One", true); // true = modal
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

		// Add scroll pane to dialog
		dialog.getContentPane().add(panel);

		// Automatically size the dialog to fit the table
		dialog.pack();

		// Center the dialog on screen
		dialog.setLocationRelativeTo(null);

		// Show the dialog
		dialog.setVisible(true);


	}//exit table method	
	
	
	//-------------------------------------------------------------------------------------
	
	
	public static String secondLargestAvg(Object[][] matrix, int N, int M) {
		
		//find the second largest row average
		double maxRowAvg = -1, secondMaxRowAvg = -1;
		int MaxRowInd = -1, secondRowInd = -1;
		
		
		for(int r = 0; r < N; r++) {
			double avg = Double.parseDouble(matrix[r][M + 1].toString());
			if(avg > maxRowAvg) {
				secondMaxRowAvg = maxRowAvg;
				secondRowInd = MaxRowInd;
				maxRowAvg = avg;
				MaxRowInd = r;
			}else if (avg > secondMaxRowAvg && avg < maxRowAvg) {
				secondMaxRowAvg = avg;
				secondRowInd = r;
			}
		}
		
		
		//find the second largest Column average
		double maxColAvg = -1, secondMaxColAvg = -1;
		int maxColInd = -1, secondColInd = -1;
		
		
		for(int c = 1; c <= M; c++) {
			double avg = Double.parseDouble(matrix[N][c].toString());
			if(avg > maxColAvg) {
				secondMaxColAvg = maxColAvg;
				secondColInd = maxColInd;
				maxColAvg = avg;
				maxColInd = c;
			}else if (avg > secondMaxColAvg && avg < maxColAvg) {
				secondMaxColAvg = avg;
				secondColInd = c;
			}
		}
		
	//	if(secondRowInd == -1 || secondColInd== -1) {
	//		return "Not enough data to determin second largest averages";
	//	}
		
		
		//print out the column, rows and averages also the second larges averages
		String summary = String.format(
				"Second Largest Row Average:       	 R%d (%.2f)\nSecond Largest Column Average: 	C%d (%.2f)",

					secondRowInd+ 1, secondMaxRowAvg,
					secondColInd, secondMaxColAvg
				);
		
	 
	 return summary;
		

		
	}//exit Method
	
//-----------------------------------------------------------------------------------------------------

}//end class


