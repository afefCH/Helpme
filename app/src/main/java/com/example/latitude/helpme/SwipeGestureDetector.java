package com.example.latitude.helpme;

/**
 * Created by LATITUDE on 29/03/2017.
 */
/*import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class SwipeGestureDetector extends MainActivity implements GestureDetector{
    private final static int DELTA_MIN = 50;

    public SwipeGestureDetector(final MainActivity context) {
        super(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                Log.i("Debug", e1 + "," + e2);

                float deltaX = e2.getX() - e1.getX();
                float deltaY = e2.getY() - e1.getY();
                if (Math.abs(deltaX) > Math.abs(deltaY)) {
                    if (Math.abs(deltaX) >= DELTA_MIN) {
                        context.onSwipe(SwipeDirection.RIGHT_TO_LEFT);
                        return true;
                    } else {
                        context.onSwipe(SwipeDirection.LEFT_TO_RIGHT);
                        return true;
                    }
                } else {
                    if (Math.abs(deltaY) >= DELTA_MIN) {
                        if (deltaY < 0) {
                            context.onSwipe(SwipeDirection.BOTTOM_TO_TOP);
                            return true;
                        } else {
                            context.onSwipe(SwipeDirection.TOP_TO_BOTTOM);
                            return true;
                        }
                    }
                }
                return false;
            }
        });
    }

    public static enum SwipeDirection {
        LEFT_TO_RIGHT, RIGHT_TO_LEFT, TOP_TO_BOTTOM, BOTTOM_TO_TOP;
    }
}*/
