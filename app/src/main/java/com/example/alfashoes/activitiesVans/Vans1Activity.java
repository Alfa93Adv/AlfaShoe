package com.example.alfashoes.activitiesVans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.alfashoes.FragmentsNike.BlackReactFragment;
import com.example.alfashoes.FragmentsNike.BlueReactFragment;
import com.example.alfashoes.FragmentsNike.SilverReactFragment;
import com.example.alfashoes.FragmentsVans.BlackVUFragment;
import com.example.alfashoes.FragmentsVans.BlueVUFragment;
import com.example.alfashoes.FragmentsVans.SilverVUFragment;
import com.example.alfashoes.R;
import com.example.alfashoes.activities.NikeActivity;
import com.example.alfashoes.activities.PembelianActivity;
import com.example.alfashoes.activities.VansActivity;

public class Vans1Activity extends AppCompatActivity {
    public static final String ADIDAS = "Adidas Quester";
    private TextView sepatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vans1);
        sepatu = findViewById(R.id.textView14);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackVUFragment blackVUFragment = (BlackVUFragment) getSupportFragmentManager().findFragmentByTag("BLACK_VU_FRAGMENTS");
        if(blackVUFragment != null && blackVUFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.vans1_placeholder, new BlackVUFragment(), "BLACK_VU_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
    public void ClickBackVans(View view) {
        Intent intent = new Intent(this, VansActivity.class);
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

        BlackVUFragment blackVUFragment = (BlackVUFragment) getSupportFragmentManager().findFragmentByTag("BLACK_VU_FRAGMENTS");
        if(blackVUFragment != null && blackVUFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.vans1_placeholder, new BlackVUFragment(), "BLACK_VU_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQblue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlueVUFragment blueVUFragment = (BlueVUFragment) getSupportFragmentManager().findFragmentByTag("BLUE_VU_FRAGMENTS");
        if(blueVUFragment != null && blueVUFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.vans1_placeholder, new BlueVUFragment(), "BLUE_VU_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQsilver(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        SilverVUFragment silverVUFragment = (SilverVUFragment) getSupportFragmentManager().findFragmentByTag("SILVER_VU_FRAGMENTS");
        if(silverVUFragment != null && silverVUFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.vans1_placeholder, new SilverVUFragment(), "SILVER_VU_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
