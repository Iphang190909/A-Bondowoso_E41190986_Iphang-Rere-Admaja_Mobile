package com.example.belajarandroid_minggu3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Relative_Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative__layout);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(Relative_Layout.this, Constraint_Layout.class);
        startActivity(intent);
    }
}