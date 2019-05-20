package com.example.utsnabilahra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button btnLihatPemesan;
    private Button btnTambahPemesan;
    private Button btnDaftarBuku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        this.initComponents();
    }

    private void initComponents() {
        this.btnLihatPemesan = (Button) this.findViewById(R.id.btnLihatPemesan);
        this.btnTambahPemesan = (Button) this.findViewById(R.id.btnTambahPemesan);
        this.btnDaftarBuku = (Button) this.findViewById(R.id.btnDaftarBuku);
    }
    public void button_onClick(View view)
    {
        Button b = (Button) view;

        if(b == this.btnLihatPemesan)
        {
            this.openLihatPemesanActivity();
        }
        else if(b == this.btnTambahPemesan)
        {
            this.openTambahPemesanActivity();
        }
        else if(b == this.btnDaftarBuku)
        {
            this.openDaftarBukuActivity();
        }
    }
    private void openLihatPemesanActivity()
    {
        Intent i = new Intent(this, LihatPemesanActivity.class);
        this.startActivity(i);
    }
    private void openTambahPemesanActivity()
    {
        Intent i = new Intent(this, TambahPemesanActivity.class);
        this.startActivity(i);
    }
    private void openDaftarBukuActivity()
    {
        Intent i = new Intent(this, DaftarBukuActivity.class);
        this.startActivity(i);
    }
}
