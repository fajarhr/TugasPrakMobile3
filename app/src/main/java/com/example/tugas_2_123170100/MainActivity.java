package com.example.tugas_2_123170100;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerViewHero;
    private ArrayList<PahlawanModel> pahlawan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewHero = findViewById(R.id.recycle_hero);
        recyclerViewHero.setHasFixedSize(true);


        pahlawan.addAll(PahlawanData.getListDetail());
        showRecycler();
    }

    private void showRecycler() {
        recyclerViewHero.setLayoutManager(new LinearLayoutManager(this));
        PahlawanAdapter adapterHero = new PahlawanAdapter(pahlawan);
        adapterHero.setListHero(pahlawan);
        recyclerViewHero.setAdapter(adapterHero);

        adapterHero.setOnItemClickCallback(new PahlawanAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(PahlawanModel hero) {
                Toast.makeText(MainActivity.this, "Detail " + hero.getHeroName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, PahlawanDetail.class);
                intent.putExtra(PahlawanDetail.EXTRA_DATA, (Parcelable) hero);
                startActivity(intent);
            }
        });


    }
}
