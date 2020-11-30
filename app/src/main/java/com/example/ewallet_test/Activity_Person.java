package com.example.ewallet_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Activity_Person extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__person);
        BottomNavigationView botNav = (BottomNavigationView)findViewById(R.id.bottomNav);
        botNav.setBackground(null);
        botNav.getMenu().getItem(0).setChecked(true);

    }

    public void unfocus(View v){
        BottomNavigationView botNav = (BottomNavigationView)findViewById(R.id.bottomNav);
        botNav.getMenu().getItem(1).setEnabled(true);
        botNav.getMenu().getItem(1).setChecked(true);
        botNav.getMenu().getItem(1).setEnabled(false);

    }

}