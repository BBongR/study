package com.example.suv12.menuwidget;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    // SharedPreferences 선언
    private SharedPreferences pref;

    private Button btnLogin;
    private EditText edtID;
    private EditText edtPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        edtID = findViewById(R.id.edtID);
        edtPW = findViewById(R.id.edtPW);

        // 로그인 페이지가 실행 될때 저장된 아이디나 패스워드가 있으면 자동으로 완성해준다
        pref = getSharedPreferences(CommonCode.FILE_PREFERENCES,MODE_PRIVATE);
        edtID.setText(pref.getString(CommonCode.LOGIN_ID,""));
        edtPW.setText(pref.getString(CommonCode.LOGIN_PW, ""));

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edtID.getText().toString().trim().equals("1111") && edtPW.getText().toString().trim().equals("1111")) {
                    // ②
                    // Settings.xml에 정보 저장
                    pref = getSharedPreferences(CommonCode.FILE_PREFERENCES, MODE_PRIVATE);
                    // 정보를 추가/변경 하기위해서는 Editor를 사용해야함
                    SharedPreferences.Editor editor = pref.edit();
                    editor.putString(CommonCode.LOGIN_ID, edtID.getText().toString());
                    editor.putString(CommonCode.LOGIN_PW, edtPW.getText().toString());
                    editor.putBoolean(CommonCode.LOGIN_STATUS, true);
                    // 위에서 변경한 정보 적용
                    editor.apply();

                    // 값을 data에 넣어서
                    Intent data = new Intent();
                    data.putExtra(CommonCode.LOGIN_STATUS, true);

                    // 원래 요청한곳으로 넘긴다
                    setResult(RESULT_OK, data);

                    // 현재 Activity를 닫는다
                    finish();
                    // ② > MainActivity onActivityResult 메서드
                }
                else {
                    // 로그인 실패
                    Toast.makeText(getApplicationContext(), CommonCode.LOGIN_FAILED, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
