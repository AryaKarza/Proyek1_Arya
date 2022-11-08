package com.example.proyek1aryakarza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Frame2layout extends AppCompatActivity {
    EditText eUserName;
    ImageButton bLogin;
    String user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame2layout);
        eUserName = findViewById(R.id.username);
        bLogin = findViewById(R.id.login);
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { bLogin(); }
        });
    }
    public void bLogin(){
        user = eUserName.getText().toString();
        Intent intent = new Intent(Frame2layout.this,LinearActivity2.class);
        intent.putExtra("user",user);
        Toast.makeText(this,"Selamat Datang"+user,Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}