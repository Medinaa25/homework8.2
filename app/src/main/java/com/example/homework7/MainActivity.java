package com.example.homework7;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Double first,second;
    private boolean isOperationClick;
    private String operation;
    private Button result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
        result = findViewById(R.id.result_button);


        findViewById(R.id.result_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),resultActivity.class);
                String text = tvResult.getText().toString();
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.putExtra("key1",text);
                intent.putExtra("EXIT",true);
                startActivity(intent);
            }
        });
    }

    public static Activity main; void onCreate(){
        main = this;
    }


    public void OnNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_one:
                result.setVisibility(View.INVISIBLE);
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
                result.setVisibility(View.INVISIBLE);
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
                result.setVisibility(View.INVISIBLE);
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
                result.setVisibility(View.INVISIBLE);
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
                result.setVisibility(View.INVISIBLE);
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
                result.setVisibility(View.INVISIBLE);
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
                result.setVisibility(View.INVISIBLE);
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
                    result.setVisibility(View.INVISIBLE);
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
                result.setVisibility(View.INVISIBLE);
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("9");
                }else if (isOperationClick){
                }else{
                    tvResult.append("9");
                }
                isOperationClick = false;
                break;
            case R.id.btn_zero:
                result.setVisibility(View.INVISIBLE);
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
                result.setVisibility(View.INVISIBLE);
                tvResult.setText("0");
                first = 0.0;
                second = 0.0;
                break;
            case R.id.btn_point:
                result.setVisibility(View.INVISIBLE);
                tvResult.append(".");
                break;
            case R.id.plus_minus:
                result.setVisibility(View.INVISIBLE);
                if (Double.parseDouble(tvResult.getText().toString()) > 0)
                tvResult.setText("-" + tvResult.getText());
        }
    }

    public void OnOperationClick(View view) {
        isOperationClick = true;
        first = Double.parseDouble(tvResult.getText().toString());
        switch (view.getId()){
            case  R.id.btn_plus:
                result.setVisibility(View.INVISIBLE);
                operation = "+";
                break;
            case R.id.btn_minus:
                result.setVisibility(View.INVISIBLE);
                operation = "-";
                break;
            case R.id.btn_division:
                result.setVisibility(View.INVISIBLE);
                operation = "/";
                break;
            case R.id.btn_multi:
                result.setVisibility(View.INVISIBLE);
                operation = "*";
                break;
        }
    }

    public void equalOperation(View view) {
        result.setVisibility(View.VISIBLE);
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
        result.setVisibility(View.INVISIBLE);
        Double procentResult = Double.parseDouble(tvResult.getText().toString())/100;
        tvResult.setText(procentResult.toString());
        isOperationClick = true;
    }
}