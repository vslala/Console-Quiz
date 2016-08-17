package main.java.com.bitwise.controllers;


import main.java.com.bitwise.models.Question;
import main.java.com.bitwise.models.Questions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by varunsh on 8/17/2016.
 */
public class Quiz {
    private Questions questions = new Questions();
    private List<Question> questionsList = questions.getQuestionsList();
    public List<Integer> userAnswers = new ArrayList<Integer>();

    public void startQuiz() {
        for (Question question: questionsList) {
            System.out.println(question);
        }
    }
}
