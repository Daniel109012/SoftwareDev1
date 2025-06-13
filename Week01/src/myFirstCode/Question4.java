package myFirstCode;
import javax.swing.JOptionPane;


public class Question4 {
	public static void main(String[] args) {

		/*
		 * 4.	Write a program that reads in a users name and age and displays a message telling them how old they will be this time next year.
		 */

		/*
		 * A FEW COMMENTS
		 * This is a nice little exercise in 
		 *    1 reading in different types of data (a string and an integer)
		 *    2 manipulating the data
		 *    3 preparing an output and displaying it
		 *    
		 * These are the three classic stages that almost all software programs go through (albeit in different ways)
		 * and so it makes sense to get some practice in early on.
		 */
		
		/*
		 * Let's start, as always, with some instance variables
		 * Don't worry if you don't get all the variables before you begin coding, in fact I would be surprised if you did
		 * When you are writing code, if you realise you need an extra variable, just pop back up to this section and add one
		 */
		
		//instance variables
		String usersName, usersAge, output;
		int age, ageNextYear;
		
		/*
		 * Now onto stage 1 - reading in the data
		 * In this case we are going to read in data from the keyboard
		 */
		
		//ask the user for their name
		usersName = JOptionPane.showInputDialog("Please enter your name");
		
		//ask the user for their age - remember that it comes back as a string, we'll have to convert it to an integer
		usersAge = JOptionPane.showInputDialog("please enter your age");
		//convert to an integer, you'll get use to this line of code because you will see it so often
		age = Integer.parseInt(usersAge);
		
		/*
		 * Now onto stage 2 - manipulating the data.
		 * Hold onto your hats, we are going to do some math!
		 */
		ageNextYear = age + 1;
		
		/*
		 * Now onto stage 3 - we need to prepare an output and display
		 * We are going to prepare a String to display by joining things together with the + operator.
		 */
		output = "Hello " +usersName +" you will be " +ageNextYear +" years old this time next year";   
		
		
		//let's finish off with a display
		JOptionPane.showMessageDialog(null, output);
		
	}
}
