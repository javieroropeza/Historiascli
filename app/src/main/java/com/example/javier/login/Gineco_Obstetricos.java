package com.example.javier.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Javier on 16/10/2015.
 */
public class Gineco_Obstetricos extends Activity{



    private RadioGroup menar;
    private View.OnClickListener ginecoobsterticos2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent giob2 = new Intent(Gineco_Obstetricos.this, Gineco_Obstetricos2.class);
            startActivity(giob2);
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gineco_obstetricos);

        Button gin2 = (Button) findViewById(R.id.btnpag2gin);
        gin2.setOnClickListener(ginecoobsterticos2);

        menar = (RadioGroup) findViewById(R.id.rgMen);
        menar.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if (checkedId == R.id.rbsimen) {

                        /*Toast.makeText(getApplicationContext(), "Masculino",

                                Toast.LENGTH_SHORT).show();*/

                } else if (checkedId == R.id.rbnomen) {

                       /* Toast.makeText(getApplicationContext(), "Femenino",

                                Toast.LENGTH_SHORT).show();*/

                }
            }
        });
    }
}
