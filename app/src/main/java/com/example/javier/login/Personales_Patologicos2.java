package com.example.javier.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;

/**
 * Created by Javier on 25/10/2015.
 */
public class Personales_Patologicos2 extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personales_patologicos2);

        RadioGroup pa = (RadioGroup) findViewById(R.id.rgPa);
        pa.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsipal) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnopal) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup par = (RadioGroup) findViewById(R.id.rgPar);
        par.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsipar) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnopar) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup pad = (RadioGroup) findViewById(R.id.rgPad);
        pad.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsipad) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnopad) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup intq = (RadioGroup) findViewById(R.id.rgInt);
        intq.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsiintqui) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnointqui) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup fra = (RadioGroup) findViewById(R.id.rgFra);
        fra.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsifra) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnofra) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup per = (RadioGroup) findViewById(R.id.rgPer);
        per.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsiper) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnoper) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup intme = (RadioGroup) findViewById(R.id.rgIntme);
        intme.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsiinme) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnoinme) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup des = (RadioGroup) findViewById(R.id.rgDes);
        des.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsides) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnodes) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });
    }
}
