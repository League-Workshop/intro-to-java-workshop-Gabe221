package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		
		// 2.  Ask the user a question 
		String answer=JOptionPane.showInputDialog("what is spook");
		
		// 3.  Use an if statement to check if their answer is correct
		
		if(answer.contentEquals("calcium")){
		
		
		// 4.  if the user's answer was correct, add one to their score 
			score+=100;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below.
		String answer2=JOptionPane.showInputDialog("why calcium good");
		if(answer2.contentEquals("because yes")){
			
			
			
		}
		if(answer2.contentEquals("yes")) {
		score+=200;
		
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null,"you're score is "+score);
		
	}
}

