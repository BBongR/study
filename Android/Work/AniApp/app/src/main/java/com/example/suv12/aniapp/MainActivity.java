package com.example.suv12.aniapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox1 = null;

    private RadioGroup radioGroup1 = null;
    private Button button1 = null;

    private ImageView imageViewDog = null;
    private ImageView imageViewCat = null;
    private ImageView imageViewRabbit = null;

    private LinearLayout linearLayout1 = null;

    private int temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.checkBox1);
        CheckInner cb = new CheckInner();
        checkBox1.setOnCheckedChangeListener(cb);

        radioGroup1 = findViewById(R.id.radiogroup1);
        button1 = findViewById(R.id.button1);

        imageViewDog = findViewById(R.id.imageViewDog);
        imageViewCat = findViewById(R.id.imageViewCat);
        imageViewRabbit = findViewById(R.id.imageViewRabbit);

        RadioInner rd = new RadioInner();
        radioGroup1.setOnCheckedChangeListener(rd);

        ButtonInner bt = new ButtonInner();
        button1.setOnClickListener(bt);

        linearLayout1 = findViewById(R.id.linearlayout1);
    }

    private class CheckInner implements CheckBox.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (b == true) {
                linearLayout1.setVisibility(View.VISIBLE);
            } else if (b == false) {
                linearLayout1.setVisibility(View.INVISIBLE);
                radioGroup1.clearCheck();
                imageViewDog.setVisibility(View.INVISIBLE);
                imageViewCat.setVisibility(View.GONE);
                imageViewRabbit.setVisibility(View.GONE);
            }
        }
    }

    private class RadioInner implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (R.id.radioButtonDog == i) {
                temp = i;
            } else if (R.id.radioButtonCat == i) {
                temp = i;
            } else if (R.id.radioButtonRabbit == i) {
                temp = i;
            }
        }
    }

    private class ButtonInner implements Button.OnClickListener {
        @Override
        public void onClick(View view) {
            if (temp == R.id.radioButtonDog) {
                imageViewDog.setVisibility(View.VISIBLE);
                imageViewCat.setVisibility(View.GONE);
                imageViewRabbit.setVisibility(View.GONE);
            } else if (temp == R.id.radioButtonCat) {
                imageViewDog.setVisibility(View.GONE);
                imageViewCat.setVisibility(View.VISIBLE);
                imageViewRabbit.setVisibility(View.GONE);
            } else if (temp == R.id.radioButtonRabbit) {
                imageViewDog.setVisibility(View.GONE);
                imageViewCat.setVisibility(View.GONE);
                imageViewRabbit.setVisibility(View.VISIBLE);
            }
        }
    }
}
