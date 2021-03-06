package com.example.suv12.itemview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suv12 on 2018-01-06.
 */

public class MyAdapter extends BaseAdapter implements ItemView.OnLikeClickListener {

    ArrayList<ItemData> items = new ArrayList<>();
    Context mContext;

    public MyAdapter(Context context) {
        this.mContext = context;
    }

    public void add(ItemData item) {
        items.add(item);
        notifyDataSetChanged();
    }

    public void addAll(List<ItemData> items) {
        this.items.addAll(items);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemView v;

        if (convertView == null) {
            v = new ItemView(mContext);
            v.setOnLikeClickListener(this);
        } else {
            v = (ItemView) convertView;
        }
        v.setItemData(items.get(position));
        return v;
    }

    public interface OnAdapterLikeListener {
        public void onAdapterLike(MyAdapter adapter, View view, ItemData data);
    }

    OnAdapterLikeListener mListener;

    public void setOnAdapterLikeListener(OnAdapterLikeListener listener) {
        mListener = listener;
    }

    @Override
    public void onLikeClick(View view, ItemData data) {
        if (mListener != null) {
            mListener.onAdapterLike(this, view, data);
        }
    }
}
