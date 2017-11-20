package com.example.smkm2p.utsmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    String namaBangun;
    TextView parameter1, parameter2,parameter3,parameter4;
    EditText inputParam1, inputParam2,inputParam3,inputParam4;

    Button btLuas, btKeliling;

    double value1,value2,value3,value4,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final Intent intent = new Intent(DetailActivity.this, HasilActivity.class);

        parameter1 = (TextView) findViewById(R.id.param1);
        parameter2 = (TextView) findViewById(R.id.param2);
        parameter3 = (TextView) findViewById(R.id.param3);
        parameter4 = (TextView) findViewById(R.id.param4);

        inputParam1 = (EditText) findViewById(R.id.editParam1);
        inputParam2 = (EditText) findViewById(R.id.editParam2);
        inputParam3 = (EditText) findViewById(R.id.editParam3);
        inputParam4 = (EditText) findViewById(R.id.editParam4);

        Intent bngun = getIntent();

        btLuas = (Button) findViewById(R.id.hitungLuas);
        btKeliling = (Button) findViewById(R.id.hitungKeliling);
        namaBangun = bngun.getStringExtra("Nama");

        if(namaBangun == "Persegi"){
            parameter1.setText("Sisi");
            parameter2.setText("Sisi");
            parameter3.setVisibility(View.INVISIBLE);
            parameter4.setVisibility(View.INVISIBLE);
            inputParam3.setVisibility(View.INVISIBLE);
            inputParam4.setVisibility(View.INVISIBLE);

            btLuas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    value1 = Double.parseDouble(inputParam1.getText().toString());
                    value2 = Double.parseDouble(inputParam2.getText().toString());

                    hasil = value1 * value1;

                    intent.putExtra("Hasil", hasil);
                    intent.putExtra("Nama","Persegi");
                    startActivity(intent);
                }
            });

            btKeliling.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    value1 = Double.parseDouble(inputParam1.getText().toString());
                    value2 = Double.parseDouble(inputParam2.getText().toString());

                    hasil = 4 * value1;

                    intent.putExtra("Hasil", hasil);
                    intent.putExtra("Nama","Persegi");
                    startActivity(intent);
                }
            });
        }else if(namaBangun == "Lingkaran"){
            parameter1.setText("Jari-Jari");
            parameter2.setVisibility(View.INVISIBLE);
            parameter3.setVisibility(View.INVISIBLE);
            parameter4.setVisibility(View.INVISIBLE);
            inputParam2.setVisibility(View.INVISIBLE);
            inputParam3.setVisibility(View.INVISIBLE);
            inputParam4.setVisibility(View.INVISIBLE);

            btLuas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    value1 = Double.parseDouble(inputParam1.getText().toString());

                    hasil = value1 * 3.14;

                    intent.putExtra("Hasil", hasil);
                    intent.putExtra("Nama","Lingkaran");
                    startActivity(intent);
                }
            });

            btKeliling.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    value1 = Double.parseDouble(inputParam1.getText().toString());

                    hasil = value1 * 2 * 3.14;

                    intent.putExtra("Hasil", hasil);
                    intent.putExtra("Nama","Lingkaran");
                    startActivity(intent);
                }
            });
        } else if(namaBangun == "Segitiga"){
            parameter1.setText("Alas/Sisi");
            parameter2.setText("Tinggi/Sisi");
            parameter3.setText("Sisi");

            parameter4.setVisibility(View.INVISIBLE);
            inputParam4.setVisibility(View.INVISIBLE);

            btLuas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    value1 = Double.parseDouble(inputParam1.getText().toString());
                    value2 = Double.parseDouble(inputParam2.getText().toString());

                    hasil = value1 * value1 * 0.5;

                    intent.putExtra("Hasil", hasil);
                    intent.putExtra("Nama","Segitiga");
                    startActivity(intent);
                }
            });

            btKeliling.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    value1 = Double.parseDouble(inputParam1.getText().toString());
                    value2 = Double.parseDouble(inputParam2.getText().toString());
                    value3 = Double.parseDouble(inputParam3.getText().toString());

                    hasil = value1 + value2 + value3;

                    intent.putExtra("Hasil", hasil);
                    intent.putExtra("Nama","Segitiga");
                    startActivity(intent);
                }
            });
        }else if(namaBangun == "Persegi Panjang"){
            parameter1.setText("Panjang");
            parameter2.setText("Lebar");
            parameter3.setVisibility(View.INVISIBLE);
            parameter4.setVisibility(View.INVISIBLE);
            inputParam3.setVisibility(View.INVISIBLE);
            inputParam4.setVisibility(View.INVISIBLE);

            btLuas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    value1 = Double.parseDouble(inputParam1.getText().toString());
                    value2 = Double.parseDouble(inputParam2.getText().toString());

                    hasil = value1 * value1;

                    intent.putExtra("Hasil", hasil);
                    intent.putExtra("Nama","Persegi Panjang");
                    startActivity(intent);
                }
            });

            btKeliling.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    value1 = Double.parseDouble(inputParam1.getText().toString());
                    value2 = Double.parseDouble(inputParam2.getText().toString());

                    hasil = (2 * value1) + (2 * value2);

                    intent.putExtra("Hasil", hasil);
                    intent.putExtra("Nama","Panjang");
                    startActivity(intent);
                }
            });
        }else if(namaBangun == "Trapesium"){
            parameter1.setText("Alas/Sisi");
            parameter2.setText("Tinggi/Sisi");
            parameter3.setText("Sisi");
            parameter4.setText("Sisi");

            btLuas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    value1 = Double.parseDouble(inputParam1.getText().toString());
                    value2 = Double.parseDouble(inputParam2.getText().toString());

                    hasil = value1 * value1 * 0.5;

                    intent.putExtra("Hasil", hasil);
                    intent.putExtra("Nama","Trapesium");
                    startActivity(intent);
                }
            });

            btKeliling.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    value1 = Double.parseDouble(inputParam1.getText().toString());
                    value2 = Double.parseDouble(inputParam2.getText().toString());
                    value3 = Double.parseDouble(inputParam3.getText().toString());
                    value4 = Double.parseDouble(inputParam4.getText().toString());

                    hasil = value1 + value2 + value3 + value4;

                    intent.putExtra("Hasil", hasil);
                    intent.putExtra("Nama","Trapesium");
                    startActivity(intent);
                }
            });
        }

    }
}
