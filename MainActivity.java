package com.example.a3rdyearaccount.matildo121617;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public abstract class MainActivity extends AppCompatActivity {

    EditText editText_name;
    Button button_quiznow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_name = (EditText) findViewById(R.id.editText_name);
        button_quiznow = (Button) findViewById(R.id.button_quiznow);

        button_quiznow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean result = false;

                if(editText_name.getText().length() > 0){
                    result = true;
                }

                if(result){
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(null, "Invalid name", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}
