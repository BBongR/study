package com.example.suv12.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by suv12 on 2017-12-25.
 */

// 객체 데이터를 전달하기 위해서는 Parcelable 을 구현해야 한다.
public class SimpleData implements Parcelable {

    int number;
    String message;

    // 생성자 만들기
    public SimpleData(int number, String message) {
        this.number = number;
        this.message = message;
    }

    //Parcel 데이터를 읽어서 변수에 할당
    //Parcel 에서 Simple 데이터 안에 들어 있는 데이터 복원
    //Parcel 은 데이터를 전달할 때 사용되는 객체다
    public SimpleData(Parcel src) {
        number = src.readInt();
        message = src.readString();
    }

    //반드시 구현해야하는 변수
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {

        @Override
        public SimpleData createFromParcel(Parcel src) {
            return new SimpleData(src);
        }

        //배열 객체 만들어 주기
        @Override
        public SimpleData[] newArray(int size) {
            return new SimpleData[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    //Parcel 객체로 써준다.
    //SimpleData 가 Parcel 로 바꿔준다
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(number);
        dest.writeString(message);
    }
}
