package Assignment01;

import javax.swing.*;

import java.awt.Dimension;
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
		
		int[][] grid = gridNumbers(N, M); // calls random numbers from the above input

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
	

		// Compute column averages
		matrix[N][0] = "Col Avg";
		for (int c = 0; c < M; c++) {
			int colSum = 0;
			for (int r = 0; r < N; r++) {
				colSum += grid[r][c];
			}
			matrix[N][c + 1] = String.format("%.2f", (double) colSum / N);
		}


		// Compute average of row averages
		double total = 0;
		for (int r = 0; r < N; r++) {
			total += Double.parseDouble(matrix[r][M + 1].toString());
		}
		matrix[N][M + 1] = String.format("%.2f", total / N);

		
		

		JTable table = new JTable(matrix, colName);
		// Allow column resizing
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Prevents automatic resizing so user can manually resize
		table.getTableHeader().setResizingAllowed(true);
		

		// Optional: Set preferred column widths (you can adjust these)
		for (int i = 0; i < table.getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setPreferredWidth(60);
		}

		// Wrap in scroll pane
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(800, 300)); // Set dialog size here

JDialog dialog = new JDialog();
dialog.setTitle("Assignment One");
dialog.setModal(true);
dialog.setResizable(true); // ✅ Makes the dialog resizable
dialog.getContentPane().add(scrollPane);
dialog.pack();
dialog.setLocationRelativeTo(null);
dialog.setVisible(true);

		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		// Show dialog
		JOptionPane.showMessageDialog(null, scrollPane, "Assignment One", JOptionPane.INFORMATION_MESSAGE);

	}//exit table method	
	
	
	//-------------------------------------------------------------------------------------
	


}//end class


