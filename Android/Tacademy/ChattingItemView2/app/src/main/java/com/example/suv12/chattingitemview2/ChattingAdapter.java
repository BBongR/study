package com.example.suv12.chattingitemview2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by suv12 on 2018-01-07.
 */

public class ChattingAdapter extends BaseAdapter {

    ArrayList<ChattingData> items = new ArrayList<>();

    private static final int VIEW_TYPE_COUNT = 3;
    private static final int VIEW_INDEX_SEND = 0;
    private static final int VIEW_INDEX_RECEIVE = 1;
    private static final int VIEW_INDEX_DATE = 2;

    public void add(ChattingData data) {
        items.add(data);
        notifyDataSetChanged();
    }

    public int getViewTypeCount() {
        return VIEW_TYPE_COUNT;
    }

    public int getItemViewType(int position) {
        ChattingData data = items.get(position);
        if (data instanceof SendData) {
            return VIEW_INDEX_SEND;
        } else if (data instanceof ReceiveData) {
            return VIEW_INDEX_RECEIVE;
        } else {
            return VIEW_INDEX_DATE;
        }
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
        switch (getItemViewType(position)) {

            case VIEW_INDEX_SEND: {
                SendView view;
                if (convertView == null || !(convertView instanceof SendView)) {
                    view = new SendView(parent.getContext());
                } else {
                    view = (SendView) convertView;
                }
                view.setData((SendData) items.get(position));
                return view;
            }

            case VIEW_INDEX_RECEIVE: {
                ReceiveView view;
                if (convertView == null || !(convertView instanceof ReceiveView)) {
                    view = new ReceiveView(parent.getContext());
                } else {
                    view = (ReceiveView) convertView;
                }
                view.setData((ReceiveData) items.get(position));
                return view;
            }

            case VIEW_INDEX_DATE:
            default: {
                DateView view;
                if (convertView == null || !(convertView instanceof DateView)) {
                    view = new DateView(parent.getContext());
                } else {
                    view = (DateView) convertView;
                }
                view.setData((DateData) items.get(position));
                return view;

            }
        }
    }
}
