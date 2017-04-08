package com.linky.hnews.dagger.component;

import android.content.Context;

import com.linky.hnews.dagger.module.ApplicationModules;

import dagger.Component;

/**
 * Created by linky on 17-4-8.
 */
@Component(modules = ApplicationModules.class)
public interface ApplicationComponent {

    Context context();
}
