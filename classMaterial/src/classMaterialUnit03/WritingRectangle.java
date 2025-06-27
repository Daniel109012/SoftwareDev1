package classMaterialUnit03;

public class WritingRectangle {
/*
The program writes a rectangle in the command line
#######
#     #
#     #
#     #
#     #
#     #
#######
*/
	public static void main(String[] args) {		
		int numRows = 4;
		int numColumns = 7;
		
		for (int row = 1; row <= numRows; row++) {
			for (int column = 1; column <= numColumns; column++) {
				if (row == 1 || column == 1 || row == numRows || column == numColumns)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
