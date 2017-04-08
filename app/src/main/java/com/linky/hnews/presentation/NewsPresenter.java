package com.linky.hnews.presentation;

import com.linky.hnews.bean.Item;
import com.linky.hnews.view.BaseView;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by linky on 17-4-8.
 */
public class NewsPresenter implements Presenter {

    private BaseView mBaseView;

    @Inject
    NewsPresenter() {}

    @Override
    public void setBaseView(BaseView bv) {
        this.mBaseView = bv;
    }

    public List<Item> getItems() {
        return null;
    }

}
