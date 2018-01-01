package com.example.suv12.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView list_view;
    private ListViewAdapter adapter;

    private ArrayList<PersonData> items;

    private Button btn_add;
    private EditText edit_name, edit_number, edit_dept;

    // 스피너 데이터 추가
    private ArrayAdapter spinner_adapter;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 리스트 뷰와 어댑터 연결
        items = new ArrayList<PersonData>();
        list_view = findViewById(R.id.list_view);
        adapter = new ListViewAdapter(MainActivity.this, R.layout.activity_person_view, items);
        list_view.setAdapter(adapter);

        // 초기데이터
        for (int i = 0; i < 10; i++) {
            adapter.addItem("aaa "+i, i, "aaa "+i);
        }

        btn_add = findViewById(R.id.btn_add);

        edit_name = findViewById(R.id.edit_name);
        edit_number = findViewById(R.id.edit_number);
        edit_dept = findViewById(R.id.edit_dept);

        // 스피너 데이터 추가 (str_arrays.xml 의 값을 가져와서 추가함)
        spinner = findViewById(R.id.spinner);
        spinner_adapter = ArrayAdapter.createFromResource(this, R.array.str_arrays, android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(spinner_adapter);

        ButtonInner bi = new ButtonInner();

        btn_add.setOnClickListener(bi);
    }

    private class ButtonInner implements Button.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_add:
                    String name = edit_name.getText().toString();
                    int number = Integer.parseInt(edit_number.getText().toString());
                    String dept = edit_dept.getText().toString();

                    adapter.addItem(name, number, dept);
                    break;
            }
        }
    }
}
