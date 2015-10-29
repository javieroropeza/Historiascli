package com.example.javier.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

/**
 * Created by Javier on 01/10/2015.
 */
public class Ficha_De_Identificacion extends Activity {

    private Spinner estado;
    String[] civil =
            {" Soltero(a)"," Casado(a)","Viudo(a)"};
    private Spinner salapiso;
    String[] salpi =
            {" Sala"," Piso"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ficha_de_identificacion);

        estado = (Spinner)findViewById(R.id.sestcivil);
        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, civil);
        estado.setAdapter(adaptador);

        salapiso = (Spinner)findViewById(R.id.spisoosala);
        ArrayAdapter sapi = new ArrayAdapter(this, android.R.layout.simple_list_item_1, salpi);
        estado.setAdapter(adaptador);
    }
}
