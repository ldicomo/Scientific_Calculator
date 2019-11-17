package com.example.usuario.scientific_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.usuario.scientific_calculator.R.*;
import static com.example.usuario.scientific_calculator.R.layout.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        Button addBtn = (Button) findViewById(id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double num2 = Double.parseDouble(secondNumEditText.getText().toString());
                double result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });
        Button restBtn = (Button) findViewById(id.restBtn);
        restBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double num2 = Double.parseDouble(secondNumEditText.getText().toString());
                double result = num1 - num2;
                resultTextView.setText(result + "");
            }
        });
        Button mulBtn = (Button) findViewById(id.mulBtn);
        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double num2 = Double.parseDouble(secondNumEditText.getText().toString());
                double result = num1 * num2;
                resultTextView.setText(result + "");
            }
        });
        Button divBtn = (Button) findViewById(id.divBtn);
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double num2 = Double.parseDouble(secondNumEditText.getText().toString());
                double result = num1 / num2;
                resultTextView.setText(result + "");
            }
        });
        Button powBtn = (Button) findViewById(id.powBtn);
        powBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double num2 = Double.parseDouble(secondNumEditText.getText().toString());
                double result = Math.pow(num1, num2);
                resultTextView.setText(result + "");
            }
        });
        Button sqrtBtn = (Button) findViewById(id.sqrtBtn);
        sqrtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(id.firstNumEditText);
                TextView resultTextView = (TextView) findViewById(id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double result = Math.sqrt(num1);
                resultTextView.setText(result + "");
            }
        });
        Button logBtn = (Button) findViewById(id.logBtn);
        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(id.firstNumEditText);
                TextView resultTextView = (TextView) findViewById(id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double result = Math.log(num1);
                resultTextView.setText(result + "");
            }
        });
        Button sinBtn = (Button) findViewById(id.sinBtn);
        sinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(id.firstNumEditText);
                TextView resultTextView = (TextView) findViewById(id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double result = Math.sin(num1);
                resultTextView.setText(result + "");
            }
        });
        Button cosBtn = (Button) findViewById(id.cosBtn);
        cosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(id.firstNumEditText);
                TextView resultTextView = (TextView) findViewById(id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double result = Math.cos(num1);
                resultTextView.setText(result + "");
            }
        });
        Button tanBtn = (Button) findViewById(id.tanBtn);
        tanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(id.firstNumEditText);
                TextView resultTextView = (TextView) findViewById(id.resultTextView);

                double num1 = Double.parseDouble(firstNumEditText.getText().toString());
                double result = Math.tan(num1);
                resultTextView.setText(result + "");
            }
        });
    }
}