package com.securekey;

import android.app.Application;

import com.u.securekeys.SecureEnvironment;
import com.u.securekeys.annotation.SecureKey;

@SecureKey(
  key = "key_hello",
  value = "Hello world!"
)
public class MyApplication extends Application {

    public void onCreate() {
        super.onCreate();
        SecureEnvironment.initialize(this);
    }

}
