package com.example.alfashoes.activitiesNike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.alfashoes.FragmentsNike.BlackMPFFragment;
import com.example.alfashoes.FragmentsNike.BlackReactFragment;
import com.example.alfashoes.FragmentsNike.BlueMPFFragment;
import com.example.alfashoes.FragmentsNike.BlueReactFragment;
import com.example.alfashoes.FragmentsNike.SilverMPFFragment;
import com.example.alfashoes.FragmentsNike.SilverReactFragment;
import com.example.alfashoes.R;
import com.example.alfashoes.activities.NikeActivity;
import com.example.alfashoes.activities.PembelianActivity;

public class Nike8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nike8);
    }
    public void ClickBackNike(View view) {
        Intent intent = new Intent(this, NikeActivity.class);
        startActivity(intent);
    }

    public void ClickPembelian(View view) {
        Intent intent = new Intent(this, PembelianActivity.class);
        startActivity(intent);
    }

    public void ClickQblack(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackMPFFragment blackMPFFragment = (BlackMPFFragment) getSupportFragmentManager().findFragmentByTag("BLACK_QUESTER_FRAGMENTS");
        if(blackMPFFragment != null && blackMPFFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike8_placeholder, new BlackMPFFragment(), "BLACK_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQblue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlueMPFFragment blueMPFFragment = (BlueMPFFragment) getSupportFragmentManager().findFragmentByTag("BLUE_QUESTER_FRAGMENTS");
        if(blueMPFFragment != null && blueMPFFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike8_placeholder, new BlueMPFFragment(), "BLUE_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQsilver(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        SilverMPFFragment silverMPFFragment = (SilverMPFFragment) getSupportFragmentManager().findFragmentByTag("SILVER_QUESTER_FRAGMENTS");
        if(silverMPFFragment != null && silverMPFFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike8_placeholder, new SilverMPFFragment(), "SILVER_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
