package com.example.alfashoes.activitiesNike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.alfashoes.FragmentsNike.BlackJordanFragment;
import com.example.alfashoes.FragmentsNike.BlackReactFragment;
import com.example.alfashoes.FragmentsNike.BlueJordanFragment;
import com.example.alfashoes.FragmentsNike.BlueReactFragment;
import com.example.alfashoes.FragmentsNike.SilverJordanFragment;
import com.example.alfashoes.FragmentsNike.SilverReactFragment;
import com.example.alfashoes.R;
import com.example.alfashoes.activities.NikeActivity;
import com.example.alfashoes.activities.PembelianActivity;

public class Nike3Activity extends AppCompatActivity {
    public static final String ADIDAS = "Adidas Quester";
    private TextView sepatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nike3);
        sepatu = findViewById(R.id.textView14);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackJordanFragment blackJordanFragment = (BlackJordanFragment) getSupportFragmentManager().findFragmentByTag("BLACK_JORDAN_FRAGMENTS");
        if(blackJordanFragment != null && blackJordanFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike3_placeholder, new BlackJordanFragment(), "BLACK_JORDAN_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
    public void ClickBackNike(View view) {
        Intent intent = new Intent(this, NikeActivity.class);
        startActivity(intent);
    }

    public void ClickPembelian(View view) {
        String sepatu = this.sepatu.getText().toString();
        Intent intent = new Intent(this, PembelianActivity.class);
        intent.putExtra(ADIDAS, sepatu);
        startActivity(intent);
    }

    public void ClickQblack(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackJordanFragment blackJordanFragment = (BlackJordanFragment) getSupportFragmentManager().findFragmentByTag("BLACK_JORDAN_FRAGMENTS");
        if(blackJordanFragment != null && blackJordanFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike3_placeholder, new BlackJordanFragment(), "BLACK_JORDAN_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQblue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlueJordanFragment blueJordanFragment = (BlueJordanFragment) getSupportFragmentManager().findFragmentByTag("BLUE_JORDAN_FRAGMENTS");
        if(blueJordanFragment != null && blueJordanFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike3_placeholder, new BlueJordanFragment(), "BLUE_JORDAN_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQsilver(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        SilverJordanFragment silverJordanFragment = (SilverJordanFragment) getSupportFragmentManager().findFragmentByTag("SILVER_JORDAN_FRAGMENTS");
        if(silverJordanFragment != null && silverJordanFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike3_placeholder, new SilverJordanFragment(), "SILVER_JORDAN_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
