package com.example.pratica11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int result = 0;
    private TextView tv2_;
    private EditText et1_;
    private EditText et2_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv2_ = (TextView) findViewById(R.id.tv2);
        et1_ = (EditText) findViewById(R.id.et1);
        et2_ = (EditText) findViewById(R.id.et2);
    }

    public void sum(View view) {
        if (tv2_ != null && et1_ != null && et2_ != null) {
            int number1, number2;
            String text1, text2;
            text1 = et1_.getText().toString();
            text2 = et2_.getText().toString();
            if (!text1.isEmpty() && !text2.isEmpty()) {
                number1 = Integer.parseInt(text1);
                number2 = Integer.parseInt(text2);
                tv2_.setText(String.valueOf(number1 + number2));
            }
        }
    }
}