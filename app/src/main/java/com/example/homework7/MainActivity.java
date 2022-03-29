package com.example.homework7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Double first,second;
    private boolean isOperationClick;
    private String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
    }

    public void OnNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:

                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("1");
                }else if (isOperationClick){
                    tvResult.setText("1");
                }else{
                    tvResult.append("1");
                }
                isOperationClick = false;
                break;
            case R.id.btn_two:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("2");
                }else if (isOperationClick){
                    tvResult.setText("2");
                }else {
                    tvResult.append("2");
                }
                isOperationClick = false;
                break;
            case R.id.btn_three:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("3");
                }else if (isOperationClick){
            tvResult.setText("3");
        }else{
                    tvResult.append("3");
                }
                isOperationClick = false;
                break;
            case R.id.btn_four:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("4");
                }else if (isOperationClick){
                    tvResult.setText("4");
                }else{
                    tvResult.append("4");
                }
                isOperationClick = false;
                break;
            case R.id.btn_five:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("5");
                }else if (isOperationClick){
                    tvResult.setText("5");
                }else{
                    tvResult.append("5");
                }
                isOperationClick = false;
                break;
            case R.id.btn_six:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("6");
                }else if (isOperationClick){
                    tvResult.setText("6");
                }else{
                    tvResult.append("6");
                }
                isOperationClick = false;
                break;
            case R.id.btn_seven:
                if (tvResult.getText().toString().equals("0")){
                tvResult.setText("7");
            }else if (isOperationClick){
                    tvResult.setText("7");
                }else{
                    tvResult.append("7");
            }
                isOperationClick = false;
                break;
                case R.id.btn_eight:
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("8");
                    }else if (isOperationClick){
                        tvResult.setText("8");
                    }else{
                        tvResult.append("8");
                    }
                    isOperationClick = false;
                    break;
            case R.id.btn_nine:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("9");
                }else if (isOperationClick){
                }else{
                    tvResult.append("9");
                }
                isOperationClick = false;
                break;
            case R.id.btn_zero:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("0");
                }else if (isOperationClick){
                    tvResult.setText("0");
                }else{
                    tvResult.append("0");
                }
                isOperationClick = false;
                break;
            case R.id.btn_clear:
                tvResult.setText("0");
                first = 0.0;
                second = 0.0;
                break;
            case R.id.btn_point:
                tvResult.append(".");
                break;
            case R.id.plus_minus:
                if (Double.parseDouble(tvResult.getText().toString()) > 0)
                tvResult.setText("-" + tvResult.getText());
        }
    }

    public void OnOperationClick(View view) {
        isOperationClick = true;
        first = Double.parseDouble(tvResult.getText().toString());
        switch (view.getId()){
            case  R.id.btn_plus:
                operation = "+";
                break;
            case R.id.btn_minus:
                operation = "-";
                break;
            case R.id.btn_division:
                operation = "/";
                break;
            case R.id.btn_multi:
                operation = "*";
                break;
        }
    }

    public void equalOperation(View view) {
        second = Double.parseDouble(tvResult.getText().toString());
        Double result;
        switch (operation){
            case "+":
                result = first + second;
                tvResult.setText(result.toString());
                break;
            case "-":
                result = first - second;
                tvResult.setText(result.toString());
                break;
            case "/":
                result = first / second;
                tvResult.setText(result.toString());
                break;
            case "*":
                result = first * second;
                tvResult.setText(result.toString());
                break;
        }
        isOperationClick = true;

    }


    public void OnProcentClick(View view) {
        Double procentResult = Double.parseDouble(tvResult.getText().toString())/100;
        tvResult.setText(procentResult.toString());
        isOperationClick = true;
    }
}