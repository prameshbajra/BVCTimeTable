package com.example.pramesh.bvctimetable;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Pramesh on 12/21/2016.
 */

public class Database extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
