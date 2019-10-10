package com.example.alfashoes.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.alfashoes.R;
import com.example.alfashoes.activitiesVans.Vans1Activity;
import com.example.alfashoes.activitiesVans.Vans2Activity;

public class VansActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vans);
    }

    public void ClickVans1(View view) {
        Intent intent = new Intent(this, Vans1Activity.class);
        startActivity(intent);
    }
    public void ClickVans2(View view) {
        Intent intent = new Intent(this, Vans2Activity.class);
        startActivity(intent);
    }
}
