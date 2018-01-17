package com.example.suv12.multitypelistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by suv12 on 2018-01-11.
 */

public class AdapterItem extends ArrayAdapter<ModelItem> {

    public static final int VIEW_TYPE_COUNT = 2;
    public static final int VIEW_TYPE_TEXT  = 0; // listview_item1.xml
    public static final int VIEW_TYPE_IMAGE = 1; // listview_item2.xml


    private Context         mContext;
    private List<ModelItem> mDatas;
    private LayoutInflater  inflater;

    public AdapterItem(@NonNull Context context, int resource, @NonNull List<ModelItem> objects) {
        super(context, resource, objects);

        this.mContext = context;
        this.mDatas   = objects;
        this.inflater = LayoutInflater.from( mContext );
    }

    @Override
    public int getItemViewType(int position) {
        return mDatas.get( position ).getType();
    }

    @Override
    public int getViewTypeCount() {
        return VIEW_TYPE_COUNT;
    }

    private class ViewHolder {
        // type1
        TextView title;
        TextView desc;

        //type2
        ImageView image;
        TextView  name;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView = convertView;

        int viewType = getItemViewType( position );

        ViewHolder holder;

        ModelItem item = mDatas.get( position );

        if( rowView == null ) {

            holder = new ViewHolder();

            switch ( viewType ) {

                case VIEW_TYPE_TEXT:
                    rowView = inflater.inflate( R.layout.listview_item1, parent, false );
                    holder.title = rowView.findViewById( R.id.title );
                    holder.desc  = rowView.findViewById( R.id.desc  );
                    break;

                case VIEW_TYPE_IMAGE:
                    rowView = inflater.inflate( R.layout.listview_item2, parent, false );
                    holder.image = rowView.findViewById( R.id.image );
                    holder.name  = rowView.findViewById( R.id.name  );
                    break;

            }
            rowView.setTag( holder );
        } else {
            holder = ( ViewHolder ) rowView.getTag();
        }

        switch ( viewType ) {
            case VIEW_TYPE_TEXT:
                holder.title.setText( item.getTitle() );
                holder.desc .setText( item.getDesc()  );
                break;
            case VIEW_TYPE_IMAGE:
                holder.image.setImageDrawable( item.getImage() );
                holder.name .setText         ( item.getName()  );
                break;
        }

        return rowView;
    }
}
