package com.example.administrator.viewcanvas;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
//        final TaiJiView taiJiView=new TaiJiView(this);
//        setContentView(taiJiView);
//        Handler myHandler=new Handler()
//        {
//            private float degrees = 0;
//          public void handleMessage(Message message)
//          {
//              super.handleMessage(message);
//              taiJiView.setRotateDeg(degrees+=5);
//              this.sendEmptyMessageDelayed(0,80);
//          }
//        };
//
//
//        //调用此处进myHandler的hanleMessage方法，循环
//        myHandler.sendEmptyMessageDelayed(0,20);
    }
}
