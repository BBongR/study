package com.example.suv12.checkedlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // 7. 위젯 선언
    private ListView listView       = null;

    // 8-2. List<ModelPerson> lists 선언
    private List<ModelPerson> lists = null;

    // 8-6.
    private int[] images = { R.drawable.sample_0
                           , R.drawable.sample_1
                           , R.drawable.sample_2
                           , R.drawable.sample_3
                           , R.drawable.sample_4
                           , R.drawable.sample_5
                           , R.drawable.sample_6
                           , R.drawable.sample_7 };

    // 9-1.
    private AdapterPerson adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 7-1. 위젯 찾기
        listView = findViewById(R.id.listView);

        // 8. 데이터 만들기
        //  8-1. lists 필드에 선언
        //  8-3. makeData() 메서드 만들기
        lists = makeData();

        // 9. adapter 필드에 선언 후 만들기
        adapter = new AdapterPerson(MainActivity.this, R.layout.view_person, lists);

        // 10. listView 와 adapter 연결
        listView.setAdapter(adapter);
    }

    // 8-4.
    private List<ModelPerson> makeData() {
        List<ModelPerson> items = new ArrayList<>();

        ModelPerson person;
        for (int i = 0; i < 20; i++) {
            person = new ModelPerson();
                                                             // 8-5 필드에 이미지 배열 만들기
            person.setImage_photo ( getResources().getDrawable( images[i % images.length], null ) );
            person.setText_name   ( "name " + i );
            person.setText_age    ( i + "" );
            person.setImage_check ( false );
            items.add(person);
        }

        return items;
    }
}
