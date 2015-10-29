package com.example.javier.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioGroup;

/**
 * Created by Javier on 30/09/2015.
 */
public class Personales_No_Patologicos extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personales_no_patologicos);

        RadioGroup habpe = (RadioGroup) findViewById(R.id.rgHabpe);
        habpe.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsihabpe) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnohabpe) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup ali = (RadioGroup) findViewById(R.id.rgAli);
        ali.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsiali) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnoali) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup actfi = (RadioGroup) findViewById(R.id.rgActfi);
        actfi.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsiactfi) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnoactfi) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup esc = (RadioGroup) findViewById(R.id.rgEsc);
        esc.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsiesc) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnoesc) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup inm = (RadioGroup) findViewById(R.id.rgInm);
        inm.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsiinm) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnoinm) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

        RadioGroup hiper = (RadioGroup) findViewById(R.id.rgHiper);
        hiper.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsihiper) {

                   /* Toast.makeText(getApplicationContext(), "Masculino",

                            Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnohiper) {

                    /*Toast.makeText(getApplicationContext(), "Femenino",

                            Toast.LENGTH_SHORT).show();*/

                }
            }
        });

    }
}
