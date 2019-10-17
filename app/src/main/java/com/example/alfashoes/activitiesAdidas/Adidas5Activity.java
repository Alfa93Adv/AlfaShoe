package com.example.alfashoes.activitiesAdidas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.alfashoes.FragmentsAdidas.BlackAdizeroFragment;
import com.example.alfashoes.FragmentsAdidas.BlackDameFragment;
import com.example.alfashoes.FragmentsAdidas.BlueAdizeroFragment;
import com.example.alfashoes.FragmentsAdidas.BlueDameFragment;
import com.example.alfashoes.FragmentsAdidas.SilverAdizeroFragment;
import com.example.alfashoes.FragmentsAdidas.SilverDameFragment;
import com.example.alfashoes.R;
import com.example.alfashoes.activities.AdidasActivity;
import com.example.alfashoes.activities.PembelianActivity;

public class Adidas5Activity extends AppCompatActivity {
    public static final String ADIDAS = "Adidas Quester";
    private TextView sepatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas5);
        sepatu = findViewById(R.id.textView14);
    }
    public void ClickQblack(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackDameFragment blackDameFragment = (BlackDameFragment) getSupportFragmentManager().findFragmentByTag("BLACK_DAME_FRAGMENTS");
        if(blackDameFragment  != null && blackDameFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas5_placeholder, new BlackDameFragment(), "BLACK_DAME_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQblue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlueDameFragment blueDameFragment = (BlueDameFragment) getSupportFragmentManager().findFragmentByTag("BLUE_DAME_FRAGMENTS");
        if( blueDameFragment != null && blueDameFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas5_placeholder, new BlueDameFragment(), "BLUE_DAME_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQsilver(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        SilverDameFragment silverDameFragment = (SilverDameFragment) getSupportFragmentManager().findFragmentByTag("SILVER_DAME_FRAGMENTS");
        if(silverDameFragment != null && silverDameFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas5_placeholder, new SilverDameFragment(), "SILVER_DAME_FRAGMENTS");
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
