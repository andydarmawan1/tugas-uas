package com.example.utsnabilahra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.utsnabilahra.entities.AdapterDaftar;
import com.example.utsnabilahra.models.Daftar;

import java.util.ArrayList;
import java.util.List;

public class DaftarBukuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_buku);

        List<Daftar> daftarList= new ArrayList<>();
        daftarList.add(new Daftar("buku_1", "Dunia Sophie","Rp. 60.000",R.drawable.duniashopie));
        daftarList.add(new Daftar("buku_2", "Etika Politik","Rp. 75.000", R.drawable.etikapolitik));
        daftarList.add(new Daftar("buku_3", "Filsafat Kebahagiaan","Rp. 80.000", R.drawable.filsafatkebahagiaan));
        daftarList.add(new Daftar("buku_4", "Mimpi Sejuta Dolar","Rp. 65.000" ,R.drawable.mimpisejutadolar));
        daftarList.add(new Daftar("buku_5", "Soe Hoek Gi","Rp. 89.000" ,R.drawable.soehokgie));
        daftarList.add(new Daftar("buku_6", "Manajemen SDM","Rp. 70.000" , R.drawable.manajemensdm));
        daftarList.add(new Daftar("buku_7", "Psikologi Umum", "Rp. 65.000", R.drawable.psikologiumum));
        daftarList.add(new Daftar("buku_8", "Birokrasi Politik", "Rp. 70.000", R.drawable.birokrasipolitik));


        AdapterDaftar adapterDaftar= new AdapterDaftar(daftarList);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_daftar);
        recyclerView.setAdapter(adapterDaftar);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
