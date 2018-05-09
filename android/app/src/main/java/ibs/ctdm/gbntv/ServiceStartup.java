package ibs.ctdm.gbntv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/**
 * Created by Anirut Teerabut on 5/9/2018.
 */

public class ServiceStartup extends BroadcastReceiver {

    public void onReceive(final Context context, Intent intent) {
        Handler h = new Handler();
        h.post(new Runnable() {
            @Override
            public void run() {
                Intent dialogIntent = new Intent(context, MainActivity.class);
                dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(dialogIntent);
            }
        });
    }

    /*@Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED)) {
            Intent serviceIntent = new Intent(context, MainActivity.class);
            context.startService(serviceIntent);
        }
    }*/
}