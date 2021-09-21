package com.example.projeto_exercicio01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TerceiraAtividade extends Activity {
    @Override
    public void onCreate(Bundle save){
        super.onCreate(save);
        setContentView(R.layout.terceira_atividade);
    }

    public void chamarPrimeiraAtividade(View view){
        Intent Intent = new Intent(this, PrimeiraAtividade.class);
        startActivity(Intent);
    }

    public void chamarSegundaAtividade(View view){
        Intent Intent1 = new Intent(this, SegundaAtividade.class);
        startActivity(Intent1);
    }
}
