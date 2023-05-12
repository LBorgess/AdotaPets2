package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        // Criando o carregamento da janela de login

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Abrindo próxima janela
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                finish(); // Fecha janela
            }
        }, 3000);

    }
}