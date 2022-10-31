package ru.otus.homeworks.homework08;

import java.util.Arrays;
import java.util.List;


public class Homework08 {
    public static void main(String[] args) {
        TestQuestion testQuestion1 = new TestQuestion(
                "Что такое ООП?",
                new String[] {
                        "Объектно-ориентированное программирование — методология программирования, основанная на\n" +
                                "представлении программы в виде совокупности объектов, каждый из которых является экземпляром\n" +
                                "определенного класса, а классы образуют иерархию наследования.",
                        "Очень одинокий программист.",
                        "Объектно-ориентированное программирование — так называют любой тип программирования,\n" +
                                "в котором используются понятия высокого уровня и, в отличие от Assembler, в котором не\n" +
                                "работают напрямую с ячейками памяти ПК."
                },
                1
        );
        TestQuestion testQuestion2 = new TestQuestion(
                "Что такое класс в Java?",
                new String[] {
                        "Просто одно из возможных названий переменной.",
                        "Базовый элемент объектно-ориентированного программирования в языке Java.",
                        "Такое понятие есть только в C++, в Java такого понятия нет."
                },
                2
        );
        TestQuestion testQuestion3 = new TestQuestion(
                "Для чего используется оператор NEW?",
                new String[]{
                        "Для создания новой переменной.",
                        "Для объявления нового класса.",
                        "Для создания экземпляра класса.",
                        "Это антагонист оператора OLD."
                },
                3
        );

        List<TestQuestion> testQuestions = Arrays.asList(testQuestion1, testQuestion2);

        TestBuilder testBuilder = new TestBuilder();
        testBuilder.setTestQuestions(testQuestions);
        testBuilder.setTestQuestion(testQuestion3);

        Test test = testBuilder.getTest();
        test.runTest();
    }
}
