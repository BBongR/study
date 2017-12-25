package com.example.suv12.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // MainActivity 에서 전달한 Intent 가 getIntent()로 전달된다.
        Intent passedIntent = getIntent();
        processIntent(passedIntent);
    }

    private void processIntent(Intent intent) {
        if (intent != null) {
            //객체 받기 방법 1
            ArrayList<String> names = (ArrayList<String>) intent.getSerializableExtra("names");
            if (names != null) {
                Toast.makeText(getApplicationContext(), "전달받은 이름 리스트 갯수: " + names.size(), Toast.LENGTH_SHORT).show();
            }

            //Parcelable 을 구현한 클래스로 만든 객체 받기 - 방법 2
            SimpleData data = intent.getParcelableExtra("data");
            if (data != null) {
                Toast.makeText(getApplicationContext(), "전달받은 SimpleData: " + data.message, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
