package com.example.smkm2p.utsmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] itemName = {
            "Persegi",
            "Lingkaran",
            "Segitiga",
            "Persegi Panjang",
            "Trapesium"
    };

    Integer[] imgId = {
            R.drawable.square,
            R.drawable.circle,
            R.drawable.triangle,
            R.drawable.rectangle,
            R.drawable.trapesium
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intent = new Intent(MainActivity.this, DetailActivity.class);

        CustomAdapter adapter = new CustomAdapter(this, itemName, imgId);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position){
                    case 0 :
                        intent.putExtra("Nama",itemName[0]);
                        startActivity(intent);
                        break;
                    case 1 :
                        intent.putExtra("Nama",itemName[1]);
                        startActivity(intent);
                        break;
                    case 2 :
                        intent.putExtra("Nama",itemName[2]);
                        startActivity(intent);
                        break;
                    case 3 :
                        intent.putExtra("Nama",itemName[3]);
                        startActivity(intent);
                        break;
                    case 4 :
                        intent.putExtra("Nama",itemName[4]);
                        startActivity(intent);
                        break;
                    default :
                        break;
                }
            }
        });
    }
}
