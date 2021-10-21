package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button abrirCamera = (Button) findViewById(R.id.activity_main_botao_confirmar);
        abrirCamera.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent tirarFoto = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(tirarFoto, REQUEST_IMAGE_CAPTURE);
            }
        });
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            ImageView foto = (ImageView) findViewById(R.id.activity_main_imageview);
            foto.setImageBitmap(imageBitmap);
        }
    }
}