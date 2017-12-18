package com.android.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/**
 * Created by Administrator on 2017-12-18.
 */

public class CustomView extends View {
    public CustomView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // super.onDraw(canvas);
        canvas.drawColor(Color.GRAY);

        Paint paint = new Paint();
//        paint.setColor(Color.BLUE);
//        canvas.drawCircle(300, 300, 100, paint);
//
//        paint.setColor(Color.RED);
//        paint.setAntiAlias(true);
//        canvas.drawCircle(400, 400, 400, paint);
//
//        paint.setColor(Color.RED);
//        canvas.drawPoint(500, 500, paint);
//
//        paint.setColor(Color.RED);
//        canvas.drawLine(50, 50, 100, 100, paint);
//
//        paint.setColor(Color.BLACK);
//        canvas.drawRect(150,10, 250,150,paint);

        Bitmap bitmap = BitmapFactory.decodeResource(getContext().getResources(),R.drawable.pp);
//        canvas.drawBitmap(bitmap,50,50,null);
//        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.MIRROR));
//        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT));
        canvas.drawRect(10,10,1000,1000,paint);
    }
}
