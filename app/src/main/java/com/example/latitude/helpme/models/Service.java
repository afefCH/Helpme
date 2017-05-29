package com.example.latitude.helpme.models;

import android.media.Image;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LATITUDE on 29/05/2017.
 */

@IgnoreExtraProperties
public class Service {

    public String id;
    public String title;
    public Image image;
    public URL url;



    public Map<String, Boolean> stars = new HashMap<>();

    public Service() {
        // Default constructor required for calls to DataSnapshot.getValue(Service.class)
    }

    public Service(String id,Image image, URL url) {
        this.id = id;
        this.image=image;
        this.url = url;
    }

    // [START service_to_map]
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("title", title);
        result.put("image",image);
        result.put("decouvrir", url);
        return result;
    }
    // [END service_to_map]

}
// [END service_class]