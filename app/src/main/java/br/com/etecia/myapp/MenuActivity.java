package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MenuActivity extends AppCompatActivity {

    MaterialCardView idMenuPets, idMenuAlimentos,
            idMenuDoacao, idMenuServicos,
            idMenuLocalizar, idMenuShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        idMenuPets = findViewById(R.id.IdMenuPets);
        idMenuAlimentos = findViewById(R.id.IdMenuAlimentos);
        idMenuDoacao = findViewById(R.id.IdMenuDoacao);
        idMenuServicos = findViewById(R.id.IdMenuServicos);
        idMenuLocalizar = findViewById(R.id.IdMenuLocalizar);
        idMenuShop = findViewById(R.id.IdMenuShop);


    }
}