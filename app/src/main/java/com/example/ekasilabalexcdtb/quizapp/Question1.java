package com.example.ekasilabalexcdtb.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
    }
    //

    //2003
    public void Button1(View view ){
        int button1=1;
        if(button1 != 0){
            Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Question1.this, question2.class);
            startActivity(intent);
            button1--;
        }
    }
    //2004
    public void Button2(View view ){
        int button2=1;
        if(button2 != 0){
            Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Question1.this, question2.class);
            startActivity(intent);
            button2--;
        }
    }
    //2005
    public void Button3(View view ){
        int button3=1;
        if(button3 != 0){
            Toast.makeText(this, "Correct answer, well done!!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Question1.this, question2.class);
            startActivity(intent);
            button3--;
        }
    }
    //2006
    public void Button4(View view ){
        int button4=1;
        if(button4 != 0){
            Toast.makeText(this, "Wrong! Try again", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Question1.this, question2.class);
            startActivity(intent);
            button4--;
        }
    }
    //Next page

}
