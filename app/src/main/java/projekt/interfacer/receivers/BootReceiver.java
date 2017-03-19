package projekt.interfacer.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import projekt.interfacer.activities.InterfacerActivity;


public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent pushIntent = new Intent(context, InterfacerActivity.class);
        context.startService(pushIntent);
    }
}
