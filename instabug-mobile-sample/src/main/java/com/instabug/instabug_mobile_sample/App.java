package com.instabug.instabug_mobile_sample;

import android.app.Application;

import com.instabug.library.Instabug;

/**
 * @author hossam.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new Instabug.Builder(this,"APP-TOKEN").build();
    }
}
