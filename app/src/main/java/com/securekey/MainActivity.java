package com.securekey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.u.securekeys.SecureEnvironment;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, SecureEnvironment.getString("key_hello"), Toast.LENGTH_LONG).show();
    }
}
