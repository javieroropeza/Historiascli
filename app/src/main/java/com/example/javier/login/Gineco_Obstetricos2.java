package com.example.javier.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Javier on 25/10/2015.
 */
public class Gineco_Obstetricos2 extends Activity {

    private Spinner vise;
    String[] vida =
            {" Activa"," Pasiva"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gineco_obstetricos2);

        vise = (Spinner)findViewById(R.id.svise);
        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, vida);
        vise.setAdapter(adaptador);

        RadioGroup par = (RadioGroup) findViewById(R.id.rgPar);
        par.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsipar) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnopar) {

                   /* Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup abo = (RadioGroup) findViewById(R.id.rgAbo);
        abo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if(checkedId == R.id.rbsiabo) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if(checkedId == R.id.rbnoabo) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        }

    }
