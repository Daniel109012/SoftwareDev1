package Practical;

import javax.swing.JOptionPane;

public class SampleQ03 {
		
		public static void main(String[] args) {
			
			/*
			 * 3.	Write a program to read in 10 student's marks (integers between 0 and 100). Store the results in an integer array. 
			 * 		The program should print out the frequency of the grades achieved. 
			 * 		The program should also validate the marks as they are entered.
			 *      mark	grade
			 *      75 - 100	A
			 * 		60 – 74		B
			 * 		50 - 59		C
			 * 		0 - 49		F
			 */
			
			/*
			 * Well, there is a lot going here and we won't get very far without a plan. So here we go ...
			 * 
			 * Declare variables
			 * Loop 10 times (each time around the loop)
			 * 		1. Read in a mark
			 * 		2. Validate the marks
			 * 		3. Add the mark to array
			 * 
			 * Loop 10 times (each time around the loop)
			 * 		1. Determine the correct range for the mark
			 * 		2. Increment the As, Bs, Cs or Fs
			 * 
			 *  Prepare output
			 *  Display
			 * 
			 * 
			 * Note that I could do this question with just one loop but I have decided to separate 
			 * the task of reading in the marks with the task of determining the grade
			 */

			//Declare variables
			//There are quite a lot so don't worry if you didn't get them all first time around - that's fine
			
			
			String output; //may as well start here as i always need this
			String markAsString;
			int mark;
			int totalNumberOfMarks = 4;
			//int numberOfMarksReadIn = 0;
			
			//now for the array
			int [] theMarks = new int[totalNumberOfMarks];
			
			//Now look back at the question and look at all those integers
			//None of them should be in our code ... time to create lots of variables
			//lets start with the maximum and minimum for the mark
			int markLowestValue = 0;
			int markHighestValue = 100;
			
			//now we need to do the same for each range but we can double up on two occasions to save a variable
			//for the As
			int gradeALowerValue = 75;  //we don't need the upper value as we have markHighestValue
			
			//for the Bs
			int gradeBLowervalue = 60;
			int gradeBhighestValue = 74;
			
			//for the Cs
			int gradeCLowervValue = 50;
			int gradeCHighestValue = 59;
			
			//for the Fs
			//actually we don't need to calculate the Fs
			//we'll check for As, Bs and Cs, if it is none of them it must be an F
		
			//and to count the As, Bs,Cs and Fs
			int numAs = 0;
			int numBs = 0;
			int numCs =0;
			int numFs = 0;
			
			//That's a lot of variables but it ensures we keep those integers out of our code
			
			//loop ten times but don't use the number ten, use the variable
			
			//we are dealing with so it is a for loop
			for(int loop = 0; loop < totalNumberOfMarks; loop++) {
				
				//read in the mark
				markAsString = JOptionPane.showInputDialog("please enter a mark between " +markLowestValue +" and " +markHighestValue);
				mark = Integer.parseInt(markAsString);
				
				//now we have to validate - must be a while loop
				while(mark < markLowestValue || mark > markHighestValue) {
					//read in again until we get a valid mark
					markAsString = JOptionPane.showInputDialog("ERROR - OUT OF RANGE: Please enter a mark between " +markLowestValue +" and " +markHighestValue);
					mark = Integer.parseInt(markAsString);
				}
				
				//now we know the mark is valid we can add it to the array
				theMarks[loop] = mark;
			}//end for loop
			
			//a second loop to do the processing
			for(int loop = 0; loop < totalNumberOfMarks; loop++) {
				mark = theMarks[loop]; // get the mark out of the array
				
				//lets see if the mark is an A
				if(mark >= gradeALowerValue) {
					//it is an A
					numAs++;
				} else {
					//It wasn't an A - lets see if the mark is a B
					if(mark >= gradeBLowervalue && mark <= gradeBhighestValue) {
						//it is a B
						numBs++;
					} else {
						//It wasn't an A or a B - let's see if it is a C
						if(mark >= gradeCLowervValue && mark <= gradeCHighestValue) {
							//it is a C
							numCs++;
						} else {
							//well it wasn't an A, B or a C - so it must be an F
							numFs++;
						}
					}
				}//end first if/else
			}//end for loop
			
			//prepare out output
			output = "Number of As = " +numAs + "\n";
			output = output + "Number of Bs = " +numBs + "\n";
			output = output + "Number of Cs = " +numCs + "\n";
			output = output + "Number of Fs = " +numFs;
			
			///and finally ... display
			JOptionPane.showMessageDialog(null, output);
			
		}//end main
	}//end class


