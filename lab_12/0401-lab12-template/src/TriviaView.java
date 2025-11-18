/*
 * Created on 2025-11-14
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

import javax.swing.*;
import java.awt.event.ActionListener;

// We define a custom View that extends the functionality from JFrame
public class TriviaView extends JFrame {
    // Define UI elements
    private JLabel questionLabel;
    private JRadioButton[] radioButtons;
    private JButton checkAnswerButton;
    private JButton nextButton;
    private ButtonGroup group;
    private JLabel resultLabel;

    // Hint: you can make use and adapt these constants!
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 225;
    private static final String APP_NAME = "Trivia!";

    public TriviaView() {
        // Setup the frames
        setTitle(APP_NAME);
        // Default operation that will happen when the user closes this frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO: Define the window's size
        setSize(0, 0);

        generateLayout();
    }

    // Getters and setters
    public char getSelectedAnswer() {
        for (int i = 0; i < radioButtons.length; i++) {
            if (radioButtons[i].isSelected()) {
                return (char) ('A' + i);
            }
        }
        return ' ';
    }

    public void setQuestion(String question) {
        // TODO: set the question label's text
    }

    public void setOptions(String[] options) {
        // TODO: set the text for the radio buttons to display the answer options
    }

    // Setup the view's layout: Adds labels and buttons
    private void generateLayout() {
        // Add question label
        questionLabel = new JLabel();
        questionLabel.setBounds(50, 20, 450, 20);
        add(questionLabel);

        // Add radio buttons for answer options as a button group
        radioButtons = new JRadioButton[3];
        group = new ButtonGroup();
        for (int i = 0; i < 3; i++) {
            radioButtons[i] = new JRadioButton();
            radioButtons[i].setBounds(50, 50 + (i * 30), 450, 20);
            group.add(radioButtons[i]);
            add(radioButtons[i]);
        }

        // Add check answer button
        checkAnswerButton = new JButton("Check answer");
        checkAnswerButton.setBounds(50, 140, 150, 30);
        add(checkAnswerButton);

        // Add confirm button
        nextButton = new JButton("Next");
        nextButton.setBounds(200, 140, 150, 30);
        add(nextButton);

        // Add the result label
        resultLabel = new JLabel("");
        resultLabel.setBounds(60, 170, 300, 20);
        add(resultLabel);
    }

    // Button listeners (no need to change any code here!)
    public void addCheckAnswerListener(ActionListener listenForCheckAnswerButton) {
        checkAnswerButton.addActionListener(listenForCheckAnswerButton);
    }

    public void addNextButtonListener(ActionListener listenForNextButton) {
        nextButton.addActionListener(listenForNextButton);
    }

    public void clearSelection() {
        group.clearSelection();
    }

    public void showResult(String result) {
        resultLabel.setText(result);
    }

    public void clearResultText() {
        resultLabel.setText("");
    }
}
