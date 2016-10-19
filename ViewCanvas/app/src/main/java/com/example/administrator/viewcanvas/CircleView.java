package com.example.administrator.viewcanvas;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/10/19.
 */
public class CircleView extends View {

    private  float currentValue=0;
    private float[] pos;      //当前点的实际位置
    private float[] tan;       //当前点的tan值，用于计算图片旋转所需的角度
    private Bitmap bitmap;
    private Matrix matrix;    //矩阵，用于对于图片的操作
    private Paint mpaint;

    //构造函数，用于在xml中调用
    public CircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public void init(Context context)
    {
        pos=new float[2];
        tan=new float[2];
        BitmapFactory.Options options=new BitmapFactory.Options();
        options.inSampleSize=2;    //缩放图片
        bitmap=BitmapFactory.decodeResource(context.getResources(),R.mipmap.ic_launcher,options);
        matrix=new Matrix();
        mpaint=new Paint();
        mpaint.setColor(Color.BLACK);
        mpaint.setStrokeWidth(8);
        mpaint.setStyle(Paint.Style.STROKE);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.translate(getWidth()/2,getHeight()/2);

        Path path=new Path();
        path.addCircle(0,0,200,Path.Direction.CW);
        PathMeasure pathMeasure=new PathMeasure(path,false);
        currentValue+=0.005;
        if(currentValue>=1)
        {
        currentValue=0;
    }
        pathMeasure.getPosTan(pathMeasure.getLength()*currentValue,pos,tan);
        matrix.reset();

        float degrees=(float)(Math.atan2(tan[1],tan[0])*180.0/Math.PI);

        matrix.postRotate(degrees,bitmap.getWidth()/2,bitmap.getHeight()/2);   //旋转图片
        matrix.postTranslate(pos[0] - bitmap.getWidth() / 2, pos[1] - bitmap.getHeight() / 2);
        canvas.drawPath(path,mpaint);
        canvas.drawBitmap(bitmap,matrix,mpaint);
        invalidate();

    }

}
