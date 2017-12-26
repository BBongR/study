package com.example.suv12.customview2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by suv12 on 2017-12-22.
 */

/* view_color_option.xml 만들기 - 뷰 디자인
   ColorOptionView.java 만들기 - 뷰 셋팅, 인플레이션 하는곳
   attrs_color_option 만들기 - 메인에서 뷰를 만들때 뷰의 속성을 변경할 속성을 넣어둔곳 */

/*
① view_color_option.xml 작성 - 만들고싶은 대로 뷰 만들기
② ColorOptionView.java 작성
*/

//②view_color_option.xml의 레이아웃 상속 (extends~)
//빨간줄이 뜨면 alt+enter로 생성자 3가지 만들기
public class ColorOptionView extends RelativeLayout{

    private TextView textView;
    private Button button1, button2;

    public ColorOptionView(Context context) {
        super(context);
        //③ init 메서드 작성, alt+enter로 메서드 만들기
        init (context, null, 0);
    }

    public ColorOptionView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init (context, attrs, 0);
    }

    public ColorOptionView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init (context, attrs, defStyleAttr);
    }

    // ③
    private void init(Context context, AttributeSet attrs, int defStyleAttr) {

        //④ 커스텀뷰 디자인에서 attr 속성을 가져옴
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.ColorOptionView, defStyleAttr, 0);

        // activity_main.xml에서 커스텀뷰를 만들때 attrs_color_option.xml의 설정값들을 설정가능
        // 메인에서 커스텀뷰를 만들때 attrs_color_option에 저장된 값을 가져옴
        String titleText = ta.getString(R.styleable.ColorOptionView_titleText);
        @SuppressLint("ResourceAsColor") int valueColor = ta.getColor(R.styleable.ColorOptionView_valueColor, android.R.color.holo_blue_bright);

        //⑤ 재사용 코드
        ta.recycle();

        //⑥ 인플레이션 - view_color_option.xml 커스텀뷰를 this의 자식으로 추가
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.view_color_option, this, true);

        //⑦ 뷰 연결
        textView = (TextView) this.getChildAt(1);
        button1 = (Button) this.getChildAt(0);
        button2 = (Button) this.getChildAt(2);

        //⑧ 뷰 기본설정 > activity_main.xml
        textView.setText(titleText);
        button1.setText(titleText);
        button2.setText(titleText);

        setColor(valueColor);
    }

    public void setColor(int color) {
        button1.setBackgroundColor(color);
        button2.setBackgroundColor(color);
    }

    public String getText() {
        return textView.getText().toString();
    }
}
