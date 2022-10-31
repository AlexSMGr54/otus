package ru.otus.homeworks.homework08;

import static ru.otus.homeworks.homework08.MsgConstants.*;


public class TestQuestion {
    private final String question;
    private final String[] answers;
    private final int correctAnswerNumber;

    public TestQuestion(String question, String[] answers, int correctAnswerNumber) {
        if (question != null && !question.isEmpty()) {
            this.question = question;
        } else {
            throw new IllegalArgumentException(QUESTION_MISSING);
        }

        if (answers != null) {
            if (answers.length > 1) {
                for (String answer: answers) {
                    if (answer == null || answer.isEmpty()) {
                        throw new IllegalArgumentException(ANSWER_EMPTY);
                    }
                }
                this.answers = answers;
            } else {
                throw new IllegalArgumentException(WRONG_ANSWER_NUMBERS);
            }
        } else {
            throw new IllegalArgumentException(ANSWER_MISSING);
        }

        if (correctAnswerNumber > 0 && correctAnswerNumber < answers.length) {
            this.correctAnswerNumber = correctAnswerNumber;
        } else {
            throw new IllegalArgumentException(
                    String.format(WRONG_CORRECT_ANSWER_NUMBER, answers.length - 1)
            );
        }
    }

    public void showQuestion() {
        System.out.println(this.question);
    }

    public void showAnswers() {
        for (int i = 0; i < this.answers.length; i++) {
            System.out.printf("%d. %s%n", i +1, answers[i]);
        }
    }

    public int getCorrectAnswerNumber() {
        return correctAnswerNumber;
    }

    public String getCorrectAnswer() {
        return this.answers[correctAnswerNumber - 1];
    }

    public int getNumberOfAnswers() {
        return answers.length;
    }
}
