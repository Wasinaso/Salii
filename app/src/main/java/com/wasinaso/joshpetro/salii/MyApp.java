package com.wasinaso.joshpetro.salii;

import android.app.Application;
import android.content.Context;

/**
 * Created by Josh Petro on 8/9/2016.
 */
public class MyApp extends Application {
    private static MyApp mAppInstance=null;
    public static Context appContext;
    public static MyApp getInstance() {
        return mAppInstance;
    }
    public static MyApp get() {
        return get(appContext);
    }
    public static MyApp get(Context context) {
        return (MyApp) context.getApplicationContext();
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mAppInstance=this;
        appContext=getApplicationContext();

    }
}
