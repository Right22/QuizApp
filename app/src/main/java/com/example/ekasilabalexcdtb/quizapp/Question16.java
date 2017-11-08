package com.example.ekasilabalexcdtb.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Question16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question16);
    }
    //Incorrect
    public void Button1111(View view ){
        int button1=1;
        if(button1 != 0){
            Toast.makeText(this,  "Wrong! Try again", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Question16.this, Question17.class);
            startActivity(intent);
            button1--;
        }
    }
    //Incorrect
    public void Button2222(View view ){
        int button2=1;
        if(button2 != 0){
            Toast.makeText(this, "Wrong! Try again" , Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Question16.this, Question17.class);
            startActivity(intent);
            button2--;
        }
    }
    //Incorrect
    public void Button3333(View view ){
        int button3=1;
        if(button3 != 0){
            Toast.makeText(this,  "Wrong! Try again", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Question16.this, Question17.class);
            startActivity(intent);
            button3--;
        }
    }
    //Correct
    public void Button4444(View view ){
        int button4=1;
        if(button4 != 0){
            Toast.makeText(this,  "Correct answer, well done!!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Question16.this, Question17.class);
            startActivity(intent);
            button4--;
        }
    }
    //Next page
}
