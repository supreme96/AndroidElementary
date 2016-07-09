package com.example.pc_57.airplanemodemk1_2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by PC-57 on 24-06-2016.
 */
public class Receiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Airplane Mode Enabled", Toast.LENGTH_SHORT).show();
    }
}
