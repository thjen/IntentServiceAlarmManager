package qthjen_dev.io.intentservicealarmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyAlarmReceiver extends BroadcastReceiver {

    public static final int REQUEST_CODE = 13;
    public static final String ACTION = "qthjen.AlarmManager";

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, MyTestService.class);
        i.putExtra("foo", "qthjen");
        context.startService(i);
    }
}
