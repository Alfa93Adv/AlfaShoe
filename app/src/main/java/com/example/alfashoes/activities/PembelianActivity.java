package com.example.alfashoes.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.alfashoes.R;

public class PembelianActivity extends AppCompatActivity {
    String [] sepatu = {"Adidas Quester",
            "Adidas Pod",
            "Adidas Neo",
            "Adidas AdiZero",
            "Adidas Dame 4",
            "Adidas Yeezy",
            "Adidas Gazzelle",
            "Adidas ZX 750",
            "Nike React Elemet 55",
            "Nike Air Max",
            "Nike Air Jordan",
            "Nike Air Rift",
            "Nike Air Max 97",
            "Nike Epic",
            "Nike Vapor Max",
            "Nike Vapor Max Premier Flynit",
            "Vans U era",
            "Vans Magical Most Mistif"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembelian);
    }

    public void ClickBeli(View view) {
//        String s = String.valueOf(sepatu);
//        if(s == sepatu){
//            Toast.makeText(this, "Terima Kasih", Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(this, HomeActivity.class);
//            startActivity(intent);
//        }
//        else{
//            Toast.makeText(this, "Nama Sepatu yang anda masukkan salah", Toast.LENGTH_SHORT).show();
//        }
    }
}
