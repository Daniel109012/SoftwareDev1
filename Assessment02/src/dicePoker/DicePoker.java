package dicePoker;

import javax.swing.JOptionPane;

public class DicePoker {

	public static void main(String[] args) {
		

		Dice dice = new Dice();
        String result = dice.NumberOfDice(); // or dice.rollDice(2);
        JOptionPane.showMessageDialog(null, result);


	}

}
