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
import com.example.alfashoes.activitiesNike.Nike2Activity;
import com.example.alfashoes.activitiesNike.Nike3Activity;
import com.example.alfashoes.activitiesNike.Nike4Activity;
import com.example.alfashoes.activitiesNike.Nike5Activity;
import com.example.alfashoes.activitiesNike.Nike6Activity;
import com.example.alfashoes.activitiesNike.Nike7Activity;
import com.example.alfashoes.activitiesNike.Nike8Activity;

public class NikeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nike);
    }

    public void ClickNike1(View view) {
        Intent intent = new Intent(this, Nike1Activity.class);
        startActivity(intent);
    }

    public void ClickNike2(View view) {
        Intent intent = new Intent(this, Nike2Activity.class);
        startActivity(intent);
    }
    public void ClickNike3(View view) {
        Intent intent = new Intent(this, Nike3Activity.class);
        startActivity(intent);
    }
    public void ClickNike4(View view) {
        Intent intent = new Intent(this, Nike4Activity.class);
        startActivity(intent);
    }
    public void ClickNike5(View view) {
        Intent intent = new Intent(this, Nike5Activity.class);
        startActivity(intent);
    }
    public void ClickNike6(View view) {
        Intent intent = new Intent(this, Nike6Activity.class);
        startActivity(intent);
    }
    public void ClickNike7(View view) {
        Intent intent = new Intent(this, Nike7Activity.class);
        startActivity(intent);
    }
    public void ClickNike8(View view) {
        Intent intent = new Intent(this, Nike8Activity.class);
        startActivity(intent);
    }
}
