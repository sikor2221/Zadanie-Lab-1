package com.igor.zadanie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    Random mRandomNumber;
    Integer mNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.numberTV);
        mRandomNumber = new Random();
        mNumber = mRandomNumber.nextInt(100);

        mTextView.setText(mNumber.toString());
        if(mNumber >= 40){
            Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();
        } else if (mNumber <40){
            Toast.makeText(this, "...", Toast.LENGTH_SHORT).show();
        }


    }
}
