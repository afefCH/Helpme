package com.example.latitude.helpme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactServiceUrgence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_service_urgence);

        Button bouton = (Button) findViewById(R.id.contact);
        bouton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(ContactServiceUrgence.this, UrgenceActivity.class);
                startActivity(i);
            }
        });

    }
}
