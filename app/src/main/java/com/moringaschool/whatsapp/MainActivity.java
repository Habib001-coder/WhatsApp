package com.moringaschool.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.TableLayout;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

       private Toolbar mToolbar;
       private ViewPager myViewPager;
       private TableLayout myTableLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("WhatsApp");



    }
}