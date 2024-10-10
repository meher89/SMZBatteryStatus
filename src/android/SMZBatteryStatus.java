package com.smz.batterystatus;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.widget.Toast;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import android.content.Context;
import java.util.concurrent.TimeUnit;

/**
 * This class echoes a string called from JavaScript.
 */
public class SMZBatteryStatus extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("startBackground")) {
            String message = args.getString(0);
            this.startBackground(message, callbackContext);
            return true;
        }
        return false;
    }

    private void startBackground(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            if (message != null && message.length() > 0) {
                Toast.makeText(webView.getContext(), message, Toast.LENGTH_LONG).show();
                callbackContext.success(message);
            } else {
                callbackContext.error("Expected one non-empty string argument.");
            }
        }
            /* 
            PeriodicWorkRequest periodicWorkRequest = new PeriodicWorkRequest.Builder(SMZBatteryStatusWorker.class, 30 , TimeUnit.SECONDS)
            .build();
        WorkManager.getInstance(cordova.getContext()).enqueue(periodicWorkRequest);
            callbackContext.success(message);

        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
            */
    }
}
