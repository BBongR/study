package com.example.suv12.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edt_first = null;
    private EditText edt_end = null;

    private Button btn_plus = null;
    private Button btn_minus = null;
    private Button btn_mul = null;
    private Button btn_div = null;
    private Button btn_rem = null;

    private TextView txt_result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_first = findViewById(R.id.edt_first);
        edt_end = findViewById(R.id.edt_end);

        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_mul = findViewById(R.id.btn_mul);
        btn_div = findViewById(R.id.btn_div);
        btn_rem = findViewById(R.id.btn_rem);

        txt_result = findViewById(R.id.txt_result);

        Inner in = new Inner();
        btn_plus.setOnClickListener(in);
        btn_minus.setOnClickListener(in);
        btn_mul.setOnClickListener(in);
        btn_div.setOnClickListener(in);
        btn_rem.setOnClickListener(in);

//        setTitle("간편 계산기 : (수정)");
        setTitle(R.string.title);
    }

    private class Inner implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            Double first = null;
            Double end = null;
            String result = "";

            if (!edt_first.getText().toString().equals("") && !edt_end.getText().toString().equals("")) {
                first = Double.valueOf(edt_first.getText().toString());
                end = Double.valueOf(edt_end.getText().toString());
            }

            switch (view.getId()) {
                case R.id.btn_plus:
                    if (first == null || end == null) {
                        Toast.makeText(getApplicationContext(), "두 값을 모두 입력하세요", Toast.LENGTH_SHORT).show();
                        break;
                    } else {
                        result = String.valueOf(first + end);
                        txt_result.setText(result);
                        break;
                    }

                case R.id.btn_minus:
                    if (first == null || end == null) {
                        Toast.makeText(getApplicationContext(), "두 값을 모두 입력하세요", Toast.LENGTH_SHORT).show();
                        break;
                    } else {
                        result = String.valueOf(first - end);
                        txt_result.setText(result);
                        break;
                    }

                case R.id.btn_mul:
                    if (first == null || end == null) {
                        Toast.makeText(getApplicationContext(), "두 값을 모두 입력하세요", Toast.LENGTH_SHORT).show();
                        break;
                    } else {
                        result = String.valueOf(first * end);
                        txt_result.setText(result);
                        break;
                    }

                case R.id.btn_div:
                    if (first == null || end == null) {
                        Toast.makeText(getApplicationContext(), "두 값을 모두 입력하세요", Toast.LENGTH_SHORT).show();
                        break;
                    } else if (end == 0) {
                        Toast.makeText(getApplicationContext(), "0으로 나눌수 없습니다.", Toast.LENGTH_SHORT).show();
                        break;
                    } else {
                        result = String.valueOf(first / end);
                        txt_result.setText(result);
                        break;
                    }

                case R.id.btn_rem:
                    if (first == null || end == null) {
                        Toast.makeText(getApplicationContext(), "두 값을 모두 입력하세요", Toast.LENGTH_SHORT).show();
                        break;
                    } else if (end == 0) {
                        Toast.makeText(getApplicationContext(), "0으로 나눌수 없습니다.", Toast.LENGTH_SHORT).show();
                        break;
                    } else {
                        result = String.valueOf(first % end);
                        txt_result.setText(result);
                        break;
                    }
            }

        }
    }
}
