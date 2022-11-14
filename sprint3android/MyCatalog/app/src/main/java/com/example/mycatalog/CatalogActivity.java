package com.example.mycatalog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CatalogActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
    }

    public void navegarDetalle(View v) {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
}