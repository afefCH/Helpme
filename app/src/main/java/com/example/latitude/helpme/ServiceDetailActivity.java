package com.example.latitude.helpme;

/**
 * Created by LATITUDE on 29/05/2017.
 */
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.example.latitude.helpme.models.Service;

import java.util.ArrayList;
import java.util.List;

public class ServiceDetailActivity extends BaseActivity implements View.OnClickListener {

    private static final String TAG = "ServiceDetailActivity";

    public static final String EXTRA_POST_KEY = "service_key";

    private DatabaseReference mServiceReference;
    //private DatabaseReference mCommentsReference;
    private ValueEventListener mServiceListener;
    private String mServiceKey;


    private TextView mTitleView;
    //private TextView mBodyView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_detail);

        // Get post key from intent
        mServiceKey = getIntent().getStringExtra(EXTRA_POST_KEY);
        if (mServiceKey == null) {
            throw new IllegalArgumentException("Must pass EXTRA_POST_KEY");
        }

        // Initialize Database
        mServiceReference = FirebaseDatabase.getInstance().getReference()
                .child("services").child(mServiceKey);
       // mCommentsReference = FirebaseDatabase.getInstance().getReference()
                //.child("post-comments").child(mPostKey);

        // Initialize Views

        mTitleView = (TextView) findViewById(R.id.service_title);
        //mBodyView = (TextView) findViewById(R.id.post_body);

    }

    @Override
    public void onStart() {
        super.onStart();

        // Add value event listener to the post
        // [START post_value_event_listener]
        ValueEventListener serviceListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Get Post object and use the values to update the UI
                Service service = dataSnapshot.getValue(Service.class);
                // [START_EXCLUDE]

                mTitleView.setText(service.title);
                //mBodyView.setText(post.body);
                // [END_EXCLUDE]
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Getting Post failed, log a message
                Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
                // [START_EXCLUDE]
                Toast.makeText(ServiceDetailActivity.this, "Failed to load post.",
                        Toast.LENGTH_SHORT).show();
                // [END_EXCLUDE]
            }
        };
        mServiceReference.addValueEventListener(serviceListener);
        // [END post_value_event_listener]

        // Keep copy of service listener so we can remove it when app stops
        mServiceListener = serviceListener;
    }

    @Override
    public void onStop() {
        super.onStop();

        // Remove post value event listener
        if (mServiceListener != null) {
            mServiceReference.removeEventListener(mServiceListener);
        }

        // Clean up comments listener
        //mAdapter.cleanupListener();
    }

    @Override
    public void onClick(View v) {

    }

    /*@Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.button_post_comment) {
            postComment();
        }
    }

    private void postComment() {
        final String uid = getUid();
        FirebaseDatabase.getInstance().getReference().child("users").child(uid)
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Get user information
                        User user = dataSnapshot.getValue(User.class);
                        String authorName = user.username;

                        // Create new comment object
                        String commentText = mCommentField.getText().toString();
                        Comment comment = new Comment(uid, authorName, commentText);

                        // Push the comment, it will appear in the list
                        mCommentsReference.push().setValue(comment);

                        // Clear the field
                        mCommentField.setText(null);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
    }*/




}
