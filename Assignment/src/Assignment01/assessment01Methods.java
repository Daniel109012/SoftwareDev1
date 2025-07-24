// Bernard Daniel Young
// 40691875

package Assignment01;

import javax.swing.*;
import java.awt.Font;
import java.util.Random;

public class assessment01Methods {

	public static void gridInput() {
		
		//user Input for amount of rows an columns that are needed for the table
		//it does not allow the input of blank space, characters or strings
		
		
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
		
			if(N < 3 || N > 10) {
				JOptionPane.showMessageDialog(null, "Enter the number of Rows between 3 and 10");
				validInput = false;
			}
		
		}while(!validInput); // only accepts values between 3 and 10
		
		
		
	//================================================================================================================//
		
		
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
		
			//========================================================================\\
		
			randomNumbers(N, M); // calls random numbers from the above input
	
		
	} // end grid method
	
	
	//===========================================================================================\\
		//==================================================================================\\


	public static String randomNumbers(int N, int M) {
		
//		generates random numbers for the table, arranges them in odd numbers for odd rows 
//		and even numbers for even rows
//		averages the rows and columns and provides a total average for the table
//		returns the output to the gridInput method.
		
		
		int[][] matrix = new int[N][M]; // 2D array for table
		Random randomNum = new Random();
		StringBuilder output = new StringBuilder();
		int[] columnSums = new int[M];
	    double[] rowAverages = new double[N];
	    double[] columnAverages = new double[M];
		int totalSum = 0;
		
	    for (int r = 0; r < N; r++) {
	    	int rowSum = 0;
	        for (int c = 0; c < M; c++) {
	            int value;
	            if (r % 2 == 0) {
	                value = 2 * randomNum.nextInt(100); // even
	            } else {
	                value = 2 * randomNum.nextInt(100) + 1; // odd
	            }
	            matrix[r][c] = value;
	            rowSum += value;
	            columnSums[c] += value;
	            totalSum += value;
	            
	            output.append(String.format(" | %8d |",value));
	        }
	     //adds the average of the row on a new entry   
	        rowAverages[r] = (double) rowSum / M;
	        output.append(String.format(" | %8.2f |", rowAverages[r])); // row average
	        output.append("\n");
	    }
	    
	  //adds the average of the column on a new entry  
	    for (int c = 0; c < M; c++) {
	    	columnAverages[c] = (double) columnSums[c] / N;
	        output.append(String.format(" | %8.2f |", columnAverages[c]));
	    }
	    
	    // Append overall average in the last "corner" cell
	    double overallAvg = (double) totalSum / (N * M);
	    output.append(String.format(" | %8.2f |", overallAvg)); // display bottom-right corner Average
	    
	    // Find second largest row average
	    double secondLargestRowAvg = SecondLargest(rowAverages); //calls method 
	    double secondLargestColAvg = SecondLargest(columnAverages); //calls method 
	    
	    output.append("\n\nSecond Largest Row Average: " + String.format("%.2f", secondLargestRowAvg));
	    output.append("\nSecond Largest Column Average: " + String.format("%.2f", secondLargestColAvg));
	    
	    output.append(matrixMod(matrix, rowAverages, columnAverages)); //calls method 
	    
	    
	    	JTextArea textArea = new JTextArea(output.toString());
	    	textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
	    	JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "Matrix Output", JOptionPane.PLAIN_MESSAGE);
	    	return output.toString(); //returns a String here
	}// exit randomNumbers method
	
//===========================================================================================\\
	//==================================================================================\\
	
	//takes the second Largest of averages for rows and columns 
	//returns the result to the randomNumbers() to be displayed
	
	private static double SecondLargest(double[] array) {
	    double largest = Double.NEGATIVE_INFINITY;
	    double second = Double.NEGATIVE_INFINITY;

	    for (double num : array) {
	        if (num > largest) {
	            second = largest;
	            largest = num;
	        } else if (num > second && num < largest) {
	            second = num;
	        }
	    }

	    return second;
	}// exit SecondLargest method
	
	
	//===========================================================================================\\
		//==================================================================================\\
	
	
	public static String matrixMod(int[][] matrix, double[] rowAverages, double[] columnAverages) {
		
		//creates the table with 1, -1 and 0 based on the tabled output above
		//and indicates how many  1, -1 and 0 are in the table
		//the method is returned to the randomNumbers() method
		
		
		int N = matrix.length;
	    int M = matrix[0].length;
		int[][] modifiedMatrix = new int[N][M];
		StringBuilder output = new StringBuilder();		// === Create and display modified matrix ===
		
	    int countPositive = 0;
	    int countNegative = 0;
	    int countZero = 0;
		
	    output.append("\n\nModified Matrix (+1, 0, -1):\n\n");
	    
	    
	    for (int r = 0; r < N; r++) {
	        for (int c = 0; c < M; c++) {
	            int value = matrix[r][c];
	           
				double rowAvg = rowAverages[r];
	           
				double colAvg = columnAverages[c];

	          
				if (value > rowAvg && value > colAvg) {
	                modifiedMatrix[r][c] = 1;
	                countPositive++;
	            } else if (value < rowAvg && value < colAvg) {
	                modifiedMatrix[r][c] = -1;
	                countNegative++;
	            } else {
	                modifiedMatrix[r][c] = 0;
	                countZero++;
	            }
	            output.append(String.format(" | %8d", modifiedMatrix[r][c]));
	        }//exit 
	        output.append(" |\n");
	    }//exit for
	    
	    
	    //print out count of Positive, Negative, and Zero
	    output.append("\nCount of +1: ").append(countPositive);
	    output.append("\nCount of -1: ").append(countNegative);
	    output.append("\nCount of  0: ").append(countZero);
	    
	    return output.toString() ;
	}//exit method matrixMod
	
	
	//===========================================================================================\\
		//==================================================================================\\
	
}//exit class body

