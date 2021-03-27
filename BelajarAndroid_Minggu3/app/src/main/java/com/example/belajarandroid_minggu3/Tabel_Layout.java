package com.example.belajarandroid_minggu3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tabel_Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabel__layout);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(Tabel_Layout.this, ScrollView_Layout.class);
        startActivity(intent);
    }
}