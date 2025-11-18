/*
 * Created on 2025-11-14
 *
 * Copyright (c) 2025 Nadine von Frankenberg
 */

// No need to change this file!
public interface Question {
    int score(String answer);

    void display(TriviaView view);

    void showResult(String answer, TriviaView view);

    void clearResultText(TriviaView view);
}
