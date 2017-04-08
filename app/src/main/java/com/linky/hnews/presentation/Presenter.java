package com.linky.hnews.presentation;

import com.linky.hnews.view.BaseView;

/**
 * Created by linky on 17-4-8.
 */
public interface Presenter<T extends BaseView> {

    void setBaseView(T bv);
}
