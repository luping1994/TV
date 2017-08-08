package net.suntrans.tv;

import android.app.Application;

import com.tencent.bugly.Bugly;

/**
 * Created by Looney on 2017/7/21.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bugly.init(getApplicationContext(), "d94fa24a17", false);
    }
}
