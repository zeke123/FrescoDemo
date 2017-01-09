package com.zhoujian.fresco;

import android.app.Application;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by zhoujian on 2017/1/7.
 */

public class AppApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        Fresco.initialize(this);
    }
}
