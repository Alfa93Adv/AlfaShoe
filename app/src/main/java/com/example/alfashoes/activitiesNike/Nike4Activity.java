package com.example.alfashoes.activitiesNike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.alfashoes.FragmentsNike.BlackReactFragment;
import com.example.alfashoes.FragmentsNike.BlackRiftFragment;
import com.example.alfashoes.FragmentsNike.BlueReactFragment;
import com.example.alfashoes.FragmentsNike.BlueRiftFragment;
import com.example.alfashoes.FragmentsNike.SilverReactFragment;
import com.example.alfashoes.FragmentsNike.SilverRiftFragment;
import com.example.alfashoes.R;
import com.example.alfashoes.activities.NikeActivity;
import com.example.alfashoes.activities.PembelianActivity;

public class Nike4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nike4);
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

        BlackRiftFragment blackRiftFragment = (BlackRiftFragment) getSupportFragmentManager().findFragmentByTag("BLACK_QUESTER_FRAGMENTS");
        if(blackRiftFragment != null && blackRiftFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike4_placeholder, new BlackRiftFragment(), "BLACK_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQblue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlueRiftFragment blueRiftFragment = (BlueRiftFragment) getSupportFragmentManager().findFragmentByTag("BLUE_QUESTER_FRAGMENTS");
        if(blueRiftFragment != null && blueRiftFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike4_placeholder, new BlueRiftFragment(), "BLUE_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQsilver(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        SilverRiftFragment silverRiftFragment = (SilverRiftFragment) getSupportFragmentManager().findFragmentByTag("SILVER_QUESTER_FRAGMENTS");
        if(silverRiftFragment != null && silverRiftFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike4_placeholder, new SilverRiftFragment(), "SILVER_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
