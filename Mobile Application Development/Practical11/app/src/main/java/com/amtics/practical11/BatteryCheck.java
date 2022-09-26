package com.amtics.practical11;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;

public class BatteryCheck extends BroadcastReceiver {
    ImageView imgView;
    public BatteryCheck(ImageView img) {
        this.imgView = img;
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        //Toast.makeText(context, intent.getAction(), Toast.LENGTH_SHORT).show();
        if(intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED")) {
            this.imgView.setBackgroundResource(R.drawable.ic_baseline_battery_charging_full_24);
        } else if(intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
            this.imgView.setBackgroundResource(R.drawable.ic_baseline_battery_full_24);
        }
    }
}
