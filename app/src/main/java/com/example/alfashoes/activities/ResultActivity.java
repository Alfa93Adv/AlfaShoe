package com.example.alfashoes.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.alfashoes.R;

import static com.example.alfashoes.activities.PembelianActivity.RESULT;

public class ResultActivity extends AppCompatActivity {
    private TextView NamaSepatu;
    private  TextView Warna;
    private TextView Ukuran;
    private TextView Nama;
    private  TextView Alamat;
    private TextView No;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        NamaSepatu = findViewById(R.id.sepatu);
        Warna = findViewById(R.id.warna);
        Ukuran = findViewById(R.id.ukuran);
        Nama = findViewById(R.id.nama);
        Alamat = findViewById(R.id.alamat);
        No = findViewById(R.id.no);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            HasilResult h = extras.getParcelable(RESULT);

            NamaSepatu.setText(h.getNamaSepatu());
            Warna.setText(h.getWarna());
            Ukuran.setText(h.getUkuran());
            Nama.setText(h.getNama());
            Alamat.setText(h.getAlamat());
            No.setText(h.getNo());


        }
    }

    public void Kembali(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
