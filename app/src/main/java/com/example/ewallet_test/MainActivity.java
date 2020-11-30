package com.example.ewallet_test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView botNav = (BottomNavigationView)findViewById(R.id.bottomNav);
        botNav.setBackground(null);
        botNav.getMenu().getItem(1).setChecked(true);
        botNav.getMenu().getItem(1).setEnabled(false);

        botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            public boolean onNavigationItemSelected( MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.person:
//                        Toast.makeText(getApplicationContext(), "個人頁面", Toast.LENGTH_SHORT).show();
                        goPerson();
                        break;

                    case R.id.system:
//                        Toast.makeText(getApplicationContext(), "系統設定", Toast.LENGTH_SHORT).show();
                        goSystem();
                        break;
                    default:
                        return false;
                }
                return true;
            }
        });
    }

    public void unfocus(View v){
        BottomNavigationView botNav = (BottomNavigationView)findViewById(R.id.bottomNav);
        botNav.getMenu().getItem(1).setEnabled(true);
        botNav.getMenu().getItem(1).setChecked(true);
        botNav.getMenu().getItem(1).setEnabled(false);
    }

    private void goPerson(){
        Intent intent = new Intent(this, Activity_Person.class);
        startActivity(intent);
    }

    private void goSystem(){
        Intent intent = new Intent(this, Activity_System.class);
        startActivity(intent);
    }


}