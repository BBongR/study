package com.example.st5inflationcustomtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View child = LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_toastborder,null,false);

        TextView textView = child.findViewById(R.id.textView);
        textView.setText("toast 띄움");

        Toast toast = new Toast(MainActivity.this);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(child);
        toast.show();
    }
}
