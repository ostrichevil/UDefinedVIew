package com.example.administrator.viewcanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2016/10/18.
 */
public class BizzerView extends View {

    private int centerX,centerY;
    private Paint mpaint;
    private PointF start,end,control;

    public BizzerView(Context context,AttributeSet attrs) {
      //  super(context,attr);
      super(context,attrs);
        mpaint=new Paint();
        mpaint.setColor(Color.BLACK);
        mpaint.setStyle(Paint.Style.STROKE);
        mpaint.setStrokeWidth(8);
        mpaint.setTextSize(60);
        start=new PointF(0,0);
        end=new PointF(0,0);
        control=new PointF(0,0);
    }


    protected void onSizeChanged(int w,int h,int oldw,int oldh)
    {
        super.onSizeChanged(w,h,oldw,oldh);
        centerX=w/2;
        centerY=h/2;

        start.x=centerX-200;
        start.y=centerY;
        end.x=centerX+200;
        end.y=centerY;

        control.x=centerX;
        control.y=centerY;
        Log.i("onSzieChanged", "onSizeChanged: "+1111);
    }

    public boolean onTouchEvent(MotionEvent event)
    {
        control.x=event.getX();
        control.y=event.getY();
        invalidate();
        Log.i("ontouchevent", "onTouchEvent: "+333333);
        return true;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        // 绘制数据点和控制点
        mpaint.setColor(Color.GRAY);
        mpaint.setStrokeWidth(20);
        canvas.drawPoint(start.x,start.y,mpaint);
        canvas.drawPoint(end.x,end.y,mpaint);
        canvas.drawPoint(control.x,control.y,mpaint);

        // 绘制辅助线
        mpaint.setStrokeWidth(4);
        canvas.drawLine(start.x,start.y,control.x,control.y,mpaint);
        canvas.drawLine(end.x,end.y,control.x,control.y,mpaint);

        // 绘制贝塞尔曲线
        mpaint.setColor(Color.RED);
        mpaint.setStrokeWidth(8);

        Path path = new Path();
        path.moveTo(start.x,start.y);
        path.quadTo(control.x,control.y,end.x,end.y);
        canvas.drawPath(path,mpaint);
        Log.i("onDraw", "onDraw: "+22222);

    }
}
