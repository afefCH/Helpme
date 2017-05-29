package com.example.latitude.helpme;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // private SwipeGestureDetector gestureDetector;
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent suivant = new Intent(MainActivity.this, Activity1.class);
                startActivity(suivant);
                finish();
            }
        }, SPLASH_TIME_OUT);
        //instaciation swipe
        //gestureDetector = new SwipeGestureDetector(this);

    }

    /*public boolean dispatchTouchEvent(MotionEvent event)
    {
        return gestureDetector.onTouchEvent(event);
    }

    public void onSwipe(SwipeGestureDetector.SwipeDirection direction)
    {
        String message ="";
        switch(direction)
        {
            case LEFT_TO_RIGHT:
                message = "lest to right swipe";
                break;
            case RIGHT_TO_LEFT:
                message = "right to left swipe";
                break;
            case TOP_TO_BOTTOM:
                message = "top to bottom swipe";
                break;
            case BOTTOM_TO_TOP:
                message = "bottom to top swipe";
                break;
        }
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }*/

}