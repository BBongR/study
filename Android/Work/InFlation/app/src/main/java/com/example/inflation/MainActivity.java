package com.example.inflation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private LinearLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parent = findViewById(R.id.container);
                LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

                inflater.inflate(R.layout.laout_sub1, parent, true);

                CheckBox checkBox = parent.findViewById(R.id.checkBox);
                checkBox.setText("getSystemService inflate 완료");

                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView textView = parent.findViewById(R.id.textView);
                        textView.setText("button 눌림1");
                    }
                });
            }
        });

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parent = findViewById(R.id.container);
                LayoutInflater.from(MainActivity.this).inflate(R.layout.laout_sub1,parent,true);

                CheckBox checkBox = findViewById(R.id.checkBox);
                checkBox.setText("LayoutInflation inflate 완료");

                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView textView = findViewById(R.id.textView);
                        textView.setText("button 눌림2");
                    }
                });
            }
        });

        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parent = findViewById(R.id.container);
                View child = LayoutInflater.from(MainActivity.this).inflate(R.layout.laout_sub1,null);

                parent.addView(child);

                CheckBox checkBox = parent.findViewById(R.id.checkBox);
                checkBox.setText("LayoutInflation inflate 연속 추가하기");

                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView textView = findViewById(R.id.textView);
                        textView.setText("button 눌림3");
                    }
                });
            }
        });
    }
}
