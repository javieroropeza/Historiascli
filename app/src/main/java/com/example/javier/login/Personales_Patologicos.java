package com.example.javier.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Javier on 30/09/2015.
 */
public class Personales_Patologicos extends Activity {

    private View.OnClickListener personalespatologicos2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent perpat2 = new Intent(Personales_Patologicos.this, HeredoFamiliares2.class);
            startActivity(perpat2);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personales_patologicos);

        Button perpat2 = (Button) findViewById(R.id.btnpag2perpat);
        perpat2.setOnClickListener(personalespatologicos2);
    }
}
