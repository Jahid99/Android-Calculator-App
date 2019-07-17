package com.example.hi.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {



    EditText et1, et2;
    Button plus, minus, multiply, divide, equal;
    TextView result;
    int operation;
    double res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.num1);
        et2 = (EditText)findViewById(R.id.num2);
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        divide = (Button)findViewById(R.id.divide);
        multiply = (Button)findViewById(R.id.multiply);
        equal = (Button)findViewById(R.id.equal);
        result = (TextView)findViewById(R.id.result);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 1;

            }
        });



        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 2;
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 3;
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 4;
            }
        });




        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (operation) {
                    case 1:
                        String s1= et1.getText().toString();
                        String s2= et2.getText().toString();
                        res = Integer.parseInt(s1)+Integer.parseInt(s2);
                        result.setText(Double.toString(res));
                        break;
                    case 2:
                        res =2;
                        break;
                    case 3:
                        res = 3;
                        break;
                    case 4:
                        res =4;
                        break;
                    default:
                        res = 0;
                }


            }
        });



































    }
}
