package com.smz.batterystatus;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class SMZBatteryStatusWorker extends Worker {
    public SMZBatteryStatusWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        // Your background task here
        Log.d("SMZBatteryStatusWorker", "WorkManager task is running");
        return Result.success();
    }
}
