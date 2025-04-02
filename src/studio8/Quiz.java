package studio8;

import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class Quiz {
	private Question[] qs;
	/**
	 * Constructor
	 * @param questions
	 */
	public Quiz(Question[] questions) {
		qs = questions;
	}
	
	/**
	 * Prompts the user to answer, then returns a String containing their answer.
	 * @param in
	 * @return String answer
	 */
	private String getUserAnswer(Scanner in) {
		System.out.print("Please enter your answer: ");
		String out = in.next();
		return out;
	}
	
	/**
	 * Gets the number of points possible in the quiz.
	 * @return int number of total points
	 */
	public int getTotalPoints() {
		int total =0;
		for (int i = 0; i < qs.length; i++) {
			total += qs[i].getPoints();
		}
		return total;
	}
	
	/**
	 * Asks the user all question in the quiz, then prints out 
	 * the amount of points the user earned. This print statement
	 * should include "You earned ____ points"
	 * 
	 * @param in Scanner object to feed into getUserAnswer
	 */
	public void takeQuiz(Scanner in) {
	
		int score = 0;
		for (int i = 0; i < qs.length; i++) {
			 qs[i].displayPrompt();
			String givenAnswer = in.next();
			 score += qs[i].checkAnswer(givenAnswer);
		}
		System.out.println("You got " + score + " points!");
	}
	
	
	public static void main(String[] args) {
		Quiz quiz = new Quiz;
		takeQuiz();
	}
}
