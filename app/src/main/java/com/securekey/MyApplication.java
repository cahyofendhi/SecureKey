package com.securekey;

import android.app.Application;

import com.u.securekeys.SecureEnvironment;

public class MyApplication extends Application {

    public void onCreate() {
        super.onCreate();
        SecureEnvironment.initialize(this);
    }

}