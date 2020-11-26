package com.example.galeribuahtropis;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.galeribuahtropis.Model.Buah;
import com.example.galeribuahtropis.Model.Hijau;
import com.example.galeribuahtropis.Model.Kuning;
import com.example.galeribuahtropis.Model.Merah;



public class DataProvider {
    private static List<Buah> buahs =new ArrayList<>();

    private static List<Merah> iniDataMerah(Context ctx) {
        List<Merah> merahs = new ArrayList<>();
        merahs.add(new Merah("Apel", "Cameo",
                "Apel berasal dari washington,buah ini cendrung manis,berair dan renyah kulitnya yang berwarna merah kekuning-kuningan", R.drawable.buah_apel));
        merahs.add(new Merah("Buah Naga", "Merah",
                "Buah naga ini punya warna kulit merah cenderung gelap dan berukuran besar. Buah naga jenis ini mengandung kalsium dan fosfor yang tinggi.", R.drawable.buah_naga));
        merahs.add(new Merah("Stroberi", "Merah",
                "Stroberi yang berwarna merah.Stroberi ini mengandung banyak vitamin c dan antioksidan. Stroberi merah biasa digunakan untuk membuat kue atau jus stroberi.", R.drawable.buah_stroberi));
        merahs.add(new Merah("Semanka", "Sweet Beauty",
                " Semangka Sweet Beauty memiliki kulit buah yang tebal dan berwarna hijau terang. Daging buah semangka ini warnanya cukup merah dan banyak airnya.", R.drawable.buah_semangka));
        merahs.add(new Merah("Delima", "Merah",
                "Warna merah buah delima juga menunjukkan bahwa rasa daging buahnya manis. Sebab semakin merah warna delima, maka rasanya juga semakin manis.", R.drawable.buah_delima));
        return merahs;
    }
    private static List<Kuning> iniDataKuning(Context ctx) {
        List<Kuning> kunings = new ArrayList<>();
        kunings.add(new Kuning("Belimbing", "Wulan",
                "Buahnya sendiri memiliki ukuran lebih besar dari induk persilangannya. Dagingnya sendiri kaya akan kandungan air dan memiliki rasa manis.", R.drawable.buah_belimbing));
        kunings.add(new Kuning("Nanas", "Queen",
                "Nanas Queen memiliki rasa yang lebih manis daripada nanas Cayenne dan memiliki daun yang berduri.", R.drawable.buah_nanas));
        kunings.add(new Kuning("Jeruk", "Sunkist",
                "Sunkist adalah jeruk yang memiliki rasa buah yang manis dan aroma yang segar. Bentuk buahnya cenderung bulat dan berukuran kecil.", R.drawable.buah_jeruk));
        kunings.add(new Kuning("Mangga", "Yuwen",
                "Kulit mangga ini berwarna kuning, merah, dan sedikit warna hijau saat sudah matang. Yang membedakan adalah warna merah pada mangga yuwen cenderung lebih cerah.", R.drawable.buah_mangga));
        kunings.add(new Kuning("Pisang", "Cavendish",
                "Buahnya berbentuk melengkung dan memiliki panjang sekitar 14-15cm. Kulit buahnya berwarna kuning mulus dan bersih", R.drawable.buah_pisang));
        return kunings;
    }
    private static List<Hijau> iniDataHijau(Context ctx) {
        List<Hijau> hijaus = new ArrayList<>();
        hijaus.add(new Hijau("Alpukat", "Miki",
                "Tanaman alpukat miki ini mempunyai buah berukuran besar yang rata-rata mencapai berat 400-600 gram/buah.", R.drawable.buah_alpukat));
        hijaus.add(new Hijau("Melon", "Japanese",
                "Melon jenis ini memiliki net tipis rapat,dagingnya berwarna putih kehijauan,dagingnya renyah dan sangat manis", R.drawable.buah_melon));
        hijaus.add(new Hijau("Pir", "Anjous",
                "Buah ini memiliki ukuran yang cukup besar dengan berat rata-rata sekitar 270-285 gram per buah.", R.drawable.buah_pir));
        hijaus.add(new Hijau("Sirsak", "Bali",
                "sirsak ini biasanya memiliki ukuran yang lebih kecil dari pada sirsak pada umumnya beratnya hanya sekitar 200-300 gram", R.drawable.buah_sirsak));
        hijaus.add(new Hijau("Jambu", "Kristal",
                "Jambu kristal merupakan salah satu jenis jambu yang memiliki biji lebih sedikit, namun tekstur buahnya lebih renyah.", R.drawable.buah_jambu));
        return hijaus;
    }
    private static void initAllBuahs(Context ctx) {
        buahs.addAll(iniDataMerah(ctx));
        buahs.addAll(iniDataKuning(ctx));
        buahs.addAll(iniDataHijau(ctx));
    }
    public static List<Buah> getAllBuah(Context ctx) {
        if (buahs.size() == 0) {
            initAllBuahs(ctx);
        }
        return  buahs;
    }
    public static List<Buah> getBuahsByTipe(Context ctx, String warna) {
        List<Buah> buahsByType = new ArrayList<>();
        if (buahs.size() == 0) {
            initAllBuahs(ctx);
        }
        for (Buah h : buahs) {
            if (h.getWarna().equals(warna)) {
                buahsByType.add(h);
            }
        }
        return buahsByType;
    }

}

