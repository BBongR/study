package com.example.suv12.studentcustomlistview;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listV;
    private StudentAdapter adapter;
    private ArrayList<ModelStudent> studentData;

    private Spinner spinner;
    private ArrayAdapter spinner_Adapter;

    private Button btn_Add, btn_Search, btn_Sort, btn_AllDel, btn_Init;
    private EditText edt_Name, edt_Num, edt_Dept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Add = findViewById(R.id.btn_Add);
        btn_Search = findViewById(R.id.btn_Search);
        btn_Sort = findViewById(R.id.btn_Sort);
        btn_AllDel = findViewById(R.id.btn_AllDel);
        btn_Init = findViewById(R.id.btn_Init);

        // 스피너 추가 ( student_category.xml 추가 )
        spinner = findViewById(R.id.spinner);
        spinner_Adapter = ArrayAdapter.createFromResource(this, R.array.student_category, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinner_Adapter);

        // 리스트 뷰와 어댑터 연결
        studentData = new ArrayList<>();
        adapter = new StudentAdapter(this, R.layout.view_student, studentData);
        listV = findViewById(R.id.listV);
        listV.setAdapter(adapter);

        // 초기 데이터
        for (int i = 1; i < 6; i++) {
            adapter.addItem("aaa " + i, "bbb " + i, i + "" + i + "-" + i + i);
        }

        // 머리 아이템 설정
        // !!! 주의 머릿 / 꼬리 아이템은 반드시 리스트의 setAdapter 전체 추가되어야 한다.
        View headerView = getLayoutInflater().inflate(R.layout.list_view_header, null);
        TextView headerTv = (TextView) headerView.findViewById(R.id.header_footer_text);
        headerTv.setText("리스트의 시작입니다.");
        listV.addHeaderView(headerView, null, true);

        // 2 - 5. 꼬리 아이템 설정
        // !!! 주의 머릿 / 꼬리 아이템은 반드시 리스트의 setAdapter 전체 추가되어야 한다.
        View footerView = getLayoutInflater().inflate(R.layout.list_view_header, null);
        TextView footerTv = (TextView) footerView.findViewById(R.id.header_footer_text);
        footerTv.setText("로딩 중...");
        listV.addFooterView(footerView, null, false);

        // 리스트 아이템 구분선 설정
        listV.setDivider(new ColorDrawable(Color.MAGENTA));
        listV.setDividerHeight(3);
    }
}
