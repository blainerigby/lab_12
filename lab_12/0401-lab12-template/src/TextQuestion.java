/*
 * Created on 2025-11-14
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

// TODO: Implement the Question interface
public class TextQuestion {
    private String question;
    private String[] options;
    private char correctAnswer;

    // Constructor & getters
    public TextQuestion(String question, String[] options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    // TODO: implement the score method
    // Should return 1 if the answer is correct, otherwise return 0
    // score hint: You can use answer.charAt(0) to get the first character
    // of the answer string

    // TODO: implement the dislpay method - add the question and answer options to the view
    // Hint: Take a look at the methods in TriviaView!

    // TODO: implement the showResult method - Add an appropriate output for the result
    // Hint: You can get the answer's first character using: answer.charAt(0)
    // String resultText = "";
    // view.showResult(resultText);

    // TODO: implement the clearResultText method
    // Hint: use view.clearResultText(); to clear the resultLabel's text
}
