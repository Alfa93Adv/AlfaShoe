package com.example.alfashoes.activitiesVans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.alfashoes.FragmentsVans.BlackVMFragment;
import com.example.alfashoes.FragmentsVans.BlackVUFragment;
import com.example.alfashoes.FragmentsVans.BlueVMFragment;
import com.example.alfashoes.FragmentsVans.BlueVUFragment;
import com.example.alfashoes.FragmentsVans.SilverVMFragment;
import com.example.alfashoes.FragmentsVans.SilverVUFragment;
import com.example.alfashoes.R;
import com.example.alfashoes.activities.PembelianActivity;
import com.example.alfashoes.activities.VansActivity;

public class Vans2Activity extends AppCompatActivity {
    public static final String ADIDAS = "Adidas Quester";
    private TextView sepatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vans2);
        sepatu = findViewById(R.id.textView14);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackVMFragment blackVMFragment = (BlackVMFragment) getSupportFragmentManager().findFragmentByTag("BLACK_VM_FRAGMENTS");
        if(blackVMFragment != null && blackVMFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.vans2_placeholder, new BlackVMFragment(), "BLACK_VM_FRAGMENTS");
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

        BlackVMFragment blackVMFragment = (BlackVMFragment) getSupportFragmentManager().findFragmentByTag("BLACK_VM_FRAGMENTS");
        if(blackVMFragment != null && blackVMFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.vans2_placeholder, new BlackVMFragment(), "BLACK_VM_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQblue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlueVMFragment blueVMFragment = (BlueVMFragment) getSupportFragmentManager().findFragmentByTag("BLUE_VM_FRAGMENTS");
        if(blueVMFragment != null && blueVMFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.vans2_placeholder, new BlueVMFragment(), "BLUE_VM_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQsilver(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        SilverVMFragment silverVMFragment = (SilverVMFragment) getSupportFragmentManager().findFragmentByTag("SILVER_VM_FRAGMENTS");
        if(silverVMFragment != null && silverVMFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.vans2_placeholder, new SilverVMFragment(), "SILVER_VM_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
