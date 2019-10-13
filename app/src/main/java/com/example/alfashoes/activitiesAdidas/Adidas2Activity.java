package com.example.alfashoes.activitiesAdidas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.alfashoes.FragmentsAdidas.BlackPodFragment;
import com.example.alfashoes.FragmentsAdidas.BlackQuesterFragment;
import com.example.alfashoes.FragmentsAdidas.BluePodFragment;
import com.example.alfashoes.FragmentsAdidas.SilverPodFragment;
import com.example.alfashoes.FragmentsAdidas.SilverQuesterFragment;
import com.example.alfashoes.MainActivity;
import com.example.alfashoes.R;
import com.example.alfashoes.activities.PembelianActivity;

public class Adidas2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas2);
    }

    public void ClickMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void ClickPsilver(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        SilverPodFragment silverPodFragment= (SilverPodFragment) getSupportFragmentManager().findFragmentByTag("SILVER_POD_FRAGMENTS");
        if(silverPodFragment != null && silverPodFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas2_placeholder, new SilverPodFragment(), "SILVER_POD_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickPblack(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackPodFragment blackPodFragment = (BlackPodFragment) getSupportFragmentManager().findFragmentByTag("SILVER_POD_FRAGMENTS");
        if(blackPodFragment != null && blackPodFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas2_placeholder, new BlackPodFragment(), "SILVER_POD_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickPBlue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BluePodFragment bluePodFragment = (BluePodFragment) getSupportFragmentManager().findFragmentByTag("SILVER_POD_FRAGMENTS");
        if( bluePodFragment != null &&  bluePodFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas2_placeholder, new BluePodFragment(), "SILVER_POD_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickPembelian(View view) {
        Intent intent = new Intent(this, PembelianActivity.class);
        startActivity(intent);
    }
}
