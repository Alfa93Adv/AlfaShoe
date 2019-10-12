package com.example.alfashoes.activitiesAdidas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.alfashoes.FragmentsAdidas.BlackAdizeroFragment;
import com.example.alfashoes.FragmentsAdidas.BlackNeoFragment;
import com.example.alfashoes.FragmentsAdidas.BlueAdizeroFragment;
import com.example.alfashoes.FragmentsAdidas.BlueNeoFragment;
import com.example.alfashoes.FragmentsAdidas.SilverAdizeroFragment;
import com.example.alfashoes.FragmentsAdidas.SilverNeoFragment;
import com.example.alfashoes.R;
import com.example.alfashoes.activities.AdidasActivity;
import com.example.alfashoes.activities.PembelianActivity;

public class Adidas4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas4);
    }
    public void ClickQblack(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackAdizeroFragment blackAdizeroFragment = (BlackAdizeroFragment) getSupportFragmentManager().findFragmentByTag("BLACK_QUESTER_FRAGMENTS");
        if(blackAdizeroFragment  != null && blackAdizeroFragment .isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas4_placeholder, new BlackAdizeroFragment(), "BLACK_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQblue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlueAdizeroFragment blueAdizeroFragment = (BlueAdizeroFragment) getSupportFragmentManager().findFragmentByTag("BLUE_QUESTER_FRAGMENTS");
        if(blueAdizeroFragment != null && blueAdizeroFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas4_placeholder, new BlueAdizeroFragment(), "BLUE_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQsilver(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        SilverAdizeroFragment silverAdizeroFragment = (SilverAdizeroFragment) getSupportFragmentManager().findFragmentByTag("SILVER_QUESTER_FRAGMENTS");
        if(silverAdizeroFragment  != null && silverAdizeroFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas4_placeholder, new SilverAdizeroFragment(), "SILVER_QUESTER_FRAGMENTS");
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
