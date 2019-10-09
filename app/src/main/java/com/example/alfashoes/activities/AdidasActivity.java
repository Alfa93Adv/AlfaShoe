package com.example.alfashoes.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.alfashoes.MainActivity;
import com.example.alfashoes.R;
import com.example.alfashoes.activitiesAdidas.Adidas1Activity;
import com.example.alfashoes.activitiesAdidas.Adidas2Activity;

public class AdidasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas);
    }

    public void ClickMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void ClickAdidas1(View view) {
        Intent intent = new Intent(this, Adidas1Activity.class);
        startActivity(intent);
    }

    public void ClickAdidas2(View view) {
        Intent intent = new Intent(this, Adidas2Activity.class);
        startActivity(intent);
    }
}
