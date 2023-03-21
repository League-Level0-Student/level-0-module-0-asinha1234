package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int count =0 ;
		// ASK A QUESTION AND CHECK THE ANSWER
		String userqa = JOptionPane.showInputDialog("what color is a giraffes tongue?");
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				if (userqa.equals("blue")) {
					count=+1;
				}
		JOptionPane.showInputDialog("Which animal is on the porche logo?");
	
				if (userqa.equals("horse")) {
					count=+1;
					count=2;
		}
				
		JOptionPane.showInputDialog("what is the fastest land animal?");
		
				if (userqa.equals("cheeta")) {
					count=+1;
					count=3;
		}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "you have " + count );
	}
}
