package com.example.alfashoes.activitiesAdidas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
    public static final String ADIDAS = "Adidas Quester";
    private TextView sepatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas7);
        sepatu = findViewById(R.id.textView14);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackGazzeleFragment blackGazzeleFragment = (BlackGazzeleFragment) getSupportFragmentManager().findFragmentByTag("BLACK_GAZZELE_FRAGMENTS");
        if(blackGazzeleFragment  != null && blackGazzeleFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas7_placeholder, new BlackGazzeleFragment(), "BLACK_GAZZELE_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
    public void ClickQblack(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackGazzeleFragment blackGazzeleFragment = (BlackGazzeleFragment) getSupportFragmentManager().findFragmentByTag("BLACK_GAZZELE_FRAGMENTS");
        if(blackGazzeleFragment  != null && blackGazzeleFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas7_placeholder, new BlackGazzeleFragment(), "BLACK_GAZZELE_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQblue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlueGazzeleFragment blueGazzeleFragment = (BlueGazzeleFragment) getSupportFragmentManager().findFragmentByTag("BLUE_GAZZELE_FRAGMENTS");
        if(blueGazzeleFragment != null && blueGazzeleFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas7_placeholder, new BlueGazzeleFragment(), "BLUE_GAZZELE_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQsilver(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        SilverGazzeleFragment silverGazzeleFragment = (SilverGazzeleFragment) getSupportFragmentManager().findFragmentByTag("SILVER_GAZZELE_FRAGMENTS");
        if(silverGazzeleFragment != null && silverGazzeleFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas7_placeholder, new SilverGazzeleFragment(), "SILVER_GAZZELE_FRAGMENTS");
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
