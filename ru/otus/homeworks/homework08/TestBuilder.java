package ru.otus.homeworks.homework08;

import java.util.ArrayList;
import java.util.List;


public class TestBuilder {
    private final List<TestQuestion> testQuestions = new ArrayList<>();

    public TestBuilder() {
    }

    public TestBuilder(TestQuestion testQuestion) {
        this.testQuestions.add(testQuestion);
    }

    public TestBuilder(List<TestQuestion> testQuestions) {
        this.testQuestions.addAll(testQuestions);
    }

    public Test getTest() {
        if (testQuestions.isEmpty()) {
            throw new IllegalArgumentException("Тестовые вопросы отутствуют.");
        }

        return new Test(testQuestions);
    }

    public void setTestQuestion(TestQuestion testQuestion) {
        this.testQuestions.add(testQuestion);
    }

    public void setTestQuestions(List<TestQuestion> testQuestions) {
        this.testQuestions.addAll(testQuestions);
    }
}
