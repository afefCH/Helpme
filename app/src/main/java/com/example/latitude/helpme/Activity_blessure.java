package com.example.latitude.helpme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by Mariem on 5/29/2017.
 */


public class Activity_blessure extends AppCompatActivity {
    private WebView wv1;

    private ImageView img2;
    private TextView title2;
    private TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vid);
        ScrollView sv = (ScrollView) findViewById(R.id.ScrollView01);
        sv.scrollTo(0, 0);


        int img = getIntent().getExtras().getInt("image");
        String title = getIntent().getExtras().getString("title");
        String txt = getIntent().getExtras().getString("txt");

        img2=(ImageView)findViewById(R.id.image2);
        title2=(TextView)findViewById(R.id.title2);
        txt2=(TextView)findViewById(R.id.txt2);

        img2.setImageResource(img);
        title2.setText(title);
        txt2.setText(txt);


        wv1 = (WebView) findViewById(R.id.webview);
        wv1.getSettings().setJavaScriptEnabled(true);
        String myvideokey = "<iframe width=\"300\" height=\"300\" src=\"https://www.youtube.com/embed/oGvyiWfXB7c\" frameborder=\"0\" allowfullscreen></iframe>";
        wv1.loadData(myvideokey, "Text/html", "utf_8");
        wv1.setWebChromeClient(new WebChromeClient() {
        });


    }
}