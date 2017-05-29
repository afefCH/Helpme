package com.example.latitude.helpme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page_Inscri4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page__inscri4);
        final Button loginButton = (Button) findViewById(R.id.btn_Envoyer);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_Inscri4.this, Activity3.class);
                startActivity(intent);
            }
        });
    }

    public  void goToTheEmprint(View view){
        Intent intent = new Intent(this, EmpreintActivity.class);
        startActivity(intent);

    }
    public  void goToTheSchema (View view){
        Intent intent =new Intent(this,SchemaActivity.class);
        startActivity(intent);


    }
}
