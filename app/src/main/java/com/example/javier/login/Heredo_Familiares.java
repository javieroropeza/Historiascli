package com.example.javier.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by Javier on 30/09/2015.
 */
public class Heredo_Familiares extends Activity {
    private View.OnClickListener heredofamiliares2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent hf2 = new Intent(Heredo_Familiares.this, HeredoFamiliares2.class);
            startActivity(hf2);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heredo_familiares);

        Button hf2 = (Button) findViewById(R.id.bntpag2hefa);
        hf2.setOnClickListener(heredofamiliares2);

        RadioGroup tub = (RadioGroup) findViewById(R.id.rgTub);
        tub.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsitub) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnotub) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup dia = (RadioGroup) findViewById(R.id.rgDia);
        dia.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsidia) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnodia) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup hip = (RadioGroup) findViewById(R.id.rgHip);
        hip.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsihip) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnohip) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup neo = (RadioGroup) findViewById(R.id.rgNeo);
        neo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsineo) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnoneo) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });


        RadioGroup car = (RadioGroup) findViewById(R.id.rgCar);
        car.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsicar) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnocar) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup hep = (RadioGroup) findViewById(R.id.rgHep);
        hep.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsihep) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnohep) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup nef = (RadioGroup) findViewById(R.id.rgNef);
        nef.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsinef) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnonef) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup enfen = (RadioGroup) findViewById(R.id.rgEnfen);
        enfen.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsienfen) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnoenfen) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup enfme = (RadioGroup) findViewById(R.id.rgEnfme);
        enfme.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsienfme) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnoenfme) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

    }

}
