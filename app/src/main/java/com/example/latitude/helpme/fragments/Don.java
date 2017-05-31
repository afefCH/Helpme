package com.example.latitude.helpme.fragments;

import com.example.latitude.helpme.models.Service;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

/**
 * Created by LATITUDE on 29/05/2017.
 */

public class Don extends Services{

    public Don() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        return databaseReference.child("service");
        //.child(getURL());
    }
}
