package com.example.galeribuahtropis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    ImageButton btnMerah,btnKuning,btnHijau;
    public static final String WARNA_GALERI_KEY = "WARNA_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }
    private void inisialisasiView() {
        btnMerah = findViewById(R.id.btn_buka_nama_merah);
        btnKuning = findViewById(R.id.btn_buka_nama_kuning);
        btnHijau = findViewById(R.id.btn_buka_nama_hijau);
        btnMerah.setOnClickListener(view -> bukaGaleri("Merah"));
        btnKuning.setOnClickListener(view -> bukaGaleri("Kuning"));
        btnHijau.setOnClickListener(view -> bukaGaleri("Hijau"));
    }
    private void bukaGaleri(String warnaBuah) {
        Log.d("MAIN","Buka activity merah");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(WARNA_GALERI_KEY, warnaBuah);
        startActivity(intent);
    }
}