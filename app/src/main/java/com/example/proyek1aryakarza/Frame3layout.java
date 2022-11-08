package com.example.proyek1aryakarza;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

public class Frame3layout extends AppCompatActivity {
   String kepada, subyek, pesan;
   EditText ekepada, esubyek, epesan;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_frame3layout);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame3layout);

        kepada = getIntent().getExtras().getString("kepada");
        subyek = getIntent().getExtras().getString("subyek");
        pesan = getIntent().getExtras().getString("pesan");

        ekepada = findViewById(R.id.kepadaa);
        epesan = findViewById(R.id.pesann);
        esubyek = findViewById(R.id.subyekk);

        ekepada.setText(kepada);
        esubyek.setText(subyek);
        epesan.setText(pesan);
    }
}