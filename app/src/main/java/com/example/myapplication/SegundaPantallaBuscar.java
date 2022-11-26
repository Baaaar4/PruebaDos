package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SegundaPantallaBuscar extends AppCompatActivity {
    /*private ListView listView = (ListView) findViewById(R.id.simpleListView);*/
    ArrayList <Tareas> t = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla_buscar);

        MainActivity obj = new MainActivity();System.out.println(obj.tareas);
        t = obj.tareas;
        System.out.println(t);

        /*ArrayAdapter<Tareas> arrayAdapter = new ArrayAdapter<Tareas>(this, R.layout.activity_segunda_pantalla_buscar, R.id.simpleListView, t);

        listView.setAdapter(arrayAdapter);*/


    }

}