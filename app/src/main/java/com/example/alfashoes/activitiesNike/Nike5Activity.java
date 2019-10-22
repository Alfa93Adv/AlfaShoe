package com.example.alfashoes.activitiesNike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.alfashoes.FragmentsNike.Black97Fragment;
import com.example.alfashoes.FragmentsNike.BlackReactFragment;
import com.example.alfashoes.FragmentsNike.Blue97Fragment;
import com.example.alfashoes.FragmentsNike.BlueReactFragment;
import com.example.alfashoes.FragmentsNike.Silver97Fragment;
import com.example.alfashoes.FragmentsNike.SilverReactFragment;
import com.example.alfashoes.R;
import com.example.alfashoes.activities.NikeActivity;
import com.example.alfashoes.activities.PembelianActivity;

public class Nike5Activity extends AppCompatActivity {
    public static final String ADIDAS = "Adidas Quester";
    private TextView sepatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nike5);
        sepatu = findViewById(R.id.textView14);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        Black97Fragment black97Fragment = (Black97Fragment) getSupportFragmentManager().findFragmentByTag("BLACK_97_FRAGMENTS");
        if(black97Fragment != null && black97Fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike5_placeholder, new Black97Fragment(), "BLACK_97_FRAGMENTS");
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

        Black97Fragment black97Fragment = (Black97Fragment) getSupportFragmentManager().findFragmentByTag("BLACK_97_FRAGMENTS");
        if(black97Fragment != null && black97Fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike5_placeholder, new Black97Fragment(), "BLACK_97_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQblue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        Blue97Fragment blue97Fragment = (Blue97Fragment) getSupportFragmentManager().findFragmentByTag("BLUE_97_FRAGMENTS");
        if(blue97Fragment != null && blue97Fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike5_placeholder, new Blue97Fragment(), "BLUE_97_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQsilver(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        Silver97Fragment silver97Fragment = (Silver97Fragment) getSupportFragmentManager().findFragmentByTag("SILVER_97_FRAGMENTS");
        if(silver97Fragment != null && silver97Fragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.nike5_placeholder, new Silver97Fragment(), "SILVER_97_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
