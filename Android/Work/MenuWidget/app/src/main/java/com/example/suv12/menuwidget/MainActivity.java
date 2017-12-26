package com.example.suv12.menuwidget;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final int REQUEST_CODE_LOGIN = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // ---------------------------------------------------------------------------------------------------
        // 이전에 로그인 한 상태로 어플을 종료 했을경우 그 상태를 읽어와서 맞는 메뉴를 표시                   |
        // 이전 상태 유지                                                                                     |
        SharedPreferences pref = getSharedPreferences(CommonCode.FILE_PREFERENCES, MODE_PRIVATE);           //|
        boolean loginStatus = pref.getBoolean(CommonCode.LOGIN_STATUS, false);                          //|
        setMenuVisible(loginStatus);                                                                        //|
        //----------------------------------------------------------------------------------------------------

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_login) {
            //①
            //로그인 버튼을 눌렀을때
            //LoginActivity 로 새창 띄우기
            Intent i = new Intent(MainActivity.this, LoginActivity.class);
            //MainActivity에서 LoginActivity로 데이터를 넘기고 LoginActivity 새창 띄움
            //REQUEST_CODE_LOGIN와 함께
            startActivityForResult(i, REQUEST_CODE_LOGIN);
            //① > LoginActivity
        } else if (id == R.id.nav_logout) {
            //로그 아웃 버튼 눌렀을때
            setMenuVisible(false);

            SharedPreferences pref = getSharedPreferences(CommonCode.FILE_PREFERENCES, MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();
            editor.putBoolean(CommonCode.LOGIN_STATUS, false);
            editor.apply();
        } else if (id == R.id.nav_register) {

        } else if (id == R.id.nav_edit) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //③
        if (requestCode == REQUEST_CODE_LOGIN && resultCode == RESULT_OK) {
            boolean loginStatus = data.getBooleanExtra(CommonCode.LOGIN_STATUS, false);
            setMenuVisible(loginStatus);
        }
        //③
    }

    // boolean값을 인자로 받아서 메뉴 보임 여부를 판단하는 메서드
    private void setMenuVisible(boolean loginStatus) {
        NavigationView navView = findViewById(R.id.nav_view);
        Menu menu = navView.getMenu();
        menu.findItem(R.id.nav_login).setVisible(!loginStatus);
        menu.findItem(R.id.nav_logout).setVisible(loginStatus);
        menu.findItem(R.id.nav_register).setVisible(!loginStatus);
        menu.findItem(R.id.nav_edit).setVisible(loginStatus);
    }
}
