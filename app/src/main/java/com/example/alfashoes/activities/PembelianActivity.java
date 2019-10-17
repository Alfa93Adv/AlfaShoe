package com.example.alfashoes.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alfashoes.R;
import com.example.alfashoes.activitiesAdidas.Adidas3Activity;

import static com.example.alfashoes.activitiesAdidas.Adidas1Activity.ADIDAS;

public class PembelianActivity extends AppCompatActivity {
    private TextView sepatu;
    RadioGroup  radioWarna;
    RadioGroup radioUkuran;
    private TextView Alamat;
    private TextView No;
    private TextView Konfirmasi;
    private  TextView nama;
    private  RadioButton Black, Silver, Blue;
    private RadioButton radio41,radio42,radio43;
    HasilResult hasilResult;
    public static final String RESULT = "result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembelian);
        sepatu = findViewById(R.id.editText);
        radioWarna = findViewById(R.id.RadioGroup);
        radioUkuran = findViewById(R.id.RadioGroup);
        nama = findViewById(R.id.editNama);
        Alamat = findViewById(R.id.editAlamat);
        No = findViewById(R.id.editNo);
        Konfirmasi = findViewById(R.id.buttonKonfirmasi);

        Black = (RadioButton)findViewById(R.id.radioBlack);
        Blue = (RadioButton)findViewById(R.id.radioBlue);
        Silver = (RadioButton)findViewById(R.id.radioSilver);

        radio41 = (RadioButton)findViewById(R.id.radio41);
        radio42 = (RadioButton)findViewById(R.id.radio42);
        radio43 = (RadioButton)findViewById(R.id.radio43);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            String sepatu = extras.getString(ADIDAS);
            this.sepatu.setText(sepatu);
        }
        Konfirmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sepatu.length()==0 || Alamat.length()==0 || No.length()==0 || radioWarna.getCheckedRadioButtonId()== -1 || radioUkuran.getCheckedRadioButtonId()==-1){
                    Toast.makeText(PembelianActivity.this, "harus diisi semua", Toast.LENGTH_SHORT).show();
                }else {
                    handleHasil();
                }
            }
        });

    }

    public void ClickBeli(View view) {

    }

    public void handleHasil(){
        String sepatu = this.sepatu.getText().toString();
        String nama = this.nama.getText().toString();
        String alamat = this.Alamat.getText().toString();
        String No = this.No.getText().toString();
        String result = (Black.isChecked())?"Black":(Blue.isChecked())?"Blue":(Silver.isChecked())?"Silver":"";
        String resultukuran = (radio41.isChecked())?"41":(radio42.isChecked())?"42":(radio43.isChecked())?"43":"";

//        Toast.makeText(PembelianActivity.this, "berhasil", Toast.LENGTH_SHORT).show();

        hasilResult = new HasilResult(sepatu, result, resultukuran, nama, alamat, No);

        Intent intent = new Intent(PembelianActivity.this, ResultActivity.class);
            intent.putExtra(RESULT, hasilResult);
        startActivity(intent);


    }
}
