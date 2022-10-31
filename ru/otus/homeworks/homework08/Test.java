package ru.otus.homeworks.homework08;

import java.util.List;
import java.util.Scanner;

import static ru.otus.homeworks.homework08.MsgConstants.WRONG_ANSWER_NUMBER;


public class Test {
    private final List<TestQuestion> testQuestions;

    private int correctAnswers = 0;
    private int incorrectAnswers = 0;

    Scanner scanner = new Scanner(System.in);

    public Test(List<TestQuestion> testQuestions) {
        this.testQuestions = testQuestions;
    }

    public void runTest() {

        int userAnswer;

        for (TestQuestion testQuestion: testQuestions) {
            System.out.println("--------------------");
            testQuestion.showQuestion();
            testQuestion.showAnswers();
            System.out.println("--------------------");

            do {
                System.out.print("\n Введите номер ответа: ");
                if (scanner.hasNextInt()) {
                    userAnswer = scanner.nextInt();

                    if (userAnswer > 0 && userAnswer <= testQuestion.getNumberOfAnswers()) {
                        break;
                    } else {
                        System.out.printf(WRONG_ANSWER_NUMBER, testQuestion.getNumberOfAnswers());
                    }
                } else {
                    scanner.next();
                    System.out.printf(WRONG_ANSWER_NUMBER, testQuestion.getNumberOfAnswers());
                }
            } while (true);

            if (userAnswer == testQuestion.getCorrectAnswerNumber()) {
                correctAnswers ++;
            } else {
                incorrectAnswers++;
            }

            System.out.printf("Правильный ответ: %s%n", testQuestion.getCorrectAnswer());
        }

        System.out.printf("%nПравильных ответов: %d%nНе правильных ответов: %d%n", correctAnswers, incorrectAnswers);
    }
}
