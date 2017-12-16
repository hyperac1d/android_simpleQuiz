package com.example.a3rdyearaccount.matildo121617;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class QuizActivity extends AppCompatActivity {

    int currentQuestion = 0;
    Button button_A, button_B, button_C, button_D;
    TextView textView_question;
    QuizBank qb = new QuizBank();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        qb.setQuiz();

        textView_question = (TextView) findViewById(R.id.textView_question);

        button_A = (Button) findViewById(R.id.button_A);
        button_A.setText(qb.getOption(currentQuestion, 0));

        button_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextQuestion();
            }
        });
    }

    void nextQuestion(){
        textView_question.setText(qb.getQuestion(currentQuestion));
        button_A.setText(qb.getOption(currentQuestion, 0));
    }

}
