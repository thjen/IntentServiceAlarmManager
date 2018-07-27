package qthjen_dev.io.intentservicealarmmanager;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyTestService extends IntentService {

    public MyTestService() {
        super("AlarmManager");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("data", "Service running");
    }
}
