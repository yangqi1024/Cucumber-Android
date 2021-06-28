package com.unicom.cucumbertest;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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
            String strFirstNumber = tvFirstNumber.getText().toString();
            String strSecondNumber = tvSecondNumber.getText().toString();
            if (TextUtils.isEmpty(strFirstNumber) || TextUtils.isEmpty(strSecondNumber)) {
                Toast.makeText(MainActivity.this, "数字不能为空", Toast.LENGTH_SHORT).show();
                return;
            }
            int firstNumber = Integer.parseInt(strFirstNumber);
            int secondNumber = Integer.parseInt(strSecondNumber);
            int add = calculate.add(firstNumber, secondNumber);
            tvSum.setText(String.valueOf(add));
        });
    }
}