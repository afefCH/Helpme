package com.example.latitude.helpme.fragments;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

/**
 * Created by LATITUDE on 29/05/2017.
 */

public class Conseil extends Services {

    public Conseil() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        return databaseReference.child("service");
                //.child(getURL());
    }
}