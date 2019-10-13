package com.example.alfashoes.activitiesNike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.alfashoes.FragmentsNike.BlackEpicFragment;
import com.example.alfashoes.FragmentsNike.BlackReactFragment;
import com.example.alfashoes.FragmentsNike.BlueEpicFragment;
import com.example.alfashoes.FragmentsNike.BlueReactFragment;
import com.example.alfashoes.FragmentsNike.SilverEpicFragment;
import com.example.alfashoes.FragmentsNike.SilverReactFragment;
import com.example.alfashoes.R;
import com.example.alfashoes.activities.NikeActivity;
import com.example.alfashoes.activities.PembelianActivity;

public class Nike6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nike6);
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

        BlackEpicFragment blackEpicFragment = (BlackEpicFragment) getSupportFragmentManager().findFragmentByTag("BLACK_QUESTER_FRAGMENTS");
        if(blackEpicFragment != null && blackEpicFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike6_placeholder, new BlackEpicFragment(), "BLACK_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQblue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlueEpicFragment blueEpicFragment = (BlueEpicFragment) getSupportFragmentManager().findFragmentByTag("BLUE_QUESTER_FRAGMENTS");
        if(blueEpicFragment != null && blueEpicFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike6_placeholder, new BlueEpicFragment(), "BLUE_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQsilver(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        SilverEpicFragment silverEpicFragment = (SilverEpicFragment) getSupportFragmentManager().findFragmentByTag("SILVER_QUESTER_FRAGMENTS");
        if(silverEpicFragment != null && silverEpicFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike6_placeholder, new SilverEpicFragment(), "SILVER_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
