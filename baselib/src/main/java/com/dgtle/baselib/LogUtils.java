package com.dgtle.baselib;

import android.util.Log;

public class LogUtils {
    public static void e(Object o) {
        if (o != null) {
            Log.e("dgtle-log", o.toString());
        }
    }
}
