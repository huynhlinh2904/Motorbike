package com.example.motorbike;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class DemoBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast. makeText(context, "Airplane mode changed", Toast.LENGTH_SHORT);
    }
}
