package ru.otus.homeworks.homework06;

import java.util.Scanner;

public class Homework06 {

    private static final String ERROR_MSG = "Некорректный номер ответа. Допускаются только целые числа от 1 до %s";

    private static final String[] questions = {
            "Что такое ООП?",
            "Что такое класс в Java?",
            "Для чего используется оператор NEW?"
    };
    private static final String[][] answers = {
            {
                    "Объектно-ориентированное программирование — методология программирования, основанная на\nпредставлении программы в виде совокупности объектов, каждый из которых является экземпляром\nопределенного класса, а классы образуют иерархию наследования.",
                    "Очень одинокий программист.",
                    "Объектно-ориентированное программирование — так называют любой тип программирования,\nв котором используются понятия высокого уровня и, в отличие от Assembler, в котором не\nработают напрямую с ячейками памяти ПК."
            },
            {
                    "Просто одно из возможных названий переменной.",
                    "Базовый элемент объектно-ориентированного программирования в языке Java.",
                    "Такое понятие есть только в C++, в Java такого понятия нет."
            },
            {
                    "Для создания новой переменной.",
                    "Для объявления нового класса.",
                    "Для создания экземпляра класса.",
                    "Это антагонист оператора OLD."
            }
    };
    private static final int[] correctAnswerNumbers = {1, 2, 3};

    public static void main(String[] args) {
        int correctAnswers = 0;
        int incorrectAnswers = 0;

        Scanner scanner = new Scanner(System.in);
        int userAnswer;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Вопрос №" + (i + 1) + " - " + questions[i]);

            for (int j = 0; j < answers[i].length; j++) {
                System.out.println((j + 1) + ". " + answers[i][j]);
            }

            do {
                System.out.print("\n Введите номер ответа: ");
                if (scanner.hasNextInt()) {
                    userAnswer = scanner.nextInt();

                    if (userAnswer > 0 && userAnswer <= answers[i].length) {
                        break;
                    } else {
                        System.out.printf((ERROR_MSG) + "%n", answers[i].length);
                    }
                } else {
                    scanner.next();
                    System.out.printf((ERROR_MSG) + "%n", answers[i].length);
                }
            } while (true);

            if (userAnswer == correctAnswerNumbers[i]) {
                correctAnswers ++;
            } else {
                incorrectAnswers++;
            }
        }

        System.out.printf("Правильных ответов: %d%nНе правильных ответов: %d%n", correctAnswers, incorrectAnswers);
    }
}
