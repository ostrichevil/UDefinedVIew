package com.example.administrator.viewcanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.telecom.PhoneAccountHandle;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/10/16.
 */
public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //    public MyView(Context context,AttributeSet attrs,int defStyleAttr,int defStyleRes)
//    {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }
    private Paint paint = new Paint();

    private void initPaint() {
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10f);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawPoint(100,100,paint);

//        RectF rectF=new RectF(100,100,500,500);
//          canvas.drawOval(rectF,paint);
//
//        paint.setColor(Color.RED);
//        canvas.drawArc(rectF,30,60,true,paint);
//
//        paint.setColor(Color.GREEN);
//        canvas.drawArc(rectF,0,30,true,paint);
//
//        paint.setColor(Color.YELLOW);
//        canvas.drawArc(rectF,-90,70,true,paint);

            canvas.translate(getWidth()/2,getHeight()/2);

//            RectF rectF=new RectF(0,-400,400,0);
//            canvas.drawRect(rectF,paint);
//
//            canvas.scale(0.5f,0.5f);
//            paint.setColor(Color.RED);
//            canvas.drawRect(rectF,paint);
//        canvas.drawCircle(0,0,480,paint);
//        canvas.drawCircle(0,0,380,paint);
//        for(int i=0;i<360;i+=10)
//        {
//            canvas.drawLine(0,380,0,480,paint);
//            canvas.rotate(10);
//        }
//
//        for(int i=0;i<360;i+=10)
//        {
//            canvas.rotate(-10);
//        }
//
//        canvas.drawLine(0,0,50,0,paint);
//
//        RectF rectF=new RectF(-250,-250,250,250);
//        for(int j=0;j<15;j++) {
//            canvas.drawRect(rectF,paint);
//            canvas.scale(0.9f,0.9f);
//        }

//        Path path=new Path();
//        path.lineTo(200,200);
//        path.moveTo(200,100);
//        path.lineTo(200,0);
//        canvas.drawPath(path,paint);
//
//        Path path2=new Path();
//        path2.lineTo(200,-200);
//        path2.setLastPoint(200,-100);
//        path2.lineTo(200,0);
//        canvas.drawPath(path2,paint);



        //addXXX
//        Path path=new Path();
//        RectF rectF=new RectF(-200,-200,200,200);
////        path.addRect(rectF, Path.Direction.CW);
//        path.addRect(-200,-200,200,200, Path.Direction.CW);
//       path.setLastPoint(-250, 250);
//        canvas.drawPath(path,paint);

        //addPath
//        Path path=new Path();
//        Path path1=new Path();

//        path.addRect(-200,-200,200,200, Path.Direction.CW);
//        path1.addCircle(0,0,100, Path.Direction.CW);
//
//        path.addPath(path1,0,-100);
//        canvas.drawPath(path,paint);


        //addArc   arcTo
//        path.lineTo(100,100);
//        RectF rectF=new RectF(0,0,300,300);
//        path.addArc(rectF,0,270);
//        //path.arcTo(rectF,0,270,true);
//        canvas.drawPath(path,paint);



// /        Path path=new Path();
//       path.moveTo(-400,0);
//        path.lineTo((float)(-400*Math.cos(Math.PI/3)),(float)(-400*Math.sin(Math.PI/3)));
//        path.lineTo((float)(400*Math.cos(Math.PI/3)),(float)(-400*Math.sin(Math.PI/3)));
//        path.lineTo(400,0);
//        path.lineTo((float)(400*Math.cos(Math.PI/3)),(float)(400*Math.sin(Math.PI/3)));
//        path.lineTo((float)(-400*Math.cos(Math.PI/3)),(float)(400*Math.sin(Math.PI/3)));
//        path.close();
//        for(int i=0;i<6;i++) {
//            canvas.drawPath(path, paint);
//            canvas.scale(0.7f,0.7f);
//        }

        //pathmeasure方法，  getLength（），根据第二个参数true or false ，测量的长度一个为闭合和不闭合
        Path path=new Path();
        PathMeasure pathMeasure=new PathMeasure(path,true);

        Path dst=new Path();

        //200：开始位置是距离path起点的距离，600:结束位置距离path起点的距离，截取部分放入dst中，保证截取的path起始点不变
        pathMeasure.getSegment(200,600,dst,true);


    }










}
