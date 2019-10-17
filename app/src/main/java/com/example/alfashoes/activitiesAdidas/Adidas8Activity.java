package com.example.alfashoes.activitiesAdidas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.alfashoes.FragmentsAdidas.BlackGazzeleFragment;
import com.example.alfashoes.FragmentsAdidas.BlackzFragment;
import com.example.alfashoes.FragmentsAdidas.BlueGazzeleFragment;
import com.example.alfashoes.FragmentsAdidas.BluezFragment;
import com.example.alfashoes.FragmentsAdidas.SilverGazzeleFragment;
import com.example.alfashoes.FragmentsAdidas.SilverzFragment;
import com.example.alfashoes.R;
import com.example.alfashoes.activities.AdidasActivity;
import com.example.alfashoes.activities.PembelianActivity;

public class Adidas8Activity extends AppCompatActivity {
    public static final String ADIDAS = "Adidas Quester";
    private TextView sepatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas8);
        sepatu = findViewById(R.id.textView14);
    }
    public void ClickQblack(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackzFragment blackzFragment = (BlackzFragment) getSupportFragmentManager().findFragmentByTag("BLACK_Z_FRAGMENTS");
        if(blackzFragment  != null && blackzFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas8_placeholder, new BlackzFragment(), "BLACK_Z_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQblue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BluezFragment bluezFragment = (BluezFragment) getSupportFragmentManager().findFragmentByTag("BLUE_Z_FRAGMENTS");
        if(bluezFragment != null && bluezFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas8_placeholder, new BluezFragment(), "BLUE_Z_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQsilver(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        SilverzFragment silverzFragment = (SilverzFragment) getSupportFragmentManager().findFragmentByTag("SILVER_Z_FRAGMENTS");
        if(silverzFragment != null && silverzFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas8_placeholder, new SilverzFragment(), "SILVER_Z_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickBackAdidas(View view) {
        Intent intent = new Intent(this, AdidasActivity.class);
        startActivity(intent);
    }

    public void ClickPembelian(View view) {
        String sepatu = this.sepatu.getText().toString();
        Intent intent = new Intent(this, PembelianActivity.class);
        intent.putExtra(ADIDAS, sepatu);
        startActivity(intent);
    }
}
