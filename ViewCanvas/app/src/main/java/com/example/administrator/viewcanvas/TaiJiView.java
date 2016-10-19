package com.example.administrator.viewcanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/10/19.
 */
public class TaiJiView  extends View {
    private Paint wPaint;
    private Paint bPaint;
    private int centerX, centerY;
    private float i;

    public TaiJiView(Context context)

    {
        super(context);
        wPaint=new Paint();
        wPaint.setColor(Color.WHITE);
        wPaint.setStrokeWidth(8);

        bPaint=new Paint();
        bPaint.setColor(Color.BLACK);
        bPaint.setStrokeWidth(8);
    }

    public TaiJiView(Context context, AttributeSet attrs) {
        super(context, attrs);
        wPaint=new Paint();
        wPaint.setColor(Color.WHITE);
        wPaint.setStrokeWidth(8);

        bPaint=new Paint();
        bPaint.setColor(Color.BLACK);
        bPaint.setStrokeWidth(8);
    }

    protected void onSizeChanged(int w,int h,int oldw,int oldh)
    {
        super.onSizeChanged(w,h,oldw,oldh);
        centerX=w/2;
        centerY=h/2;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.translate(centerX,centerY);
        canvas.rotate(i);

        RectF rectF=new RectF(-200,-200,200,200);
        canvas.drawArc(rectF,90,180,true,bPaint);
        canvas.drawArc(rectF,-90,180,true,wPaint);

        RectF rectF1=new RectF(-100,-200,100,0);
        canvas.drawArc(rectF1,-90,180,true,bPaint);

        RectF rectF2=new RectF(-100,0,100,200);
        canvas.drawArc(rectF2,90,180,true,wPaint);

        canvas.drawCircle(0,-100,25,wPaint);
        canvas.drawCircle(0,100,25,bPaint);


      //  postInvalidateDelayed(10);
    }

    public void setRotateDeg(float degrees)
    {
        this.i=degrees;
        invalidate();
    }
}
