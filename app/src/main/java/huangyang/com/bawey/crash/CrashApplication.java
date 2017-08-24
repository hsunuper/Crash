package huangyang.com.bawey.crash;

import android.app.Application;

/**
 * 创建人:hy
 * 日期:  2017/8/21
 */

public class CrashApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}
