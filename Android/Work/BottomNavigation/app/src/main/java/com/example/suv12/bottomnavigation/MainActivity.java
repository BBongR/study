package com.example.suv12.bottomnavigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_snow:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_ac_unit_black_24dp, null));
                    return true;
                case R.id.navigation_android:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_android_black_24dp, null));
                    return true;
                case R.id.navigation_wc:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_wc_black_24dp, null));
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
