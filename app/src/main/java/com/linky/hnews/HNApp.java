package com.linky.hnews;

import android.app.Application;

import com.linky.hnews.dagger.component.ApplicationComponent;
import com.linky.hnews.dagger.component.DaggerApplicationComponent;
import com.linky.hnews.dagger.module.ApplicationModules;

/**
 * Created by linky on 17-4-8.
 */
public class HNApp extends Application {

    private ApplicationComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initInjector();
    }

    private void initInjector() {
        mAppComponent = DaggerApplicationComponent
                .builder()
                .applicationModules(new ApplicationModules(this))
                .build();
    }

    public ApplicationComponent getAppComponent() {
        return mAppComponent;
    }

}
