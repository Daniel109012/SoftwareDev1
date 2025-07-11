package practice;

public class Question093 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//9.	Take the program given below and rewrite it using methods, you should use at least four methods.


				//declare variables
				int theMark;
				int mark = 0;
				int passes = 0, fails = 0;
				int student;
				String message = null;
				
				Q09Method.welcomeMessage(message);
				
				//initialise
				student = 1;
				int numberOfStudents = 3;
				int passMark = 10;
				int minMark = 0;
				int maxMark = 100;
				
				//main loop to read in marks     

				do {
					//read in marks
						theMark = Q09Method.studentMark(mark);
			   	   	//validate mark
			   	   	while(theMark < minMark || theMark  > maxMark) {
			   	   		
			   	   			theMark = Q09Method.validateMark(mark);
			   	   			
				   	}
				   	 	  
				   	  //check if mark is a pass or fail
				   	  if (theMark >= passMark) {
				   		  passes++;
				   	  }
				   	  else {
				   		  fails++;
				   	  }
				   	  //increment counter
				   	student++;
				}while(student <= numberOfStudents); 
					
				Q09Method.result(passes, fails);
		  
	
				
			}//end main

		}//end class

