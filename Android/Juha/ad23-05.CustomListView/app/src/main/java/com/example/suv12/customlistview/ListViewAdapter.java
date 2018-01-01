package com.example.suv12.customlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by suv12 on 2017-12-29.
 */
// 1. extends ArrayAdapter<PersonData> 상속받기
public class ListViewAdapter extends ArrayAdapter<PersonData> {

    // 3. ArrayList<객체> 선언
    ArrayList<PersonData> items;

    // 2. ArrayList<PersonData> items, 생성자가 ArrayList 를 매개변수로 받도록 변경
    public ListViewAdapter(@NonNull Context context, int resource, @NonNull ArrayList<PersonData> items) {
            super(context, resource, items);
            // 3. 매개변수로 넘어온 ArrayList 와 현재 필드의 ArrayList 를 연결
            this.items = items;
    }

        // 10. 리스트에 추가된 객체를 가지고 옴
        @NonNull
        @Override
        // 4. Code > Override Methods 에서 getView 를 찾아 생성
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            // 5.
            View v = convertView;

            // 6. v가 null 이 아닐때 인플레이션
            if (v == null) {
                LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v = inflater.inflate(R.layout.activity_person_view, null);

                // 7. 뷰 홀더 생성
                ViewHolder holder = new ViewHolder();

                // 8. 생성된 뷰홀더에 커스텀 뷰의 뷰들을 연결
                holder.text_name = v.findViewById(R.id.text_name);
                holder.text_number = v.findViewById(R.id.text_number);
                holder.text_dept = v.findViewById(R.id.text_dept);

                // 9. 모름
                v.setTag(holder);
            }

            PersonData p = items.get(position);

        if(p != null) {
            // 11. 모름
            ViewHolder holder = (ViewHolder) v.getTag();

            // 12. 가져온 객체 값으로 커스텀 뷰의 뷰들의 값을 변경
            holder.text_name.setText(p.getName());
            holder.text_number.setText(String.valueOf(p.getNumber()));
            holder.text_dept.setText(p.getDept());
        }
        // 13. 변경된 뷰를 리턴(생성)
        return v;
    }

    // 7. 뷰 홀더 선언
    private class ViewHolder {
        private TextView text_name;
        private TextView text_number;
        private TextView text_dept;
    }

    // adapter 내에서 ArrayList 에 add 하는 메서드
    public void addItem(String name, int number, String dept) {
        PersonData item = new PersonData();

        item.setName(name);
        item.setNumber(number);
        item.setDept(dept);

        items.add(item);
    }
}
