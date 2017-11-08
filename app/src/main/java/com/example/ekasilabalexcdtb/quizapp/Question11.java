package com.example.ekasilabalexcdtb.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Question11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question11);
    }
    //Correct
    public void Button11(View view ){
        int button1=1;
        if(button1 != 0){
            Toast.makeText(this, "Correct answer, well done!!" , Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Question11.this, Question12.class);
            startActivity(intent);
            button1--;
        }
    }
    //Incorrect
    public void Button22(View view ){
        int button2=1;
        if(button2 != 0){
            Toast.makeText(this,  "Wrong! Try again", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Question11.this, Question12.class);
            startActivity(intent);
            button2--;
        }
    }
    //Next page
}
