package com.example.belajarandroid_minggu3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dashboard);
    }

    public void Pindah1(View view) {
        Intent intent = new Intent(MenuDashboard.this, MainActivity.class);
        startActivity(intent);
    }

    public void Pindah2(View view) {
        Intent intent = new Intent(MenuDashboard.this, Relative_Layout.class);
        startActivity(intent);
    }

    public void Pindah3(View view) {
        Intent intent = new Intent(MenuDashboard.this, Constraint_Layout.class);
        startActivity(intent);
    }

    public void Pindah4(View view) {
        Intent intent = new Intent(MenuDashboard.this, Frame_Layout.class);
        startActivity(intent);
    }

    public void Pindah5(View view) {
        Intent intent = new Intent(MenuDashboard.this, Tabel_Layout.class);
        startActivity(intent);
    }

    public void Pindah6(View view) {
        Intent intent = new Intent(MenuDashboard.this, Relative_Layout.class);
        startActivity(intent);
    }

    public void Pindah7(View view) {
        Intent intent = new Intent(MenuDashboard.this, ScrollView_Layout.class);
        startActivity(intent);
    }

    public void Pindah8(View view) {
        Intent intent = new Intent(MenuDashboard.this, ScrollViewHorizontal_Layout.class);
        startActivity(intent);
    }
}