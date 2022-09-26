package com.amtics.practical11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = findViewById(R.id.img);
        IntentFilter itf = new IntentFilter(Intent.ACTION_POWER_CONNECTED);
        IntentFilter itf2 = new IntentFilter(Intent.ACTION_POWER_DISCONNECTED);

        BatteryCheck btc = new BatteryCheck(imgView);

        registerReceiver(btc, itf);
        registerReceiver(btc, itf2);
    }
}