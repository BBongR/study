package com.example.suv12.multitypelistview;

import android.graphics.drawable.Drawable;

/**
 * Created by suv12 on 2018-01-11.
 */

public class ModelItem {

    private int type;

    // listview_item1.xml
    private String title;
    private String desc;

    // listview_item2.xml
    private Drawable image;
    private String   name;

    // 생성자
    public ModelItem() {}

    // type1 생성자
    public ModelItem(String title, String desc) {
        this.type  = AdapterItem.VIEW_TYPE_TEXT;
        this.title = title;
        this.desc  = desc;
    }

    // type2 생성자
    public ModelItem(Drawable image, String name) {
        this.type  = AdapterItem.VIEW_TYPE_IMAGE;
        this.image = image;
        this.name  = name;
    }

    // getter & setter
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString
    @Override
    public String toString() {
        return "ModelItem{" +
                "type=" + type +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", image=" + image +
                ", name='" + name + '\'' +
                '}';
    }
}
