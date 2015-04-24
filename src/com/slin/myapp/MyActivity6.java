package com.slin.myapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * @author :  SongLin.Yang [ysl09240@gmail.com]
 * @version :  1.0
 * @encoding : UTF-8
 * @package : com.slin.myapp
 * @link :  http://lezhai365.com
 * @created on   :  15-4-14
 * @copyright :  Copyright(c) 2013 西安乐宅网络科技有限公司
 * @description :
 */
public class MyActivity6 extends Activity {

    private static final String TAG = "TestMonionEvent2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new TestMotionView(this));
    }

    public class TestMotionView extends View {
        private Paint mPaint = new Paint();
        private float mX;
        private float mY;
        private int mAction;

        public TestMotionView(Context context) {
            super(context);
            mAction = MotionEvent.ACTION_UP;
            mX = 0;
            mY = 0;
        }
        @Override
        protected void onDraw(Canvas canvas){
            Paint paint = mPaint;
            canvas.drawColor(Color.WHITE);
            if(MotionEvent.ACTION_MOVE == mAction){
                paint.setColor(Color.RED);
            }else if(MotionEvent.ACTION_UP == mAction){
                paint.setColor(Color.GREEN);
            }else if(MotionEvent.ACTION_DOWN == mAction){
                paint.setColor(Color.BLUE);
            }

            canvas.drawCircle(mX,mY,10,paint);
            setTitle("A = " + mAction + " ["+ mX +","+ mY +"]");
        }

        @Override
        public boolean onTouchEvent(MotionEvent event){
            int mAction = event.getAction();
            mX = event.getX();
            mY = event.getY();
            Log.v(TAG,"Action = "+mAction);
            Log.v(TAG,"("+mX+","+mY+")");
            invalidate();
            return true;
        }
    }






}
