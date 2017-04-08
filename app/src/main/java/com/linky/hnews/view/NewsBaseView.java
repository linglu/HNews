package com.linky.hnews.view;

import com.linky.hnews.bean.Item;

import java.util.List;

/**
 * Created by linky on 17-4-8.
 */
public interface NewsBaseView extends BaseView {

    void onItemsLoaded(List<Item> itemList);
}
