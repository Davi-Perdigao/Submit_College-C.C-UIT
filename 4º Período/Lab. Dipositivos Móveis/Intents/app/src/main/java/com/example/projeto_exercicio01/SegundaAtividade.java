package com.example.projeto_exercicio01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundaAtividade extends Activity{
    @Override
    public void onCreate(Bundle save){
        super.onCreate(save);
        setContentView(R.layout.segunda_atividade);
    }

    public void chamarPrimeiraAtividade(View view){
        Intent Intent1 = new Intent(this, PrimeiraAtividade.class);
        startActivity(Intent1);
    }

    public void chamarTerceiraAtividade(View view){
        Intent Intent2 = new Intent(this, TerceiraAtividade.class);
        startActivity(Intent2);
    }
}
