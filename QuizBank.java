package com.example.a3rdyearaccount.matildo121617;

/**
 * Created by 3rdyearaccount on 16/12/2017.
 */

public class QuizBank {
    int quizSize = 5;
    String[] questionBank = new String[quizSize];
    String[][] optionsBank = new String[quizSize][4];
    String[] answers = new String[quizSize];

    void setQuiz(){

    }

    String getQuestion(int num){
        String question = questionBank[num];
        return question;
    }

    String getOption(int num, int opt){
        String option = optionsBank[num][opt];
        return option;
    }
}
