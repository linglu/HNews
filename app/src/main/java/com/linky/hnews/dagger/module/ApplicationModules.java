package com.linky.hnews.dagger.module;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by linky on 17-4-8.
 */
@Module
public class ApplicationModules {

    private Application mApp;

    public ApplicationModules(Application app) {
        this.mApp = app;
    }

    @Provides
    public Context provideContext() {
        return mApp;
    }
}
