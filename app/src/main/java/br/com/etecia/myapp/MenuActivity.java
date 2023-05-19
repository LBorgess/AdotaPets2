package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

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

        idMenuPets.setOnClickListener(this);
        idMenuAlimentos.setOnClickListener(this);
        idMenuDoacao.setOnClickListener(this);
        idMenuServicos.setOnClickListener(this);
        idMenuLocalizar.setOnClickListener(this);
        idMenuShop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.IdMenuPets:
                startActivity(new Intent(getApplicationContext(), PetsActivity.class));
                break;
            case R.id.IdMenuAlimentos:
                startActivity(new Intent(getApplicationContext(), AlimentosActivity.class));
                break;
            case R.id.IdMenuDoacao:
                startActivity(new Intent(getApplicationContext(), DoacaoActivity.class));
                break;
            case R.id.IdMenuServicos:
                startActivity(new Intent(getApplicationContext(), ServicosActivity.class));
                break;
            case R.id.IdMenuLocalizar:
                startActivity(new Intent(getApplicationContext(), LocalizarActivity.class));
                break;
            case R.id.IdMenuShop:
                startActivity(new Intent(getApplicationContext(), ShopActivity.class));
                break;
        }
    }
}