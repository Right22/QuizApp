package com.example.ekasilabalexcdtb.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //
    //2003
    public void nextToQ1(View view ){
        int button1=1;
        if(button1 != 0){
            Toast.makeText(this, "Be ready to start the android quiz app ", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Question1.class);
            startActivity(intent);
            button1--;
        }
    }
    //Next page
}
