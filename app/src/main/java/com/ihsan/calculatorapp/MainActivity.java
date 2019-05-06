package com.ihsan.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    // todo 1 Deklarasi View yang dibuat
    EditText nilai1, nilai2;
    TextView hasil;
    Button tambah, kurang, bagi, kali, hapus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// todo 2 inisialisasi view yang di buat
        nilai1 =findViewById(R.id.nilai1);
        nilai2 =findViewById(R.id.nilai2);
        hasil =findViewById(R.id.hasil);
        tambah =findViewById(R.id.tambah);
        kurang =findViewById(R.id.kurang);
        bagi =findViewById(R.id.bagi);
        kali =findViewById(R.id.kali);
        hapus =findViewById(R.id.hapus);

        //todo 9 atur Button untuk masing2 operator
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                b
              } else {
                    tambah();
                }
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Masukkan angka terlebih dahulu", Toast.LENGTH_SHORT).show();
                } else {
                    kurang();
                 }
            }

        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Masukkan angka terlebih dahulu", Toast.LENGTH_SHORT).show();
                }else {
                    bagi();
                }

            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "masukkan angka terlebih dahulu", Toast.LENGTH_SHORT).show();
                }else {
                    kali();
                }

            }
        });
        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hapus();

            }
        });

    }

    // todo 3 membuat method baru


    // todo 4 Membuat Method namanya tambah


     void tambah(){
        //  Simpan inputan user ke dalam Variable

        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());
        // Menjumlahkan
        int total = angka1 + angka2;

        hasil.setText(String.valueOf(total));

    }


    // todo 5 Membuat Method namanya kurang

      void kurang(){
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        int total = angka1 - angka2;

        hasil.setText(String.valueOf(total));

    }


    // todo 6 Membuat Method namanya kali
    void kali(){
        double angka1 = Double.parseDouble(nilai1.getText().toString());
        double angka2 = Double.parseDouble(nilai2.getText().toString());

        double total = angka1 * angka2;
        hasil.setText(String.valueOf(total));
    }


    // todo 7 Membuat Method namanya bagi
    void bagi(){
        double angka1 = Double.parseDouble(nilai1.getText().toString());
        double angka2 = Double.parseDouble(nilai2.getText().toString());

        double total = angka1 / angka2;
        hasil.setText(String.valueOf(total));
    }


    // todo 8 Membuat Method namanya hapus
     void hapus(){


        nilai1.setText("");
        nilai2.setText("");
    }

}