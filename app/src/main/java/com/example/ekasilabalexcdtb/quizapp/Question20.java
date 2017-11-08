package com.example.ekasilabalexcdtb.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class Question20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question20);
    }
    //Incorrect
    public void Button3333(View view ){
        int button1=1;
        if(button1 != 0){

            int min = 5;
            int max = 20;

            Random r = new Random();
            int i1 = r.nextInt(max - min + 1) + min;
            Toast.makeText(this, "Total Score = " + " " + i1 + " " + " out of 20", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Question20.this, Question20.class);
            startActivity(intent);
            button1--;

        }
    }
    //Correct
    public void Button4444(View view ){
        int button2=1;
        if(button2 != 0){
            int min = 5;
            int max = 20;

            Random r = new Random();
            int i1 = r.nextInt(max - min + 1) + min;
            Toast.makeText(this, "Total Score = " + " " + i1 + " " + " out of 20", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Question20.this, Question20.class);
            startActivity(intent);

            button2--;
        }
    }
    //Next page
    //
    public void toStart(View view ){
        int button2=1;
        if(button2 != 0){
            Intent intent = new Intent(Question20.this, MainActivity.class);
            startActivity(intent);
        }

    }
}
