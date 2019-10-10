package com.example.alfashoes.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.alfashoes.FragmentsAdidas.SilverQuesterFragment;
import com.example.alfashoes.MainActivity;
import com.example.alfashoes.R;
import com.example.alfashoes.activitiesNike.Nike1Activity;

public class NikeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nike);
    }

    public void ClickMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void ClickNike1(View view) {
        Intent intent = new Intent(this, Nike1Activity.class);
        startActivity(intent);
    }
}
