package com.example.suv12.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private PersonView personView;
    private ImageView img_select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personView = findViewById(R.id.view_person);
        img_select = findViewById(R.id.img_select);

        personView.setOnImageClickListener(new PersonView.OnImageClickListener() {
            @Override
            public void onImageClick(PersonView view, PersonData data) {
                img_select.setImageDrawable(data.getPhoto());
                img_select.setVisibility(View.VISIBLE);
            }
        });
    }
}
