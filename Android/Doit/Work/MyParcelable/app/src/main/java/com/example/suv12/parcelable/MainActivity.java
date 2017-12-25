package com.example.suv12.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //============================= 객체 전달 방법1 Serializable =============================//

                //메뉴 엑티비티를 열 것이다.
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);

                //데이터 담을 그릇 생성
                ArrayList<String> names = new ArrayList<>();
                names.add("김진수");
                names.add("황수연");
                names.add("한지민");

                //데이터 전달
                intent.putExtra("names", names);

                //============================== 객체 전달 방법2 Parcelable ==============================//

                //SimpleData 객체 만들기
                SimpleData data = new SimpleData(100, "Hello");

                //원래 객체를 넣을 수 없지만 Parcelable 을 구현한 클래스로 만든 객체는 넣을 수 있음
                intent.putExtra("data", data);

                //응답을 받고 싶을때에는 startActivityForResult 를 사용하여 요청코드를 넣어준다.
                startActivityForResult(intent, 101);
            }
        });
    }
}
