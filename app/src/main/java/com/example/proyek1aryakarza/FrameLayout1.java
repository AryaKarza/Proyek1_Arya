package com.example.proyek1aryakarza;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class FrameLayout1 extends AppCompatActivity {
    ImageView gambarLoading;
    Animation rotasiAnimasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout1);
        gambarLoading = findViewById(R.id.loadng);
        rotasi();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(FrameLayout1.this,Frame2layout.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }

    private void rotasi() {
        rotasiAnimasi = AnimationUtils.loadAnimation(this,R.anim.rotasi_searah);
        gambarLoading.startAnimation(rotasiAnimasi);
    }

}
