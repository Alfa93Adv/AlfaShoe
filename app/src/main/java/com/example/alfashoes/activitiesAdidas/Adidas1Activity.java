package com.example.alfashoes.activitiesAdidas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.alfashoes.FragmentsAdidas.BlackPodFragment;
import com.example.alfashoes.FragmentsAdidas.BlackQuesterFragment;
import com.example.alfashoes.FragmentsAdidas.BlueQuesterFragment;
import com.example.alfashoes.FragmentsAdidas.SilverQuesterFragment;
import com.example.alfashoes.MainActivity;
import com.example.alfashoes.R;
import com.example.alfashoes.activities.AdidasActivity;
import com.example.alfashoes.activities.PembelianActivity;

import static com.example.alfashoes.activities.AdidasActivity.IMAGE;

public class Adidas1Activity extends AppCompatActivity {

    public static final String ADIDAS = "Adidas Quester";
    private TextView sepatu;
//    private FrameLayout adidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas1);
        sepatu = findViewById(R.id.textView14);
//        adidas = findViewById(R.id.adidas1_placeholder);
//
//        Bundle extras = getIntent().getExtras();
//        if (extras != null) {
//            // TODO: display value here
//            String adidas = extras.getString(IMAGE);
//            System.out.println(adidas);
//            this.adidas.setBackground(Drawable.createFromPath(adidas));
//        }

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackQuesterFragment blackQuesterFragment = (BlackQuesterFragment) getSupportFragmentManager().findFragmentByTag("BLACK_QUESTER_FRAGMENTS");
        if(blackQuesterFragment != null && blackQuesterFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas1_placeholder, new BlackQuesterFragment(), "BLACK_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

    }

    public void ClickQblack(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlackQuesterFragment blackQuesterFragment = (BlackQuesterFragment) getSupportFragmentManager().findFragmentByTag("BLACK_QUESTER_FRAGMENTS");
        if(blackQuesterFragment != null && blackQuesterFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas1_placeholder, new BlackQuesterFragment(), "BLACK_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQblue(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        BlueQuesterFragment blueQuesterFragment = (BlueQuesterFragment) getSupportFragmentManager().findFragmentByTag("BLUE_QUESTER_FRAGMENTS");
        if(blueQuesterFragment != null && blueQuesterFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas1_placeholder, new BlueQuesterFragment(), "BLUE_QUESTER_FRAGMENTS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void ClickQsilver(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        SilverQuesterFragment silverQuesterFragment = (SilverQuesterFragment) getSupportFragmentManager().findFragmentByTag("SILVER_QUESTER_FRAGMENTS");
        if(silverQuesterFragment != null && silverQuesterFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.adidas1_placeholder, new SilverQuesterFragment(), "SILVER_QUESTER_FRAGMENTS");
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
