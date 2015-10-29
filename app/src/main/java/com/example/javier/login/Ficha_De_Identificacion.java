package com.example.javier.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Javier on 01/10/2015.
 */
public class Ficha_De_Identificacion extends Activity {

    private RadioGroup sex;

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
        salapiso.setAdapter(adaptador);

        sex = (RadioGroup) findViewById(R.id.rgsex);
        sex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if(checkedId == R.id.rbmas) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if(checkedId == R.id.rbfem) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });


    }
}
