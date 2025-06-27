package classMaterialUnit03;

public class WritingX {
/*
The program writes a rectangle in the command line
#     #
 #   # 
  # #  
   #   
  # #  
 #   # 
#     #
*/
	
//1st row: the 1st and the 7th column is #
//2nd row: the 2nd and the 6th column is #
//3rd row: the 3rd and the 5th column is #
//4th row: the 4th and the 4th column is #
//5th row: the 3rd and the 5th column is #
//6th row: the 2nd and the 6th column is #
//7th row: the 1st and the 7th column is #

	public static void main(String[] args) {	
		int numRows = 7;
		int numColumns = 7;
		
		for (int row = 1; row <= numRows; row++) {
			for (int column = 1; column <= numColumns; column++) {
				if (row == column || ((row + column) == (numRows + 1)))
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
