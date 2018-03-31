package com.ataberkdinc.burcrehberi;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    String[] burclar = {"Koç", "Boğa", "İkizler", "Yengeç", "Aslan", "Başak", "Terazi", "Akrep", "Yay", "Oğlak", "Kova", "Balık"};
    int[] images = {R.drawable.aries, R.drawable.taurus, R.drawable.gemini, R.drawable.cancer, R.drawable.leo, R.drawable.virgo
            , R.drawable.libra, R.drawable.scorpio, R.drawable.sagittarius, R.drawable.capricornus, R.drawable.aquarius, R.drawable.pisces};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAdapter adapter = new CustomAdapter(this, burclar, images);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if (position==0){
            Intent myIntent = new Intent(v.getContext(),koc.class);
            startActivityForResult(myIntent,0);
        }
    }

    }


