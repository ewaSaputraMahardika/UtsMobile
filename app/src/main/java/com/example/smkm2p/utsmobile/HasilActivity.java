package com.example.smkm2p.utsmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView nama, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        nama = (TextView) findViewById(R.id.nama);
        hasil = (TextView) findViewById(R.id.hasil);

        nama.setText(getIntent().getStringExtra("Nama"));
        hasil.setText(getIntent().getStringExtra("Hasil"));
    }
}
