package com.example.javier.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Javier on 16/10/2015.
 */
public class Gineco_Obstetricos extends Activity{
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

        Button hf2 = (Button) findViewById(R.id.btnpag2gin);
        hf2.setOnClickListener(ginecoobsterticos2);

    }
}
