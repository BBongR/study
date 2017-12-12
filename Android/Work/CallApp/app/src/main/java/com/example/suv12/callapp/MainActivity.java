package com.example.suv12.callapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_toast;
    Button btn_google;
    Button btn_tel;
    Button btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_toast = findViewById(R.id.btn_toast);
        btn_google = findViewById(R.id.btn_google);
        btn_tel = findViewById(R.id.btn_tel);
        btn_start = findViewById(R.id.btn_start);

        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "시작버튼이 눌렸어요", Toast.LENGTH_SHORT).show();
            }
        });

        btn_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(myIntent);
            }
        });

        btn_tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:119"));
                startActivity(myIntent);
            }
        });

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "시작 버튼이 눌렸어요", Toast.LENGTH_SHORT).show();

                Intent myIntent = new Intent(MainActivity.this, MyActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
