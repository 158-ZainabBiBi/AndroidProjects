package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etn1, etn2;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etn1 = (EditText)findViewById(R.id.etn1);
        etn2 = (EditText)findViewById(R.id.etn2);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    public void btnsum(View view) {
        int num1 = Integer.parseInt(etn1.getText().toString());
        int num2 = Integer.parseInt(etn2.getText().toString());
        int sum = num1+ num2;
        tvResult.setText(String.valueOf(sum));
    }

    public void btnsub(View view) {
        int num1 = Integer.parseInt(etn1.getText().toString());
        int num2 = Integer.parseInt(etn2.getText().toString());
        int sub = num1- num2;
        tvResult.setText(String.valueOf(sub));
    }

    public void btnmul(View view) {
        int num1 = Integer.parseInt(etn1.getText().toString());
        int num2 = Integer.parseInt(etn2.getText().toString());
        int mul = num1*num2;
        tvResult.setText(String.valueOf(mul));
    }

    public void btndiv(View view) {
        int num1 = Integer.parseInt(etn1.getText().toString());
        int num2 = Integer.parseInt(etn2.getText().toString());
        int div = num1 / num2;
        tvResult.setText(String.valueOf(div));
    }
}