package com.example.suv12.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Calc c = new Calc();
    String rs = "";
    String text = "";
    String text2 = "";
    Boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);

        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonMul = findViewById(R.id.buttonMul);
        Button buttonDiv = findViewById(R.id.buttonDiv);

        Button buttonPoint = findViewById(R.id.buttonPoint);
        Button buttonEqual = findViewById(R.id.buttonEqual);
        Button buttonAc = findViewById(R.id.buttonAc);
        Button buttonC = findViewById(R.id.buttonC);

        BtnInner b = new BtnInner();
        button0.setOnClickListener(b);
        button1.setOnClickListener(b);
        button2.setOnClickListener(b);
        button3.setOnClickListener(b);
        button4.setOnClickListener(b);
        button5.setOnClickListener(b);
        button6.setOnClickListener(b);
        button7.setOnClickListener(b);
        button8.setOnClickListener(b);
        button9.setOnClickListener(b);
        buttonPlus.setOnClickListener(b);
        buttonMinus.setOnClickListener(b);
        buttonMul.setOnClickListener(b);
        buttonDiv.setOnClickListener(b);
        buttonPoint.setOnClickListener(b);
        buttonEqual.setOnClickListener(b);
        buttonAc.setOnClickListener(b);
        buttonC.setOnClickListener(b);
    }

    public class BtnInner implements Button.OnClickListener {

        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case R.id.buttonEqual:

                        if (text.length() == 0) {
                            break;
                        }

                        if (!((text.contains("＋")) || (text.contains("－")) || (text.contains("×")) || (text.contains("÷")))) {
                            break;
                        }

                        text2 = text;
                        text2 = text2.replace("×", "*");
                        text2 = text2.replace("÷", "/");
                        text2 = text2.replace("＋", "+");
                        text2 = text2.replace("－", "-");

                        // 중위 표기법을 후위 표기법으로 바꾸기
                        String postfixExp = c.postfix(text2);
                        System.out.println("후위 표기법 : " + postfixExp);

                        // 후위 표기법을 이용하여 수식 계산
                        Double result = c.result(postfixExp);
                        rs = String.valueOf(result);

                        text = text + "=" + rs;
                        textView.setText(text);

                        break;

                case R.id.button0:
                    text += "0";
                    textView.setText(text);
                    break;

                case R.id.button1:
                    text += "1";
                    textView.setText(text);
                    break;

                case R.id.button2:
                    text += "2";
                    textView.setText(text);
                    break;

                case R.id.button3:
                    text += "3";
                    textView.setText(text);
                    break;

                case R.id.button4:
                    text += "4";
                    textView.setText(text);
                    break;

                case R.id.button5:
                    text += "5";
                    textView.setText(text);
                    break;

                case R.id.button6:
                    text += "6";
                    textView.setText(text);
                    break;

                case R.id.button7:
                    text += "7";
                    textView.setText(text);
                    break;

                case R.id.button8:
                    text += "8";
                    textView.setText(text);
                    break;

                case R.id.button9:
                    text += "9";
                    textView.setText(text);
                    break;

                case R.id.buttonPlus:
                    text += "＋";
                    textView.setText(text);
                    break;

                case R.id.buttonMinus:
                    text += "－";
                    textView.setText(text);
                    break;

                case R.id.buttonMul:
                    text += "×";
                    textView.setText(text);
                    break;

                case R.id.buttonDiv:
                    text += "÷";
                    textView.setText(text);
                    break;

                case R.id.buttonPoint:
                    text += ".";
                    textView.setText(text);
                    break;

                case R.id.buttonAc:
                    text = "";
                    textView.setText(text);
                    break;

                case R.id.buttonC:
                    if (text.length() == 0) {
                        break;
                    }
                    text = text.substring(0, text.length() - 1);
                    textView.setText(text);
                    break;
            }
        }
    }
}
