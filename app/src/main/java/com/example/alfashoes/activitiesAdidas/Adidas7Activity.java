package com.example.alfashoes.activitiesAdidas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.alfashoes.FragmentsAdidas.BlackGazzeleFragment;
import com.example.alfashoes.FragmentsAdidas.BlackYeezyFragment;
import com.example.alfashoes.FragmentsAdidas.BlueGazzeleFragment;
import com.example.alfashoes.FragmentsAdidas.BlueYeezyFragment;
import com.example.alfashoes.FragmentsAdidas.SilverGazzeleFragment;
import com.example.alfashoes.FragmentsAdidas.SilverYeezyFragment;
import com.example.alfashoes.R;
import com.example.alfashoes.activities.AdidasActivity;
import com.example.alfashoes.activities.PembelianActivity;

public class Adidas7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas7);
    }
    public void ClickQblack(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackGazzeleFragment blackGazzeleFragment = (BlackGazzeleFragment) getSupportFragmentManager().findFragmentByTag("BLACK_QUESTER_FRAGMENTS");
        if(blackGazzeleFragment  != null && blackGazzeleFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas7_placeholder, new BlackGazzeleFragment(), "BLACK_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQblue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlueGazzeleFragment blueGazzeleFragment = (BlueGazzeleFragment) getSupportFragmentManager().findFragmentByTag("BLUE_QUESTER_FRAGMENTS");
        if(blueGazzeleFragment != null && blueGazzeleFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas7_placeholder, new BlueGazzeleFragment(), "BLUE_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQsilver(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        SilverGazzeleFragment silverGazzeleFragment = (SilverGazzeleFragment) getSupportFragmentManager().findFragmentByTag("SILVER_QUESTER_FRAGMENTS");
        if(silverGazzeleFragment != null && silverGazzeleFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas7_placeholder, new SilverGazzeleFragment(), "SILVER_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickBackAdidas(View view) {
        Intent intent = new Intent(this, AdidasActivity.class);
        startActivity(intent);
    }

    public void ClickPembelian(View view) {
        Intent intent = new Intent(this, PembelianActivity.class);
        startActivity(intent);
    }
}
