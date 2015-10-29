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

    private RadioButton r1,r2;
  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heredo_familiares);

        Button hf2 = (Button) findViewById(R.id.bntpag2hefa);
        hf2.setOnClickListener(heredofamiliares2);

        r1=(RadioButton)findViewById(R.id.rbsitub);
        r2=(RadioButton)findViewById(R.id.rbnotub);


           /*     r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected

                if (checkedId == R.id.rbsitub) {
                    r2.setChecked(false);
               }
            }
        });
*/

       /* findViewById(R.id.rbsiTuber).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                findViewById(R.id.rbnotuber);
            }
        });

        if (r1.isChecked()==true) {

            r2.setSelected(false);
        } else if (r2.isChecked()==true) {
            r1.setSelected(false);
        }*/

    }

}
