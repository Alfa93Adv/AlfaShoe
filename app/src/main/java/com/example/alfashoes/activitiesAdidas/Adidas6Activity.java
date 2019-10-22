package com.example.alfashoes.activitiesAdidas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.alfashoes.FragmentsAdidas.BlackDameFragment;
import com.example.alfashoes.FragmentsAdidas.BlackYeezyFragment;
import com.example.alfashoes.FragmentsAdidas.BlueDameFragment;
import com.example.alfashoes.FragmentsAdidas.BlueYeezyFragment;
import com.example.alfashoes.FragmentsAdidas.SilverDameFragment;
import com.example.alfashoes.FragmentsAdidas.SilverYeezyFragment;
import com.example.alfashoes.R;
import com.example.alfashoes.activities.AdidasActivity;
import com.example.alfashoes.activities.PembelianActivity;

public class Adidas6Activity extends AppCompatActivity {
    public static final String ADIDAS = "Adidas Quester";
    private TextView sepatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas6);
        sepatu = findViewById(R.id.textView14);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackYeezyFragment blackYeezyFragment = (BlackYeezyFragment) getSupportFragmentManager().findFragmentByTag("BLACK_YEEZY_FRAGMENTS");
        if(blackYeezyFragment  != null && blackYeezyFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas6_placeholder, new BlackYeezyFragment(), "BLACK_YEEZY_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
    public void ClickQblack(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackYeezyFragment blackYeezyFragment = (BlackYeezyFragment) getSupportFragmentManager().findFragmentByTag("BLACK_YEEZY_FRAGMENTS");
        if(blackYeezyFragment  != null && blackYeezyFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas6_placeholder, new BlackYeezyFragment(), "BLACK_YEEZY_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQblue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlueYeezyFragment blueYeezyFragment = (BlueYeezyFragment) getSupportFragmentManager().findFragmentByTag("BLUE_YEEZY_FRAGMENTS");
        if(blueYeezyFragment != null && blueYeezyFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas6_placeholder, new BlueYeezyFragment(), "BLUE_YEEZY_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQsilver(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        SilverYeezyFragment silverYeezyFragment = (SilverYeezyFragment) getSupportFragmentManager().findFragmentByTag("SILVER_YEEZY_FRAGMENTS");
        if(silverYeezyFragment != null && silverYeezyFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas6_placeholder, new SilverYeezyFragment(), "SILVER_YEEZY_FRAGMENTS");
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
