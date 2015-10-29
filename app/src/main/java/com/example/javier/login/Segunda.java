package com.example.javier.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


/**
 * Created by Javier on 24/09/2015.
 *
 */


public class Segunda extends Activity {

  private View.OnClickListener FichaIdentificacion = new View.OnClickListener() {
        @Override
                                                        public void onClick(View v) {

        Intent ficha = new Intent(Segunda.this, Ficha_De_Identificacion.class);
        startActivity(ficha);
    }
};

  /*    private View.OnClickListener HeredoFamiliares = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent heredo = new Intent(Segunda.this, Heredo_Familiares.class);
            startActivity(heredo);

        }
    };

    private View.OnClickListener PersonalesPatologicos = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent patologicos = new Intent(Segunda.this, Personales_Patologicos.class);
            startActivity(patologicos);
        }
    };

    private View.OnClickListener PersonalesNoPatologicos = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent nopatologicos = new Intent(Segunda.this, Personales_No_Patologicos.class);
            startActivity(nopatologicos);
        }
    };*/

    private ListView lista;
    String[] antecedentes =
            {"A) Heredo-Familiares","B) Personales-Patologicos","C) Personales-No-Patologicos","D) Gineco-Obstétricos"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundolayout);


        Button ficha = (Button) findViewById(R.id.fichaIden);
        ficha.setOnClickListener(FichaIdentificacion);
      /*  Button heredo = (Button)findViewById(R.id.heredo);
        heredo.setOnClickListener(HeredoFamiliares);
        Button patologicos = (Button)findViewById(R.id.patologicos);
        patologicos.setOnClickListener(PersonalesPatologicos);
        Button nopatologicos = (Button)findViewById(R.id.nopatologicos);
        nopatologicos.setOnClickListener(PersonalesNoPatologicos);*/

        lista = (ListView)findViewById(R.id.lista);
        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, antecedentes);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
                //Toast.makeText(getApplicationContext(), "posicion " + (i + 1) + personas[i], Toast.LENGTH_SHORT).show();
                switch (posicion) {
                    case 0 :
                        Intent heredo = new Intent(getApplicationContext(), Heredo_Familiares.class);
                        startActivity(heredo);
                        break;
                    case 1 :
                        Intent perpat = new Intent(getApplicationContext(), Personales_Patologicos.class);
                        startActivity(perpat);
                        break;
                    case 2 :
                        Intent pernopat = new Intent(getApplicationContext(), Personales_No_Patologicos.class);
                        startActivity(pernopat);
                        break;
                    case 3 :
                        Intent gineco = new Intent(getApplicationContext(), Gineco_Obstetricos.class);
                        startActivity(gineco);
                        break;
                   /* default:
                        Toast.makeText(getApplicationContext(), "no soy ramiro ni pablo", Toast.LENGTH_SHORT).show();*/
                }
            }
        });


    }
}
