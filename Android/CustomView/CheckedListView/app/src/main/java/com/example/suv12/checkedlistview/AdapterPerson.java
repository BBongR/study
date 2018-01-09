package com.example.suv12.checkedlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by suv12 on 2018-01-08.
 */

public class AdapterPerson extends ArrayAdapter<ModelPerson> {

    // 1. context 추가, lists 추가
    private Context context         = null;
    private List<ModelPerson> lists = null;

    public AdapterPerson(@NonNull Context context, int resource, @NonNull List<ModelPerson> objects) {
        super(context, resource, objects);

        // 2.
        this.context = context;
        this.lists   = objects;
    }

    // 4. getView Override 해서 사용
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // 4.
        ViewHolder holder;

        // 5.
        View rowView = convertView;

        if (rowView == null) {

            rowView = LayoutInflater.from( this.context ).inflate( R.layout.view_person, null, false );

            holder = new ViewHolder();

            holder.image_photo = rowView.findViewById( R.id.image_photo );
            holder.text_name   = rowView.findViewById( R.id.text_name   );
            holder.text_age    = rowView.findViewById( R.id.text_age    );
            holder.image_check = rowView.findViewById( R.id.image_check );

            rowView.setTag(holder);

        } else {

            holder = (ViewHolder) rowView.getTag();

        }

        // 6.
        ModelPerson person = lists.get(position);

        holder.image_photo.setImageDrawable( person.getImage_photo() );
        holder.text_name  .setText         ( person.getText_name()   );
        holder.text_age   .setText         ( person.getText_age()    );
        holder.image_check.setChecked      ( person.getImage_check() );

        return rowView; // 7. 리스트뷰 추가 등 작업하러 MainActivity 로 이동 ...
    }

    // 3. ViewHolder class 만들기
    private class ViewHolder {
        ImageView image_photo;
        TextView  text_name;
        TextView  text_age;
        CheckBox  image_check;
    }
}
