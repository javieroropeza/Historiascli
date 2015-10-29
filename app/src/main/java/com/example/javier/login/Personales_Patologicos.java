package com.example.javier.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

/**
 * Created by Javier on 30/09/2015.
 */
public class Personales_Patologicos extends Activity {

    private View.OnClickListener personalespatologicos2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent perpat2 = new Intent(Personales_Patologicos.this, Personales_Patologicos2.class);
            startActivity(perpat2);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personales_patologicos);

        Button perpat2 = (Button) findViewById(R.id.btnpag2perpat);
        perpat2.setOnClickListener(personalespatologicos2);

        RadioGroup tab = (RadioGroup) findViewById(R.id.rgTab);
        tab.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsitab) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnotab) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup alc = (RadioGroup) findViewById(R.id.rgAlc);
        alc.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsial) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnoal) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup tox = (RadioGroup) findViewById(R.id.rgTox);
        tox.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsito) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnoto) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup enin = (RadioGroup) findViewById(R.id.rgEnin);
        enin.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsienin) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnoenin) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup tube = (RadioGroup) findViewById(R.id.rgTube);
        tube.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsitube) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnotube) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup enfve = (RadioGroup) findViewById(R.id.rgEnfve);
        enfve.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsienve) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnoenve) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup fieti = (RadioGroup) findViewById(R.id.rgFieti);
        fieti.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsifiti) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnofiti) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup sal = (RadioGroup) findViewById(R.id.rgSal);
        sal.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsisa) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnosa) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup neu = (RadioGroup) findViewById(R.id.rgNeu);
        neu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsine) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnone) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

    }
}
