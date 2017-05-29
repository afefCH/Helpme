package com.example.latitude.helpme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by LATITUDE on 30/03/2017.
 */

public class Activity1 extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        final Button loginButton = (Button) findViewById(R.id.inscription);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this, page_Inscr1.class);
                startActivity(intent);
            }
        });

    }

    public void goToThePageLogin7(View view) {
        Intent intent = new Intent(this, page7_connexion.class);
        startActivity(intent);
    }

}
