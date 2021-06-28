package com.unicom.cucumbertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.unicom.Calculate;
import com.unicom.impl.CalculateImpl;

public class MainActivity extends AppCompatActivity {

    private EditText tvFirstNumber;
    private EditText tvSecondNumber;
    private TextView tvSum;
    private Calculate calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate = new CalculateImpl();
        tvFirstNumber = (EditText) findViewById(R.id.first_number);
        tvSecondNumber = (EditText) findViewById(R.id.second_number);
        tvSum = (TextView) findViewById(R.id.sum);
        findViewById(R.id.calc).setOnClickListener(view -> {
            int firstNumber = Integer.parseInt(tvFirstNumber.getText().toString());
            int secondNumber = Integer.parseInt(tvSecondNumber.getText().toString());
            int add = calculate.add(firstNumber, secondNumber);
            tvSum.setText(String.valueOf(add));
        });
    }
}