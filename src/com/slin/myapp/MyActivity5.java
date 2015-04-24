package com.slin.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

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
public class MyActivity5 extends Activity {

    private static final String TAG = "TestMonionEvent";
    private TextView mAction;
    private TextView mPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mAction = (TextView) findViewById(R.id.action);
        mPosition = (TextView) findViewById(R.id.position);

    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        int action = event.getAction();
        float x = event.getX();
        float y = event.getY();
        Log.v(TAG,"Action = "+action);
        Log.v(TAG,"("+x+","+y+")");

        mAction.setText("Action = "+action);
        mPosition.setText("("+x+","+y+")");
        return true;

    }




}
