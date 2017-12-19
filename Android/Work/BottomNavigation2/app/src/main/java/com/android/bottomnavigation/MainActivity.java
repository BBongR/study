package com.android.bottomnavigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.han1, null));
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    return true;
                case R.id.navigation_dashboard:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.han2, null));
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    return true;
                case R.id.navigation_notifications:
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.han3, null));
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
