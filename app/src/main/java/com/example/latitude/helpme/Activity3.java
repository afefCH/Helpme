package com.example.latitude.helpme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import static com.example.latitude.helpme.R.*;
/**
 * Created by Mariem on 4/25/2017.
 */

public class Activity3 extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    String[] title;
    String[] txt;
    int[] Img_res = {drawable.temp , R.drawable.bandaid , drawable.burn};

    ArrayList<adviceModle> arrayList =new ArrayList<adviceModle>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity3);
        recyclerView= (RecyclerView) findViewById(id.recycler_view);

        title= getResources().getStringArray(array.advice_names);
        txt= getResources().getStringArray(array.advice_txt);
        int i=0;
        for(String name : title)
        {
            adviceModle adviceModle=new adviceModle(Img_res[i],title[i],txt[i]);
            arrayList.add(adviceModle);
            i++;
        }

        adapter=new RecyclerAdapter(arrayList,this);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
