package com.example.latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView tvSesi;
    private Button btnLogout;
    KendaliLogin kl = new KendaliLogin();
    public static String keySPusername = "GtPJAx45lMjkuICbExYElQ==_username";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (kl.isLogin(MainActivity.this, keySPusername)==true){
            setContentView(R.layout.activity_main);
        }
        else {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        }
        tvSesi = findViewById(R.id.tv_sesi);
        btnLogout = findViewById(R.id.btn_logout);
    }
}