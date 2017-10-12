package com.instabug.instabugwearsample;

import android.app.Application;

import com.instabug.instabugwear.InstabugWear;

/**
 * @author hossam.
 */

public class InstabugWearApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        InstabugWear.getInstance()
                .init(this);
    }
}
