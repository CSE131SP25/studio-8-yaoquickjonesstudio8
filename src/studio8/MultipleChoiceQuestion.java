package studio8;

import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {
	private String[] choices;
	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		// Call the super class constructor, then create and set
		// instance variables for any values that aren't handled
		// by the base class
		super(prompt, answer, points);
		this.choices = choices;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt();
		for(int i=0; i < choices.length; i++) {
			System.out.println((i+1) + ". " + choices[i]);
		}
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices;
	}
	
	public static void main(String[] args) {
		// TODO: create your own MultipleChoiceQuestion
		String[] answers = {"uno", "dos", "tres"};
		Scanner in = new Scanner(System.in);
		MultipleChoiceQuestion mcq = new MultipleChoiceQuestion("what is 1+1 en espanol?", "dos", 1000000, answers);
		mcq.displayPrompt();
		String response = in.next();
		System.out.println(mcq.checkAnswer(response));
	}

}
