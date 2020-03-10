package com.example.tugas_2_123170100;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
<<<<<<< HEAD
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

=======
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity  {
>>>>>>> 8ffb6725f9204d194ed56355e2347b2a2c004c82

    private RecyclerView recyclerViewHero;
    private ArrayList<PahlawanModel> pahlawan = new ArrayList<>();

<<<<<<< HEAD
=======

>>>>>>> 8ffb6725f9204d194ed56355e2347b2a2c004c82
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewHero = findViewById(R.id.recycle_hero);
        recyclerViewHero.setHasFixedSize(true);

<<<<<<< HEAD
=======
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
>>>>>>> 8ffb6725f9204d194ed56355e2347b2a2c004c82

        pahlawan.addAll(PahlawanData.getListDetail());
        showRecycler();
    }

<<<<<<< HEAD
=======
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.nav_home:
                            selectedFragment = new FragHome();
                            break;
                        case R.id.nav_details:
                            selectedFragment = new FragProfile();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };


>>>>>>> 8ffb6725f9204d194ed56355e2347b2a2c004c82
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
<<<<<<< HEAD


    }
=======
    }


>>>>>>> 8ffb6725f9204d194ed56355e2347b2a2c004c82
}
