package com.example.alfashoes.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.alfashoes.FragmentsAdidas.BlackQuesterFragment;
import com.example.alfashoes.MainActivity;
import com.example.alfashoes.R;
import com.example.alfashoes.activitiesAdidas.Adidas1Activity;
import com.example.alfashoes.activitiesAdidas.Adidas2Activity;
import com.example.alfashoes.activitiesAdidas.Adidas3Activity;
import com.example.alfashoes.activitiesAdidas.Adidas4Activity;
import com.example.alfashoes.activitiesAdidas.Adidas5Activity;
import com.example.alfashoes.activitiesAdidas.Adidas6Activity;
import com.example.alfashoes.activitiesAdidas.Adidas7Activity;
import com.example.alfashoes.activitiesAdidas.Adidas8Activity;

public class AdidasActivity extends AppCompatActivity {

    public static final String IMAGE = "image";
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas);
        iv = findViewById(R.id.adidas1);
//        iv.setImageResource(R.drawable.adidas1);
    }

    public void ClickAdidas1(View view) {
        Intent intent = new Intent(this, Adidas1Activity.class);
        String img =  iv.getResources().toString();
        System.out.println(";nuihiuh :   " +iv);
        intent.putExtra(IMAGE, img);
        startActivity(intent);
    }

    public void ClickAdidas2(View view) {
        Intent intent = new Intent(this, Adidas2Activity.class);
        startActivity(intent);
    }

    public void ClickAdidas3(View view) {
        Intent intent = new Intent(this, Adidas3Activity.class);
        startActivity(intent);
    }

    public void ClickAdidas4(View view) {
        Intent intent = new Intent(this, Adidas4Activity.class);
        startActivity(intent);
    }

    public void ClickAdidas5(View view) {
        Intent intent = new Intent(this, Adidas5Activity.class);
        startActivity(intent);
    }

    public void ClickAdidas6(View view) {
        Intent intent = new Intent(this, Adidas6Activity.class);
        startActivity(intent);
    }

    public void ClickAdidas7(View view) {
        Intent intent = new Intent(this, Adidas7Activity.class);
        startActivity(intent);
    }
    public void ClickAdidas8(View view) {
        Intent intent = new Intent(this, Adidas8Activity.class);
        startActivity(intent);
    }
}
