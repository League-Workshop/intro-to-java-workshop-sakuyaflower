package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		      int score=0;   
		// 2.  Ask the user a question 
		      String answer=JOptionPane.showInputDialog("Who are you?");
		// 3.  Use an if statement to check if their answer is correct
		    		  if (answer.equals(42)) {
				    	  score++;}
		// 4.  if the user's answer is correct
		    		  JOptionPane.showInputDialog(null,score);
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		    if (answer.equals("Whats my name?")); {
			score++;}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showInputDialog(null,score);
	}
}
