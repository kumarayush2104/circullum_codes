package com.example.practical15;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class Service extends android.app.Service {

    android.media.MediaPlayer mediaPlayer;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaPlayer = MediaPlayer.create(this, R.raw.over_the_horizon);
        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
    }

    @Override
    public IBinder onBind(Intent intent) {return null;}
}
