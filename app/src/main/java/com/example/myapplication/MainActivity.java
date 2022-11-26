package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    //referencias
    Button buscar, ingresar;
    EditText etTitulo,etDescripcion;

    static ArrayList<Tareas> tareas = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //validar campos vacios
        etTitulo=(EditText) findViewById(R.id.etTitulo);
        etDescripcion=(EditText) findViewById(R.id.etDescripcion);


        //boton buscar pasa a la siguiente pagina
        buscar = (Button) findViewById(R.id.btnBuscar);
        ingresar = (Button) findViewById(R.id.btnIngresar);

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this,SegundaPantallaBuscar.class);

                startActivity(b);

            }
        });

        ingresar.setOnClickListener(new View.OnClickListener(){
            @Override


            public void onClick(View view) {
                Intent SegundaPantallaBuscar = new Intent(MainActivity.this,SegundaPantallaBuscar.class);
                String titulo = etTitulo.getText().toString();
                String descripcion = etDescripcion.getText().toString();
                Tareas tarea = new Tareas();
                tarea.SetInformation(titulo,descripcion);
                tareas.add(tarea);
                System.out.println(tareas);
            }

        });


    }



}