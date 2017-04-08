package com.linky.hnews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.linky.hnews.bean.Item;
import com.linky.hnews.presentation.NewsPresenter;
import com.linky.hnews.view.BaseView;
import com.linky.hnews.view.NewsBaseView;

import java.util.List;

import javax.inject.Inject;

public class NewsActivity extends AppCompatActivity implements NewsBaseView {

    private RecyclerView mRv;
    private ProgressBar mPbLoading;

    @Inject
    NewsPresenter mNewsPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPbLoading = (ProgressBar) findViewById(R.id.pb_loading);
        mRv = (RecyclerView) findViewById(R.id.rv_news_list);

        // 加载框显示
        mPbLoading.setVisibility(View.VISIBLE);
        mRv.setVisibility(View.INVISIBLE);

        // 获取数据
        mNewsPresenter.setBaseView(this);
        mNewsPresenter.getItems();
    }

    @Override
    public void onItemsLoaded(final List<Item> itemList) {

        // 显示数据
        mPbLoading.setVisibility(View.GONE);
        mRv.setVisibility(View.VISIBLE);

        mRv.setAdapter(new RecyclerView.Adapter<VH>() {
            @Override
            public VH onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, true);
                return new VH(view);
            }

            @Override
            public void onBindViewHolder(VH holder, int position) {
                Item item = itemList.get(position);
                holder.mTv.setText(item.title);
            }

            @Override
            public int getItemCount() {
                return itemList.size();
            }
        });
    }

    class VH extends RecyclerView.ViewHolder {

        protected TextView mTv;

        public VH(View itemView) {
            super(itemView);
            mTv = (TextView) itemView.findViewById(R.id.tv_news_item);
        }
    }
}
