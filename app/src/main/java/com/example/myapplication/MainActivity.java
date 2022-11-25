package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {


    //referencias
    Button buscar;
    EditText etTitulo,etDescripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //validar campos vacios
        etTitulo=(EditText) findViewById(R.id.etTitulo);
        etDescripcion=(EditText) findViewById(R.id.etDescripcion);


        //boton buscar pasa a la siguiente pagina
        buscar = (Button) findViewById(R.id.btnBuscar);

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this,SegundaPantallaBuscar.class);
                startActivity(b);

            }
        });

    }



}