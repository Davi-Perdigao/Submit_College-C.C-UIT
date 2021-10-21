package com.example.projeto_exercicio01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class PrimeiraAtividade extends Activity {
    @Override
    public void onCreate(Bundle save){
        super.onCreate(save);
        setContentView(R.layout.primeira_atividade);
    }

    public void chamarSegundaAtividade(View view){
        Intent Intent1 = new Intent(this, SegundaAtividade.class);
        startActivity(Intent1);
    }

    public void chamarTerceiraAtividade(View view){
        Intent Intent2 = new Intent(this, TerceiraAtividade.class);
        startActivity(Intent2);
    }
}


