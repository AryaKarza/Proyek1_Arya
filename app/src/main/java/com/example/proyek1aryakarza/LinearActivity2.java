package com.example.proyek1aryakarza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LinearActivity2 extends AppCompatActivity {
    String user, subyek, pesan, kepada;
    EditText eKepada, esubyek, epesan;
    Button bkirim;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear2);
        user = getIntent().getExtras().getString("user");
        //eKepada = findViewById(R.id.kepada);
        eKepada = findViewById(R.id.kepada);
        esubyek = findViewById(R.id.pesan);
        epesan =  findViewById(R.id.subyek);
        bkirim = findViewById(R.id.kirim);
        eKepada.setText(user);

        bkirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {kirim();}
        });
    }
    public void kirim(){
        kepada = eKepada.getText().toString();
        subyek = esubyek.getText().toString();
        pesan = epesan.getText().toString();
        Intent intent = new Intent(LinearActivity2.this,Frame3layout.class);
        intent.putExtra("kepada",kepada);
        intent.putExtra("subyek",subyek);
        intent.putExtra("pesan",pesan);
        startActivity(intent);
    }
}