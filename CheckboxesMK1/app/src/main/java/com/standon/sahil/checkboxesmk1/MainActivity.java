package com.standon.sahil.checkboxesmk1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckBox googleCheck, msCheck, yahooCheck, appleCheck;
        googleCheck = (CheckBox) findViewById(R.id.googleCheck);
        msCheck = (CheckBox) findViewById(R.id.msCheck);
        yahooCheck = (CheckBox) findViewById(R.id.yahooCheck);
        appleCheck = (CheckBox) findViewById(R.id.appleCheck);
        Button confirm = (Button) findViewById(R.id.confirmButton);
        final TextView resultTV = (TextView) findViewById(R.id.resultText);



        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final StringBuffer result = new StringBuffer();
                if(googleCheck.isChecked() == true){
                    result.append(" Google");
                }
                if(msCheck.isChecked() == true){
                    result.append(" Microsoft");
                }
                if(yahooCheck.isChecked() == true){
                    result.append(" YAHOO!");
                }
                if(appleCheck.isChecked()  == true){
                    result.append(" Apple");
                }
                resultTV.setText(result);
            }
        });

    }
}
