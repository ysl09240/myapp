package com.slin.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.ImageView;
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
public class MyActivity4 extends Activity {

    private static final String TAG = "TestKeyEvent";
    private ImageView mImage;
    private TextView mAlphavalueText;
    private int mAlphavalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mImage = (ImageView) findViewById(R.id.image);
        mAlphavalueText = (TextView) findViewById(R.id.alphavaluetext);
        mAlphavalue = 100;
        mImage.setImageAlpha(mAlphavalue);
        mAlphavalueText.setText("Alpha = " + mAlphavalue*100/0xff + "%");
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent msg){
        Log.v(TAG, "onKeyDown: keyCode = "+ keyCode);
        Log.v(TAG, "onKeyDown: String = " + msg.toString());
        switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_UP:
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                mAlphavalue += 20;
                break;
            case KeyEvent.KEYCODE_DPAD_DOWN:
            case KeyEvent.KEYCODE_DPAD_LEFT:
                mAlphavalue -= 20;
                break;
            default:
                break;
        }
        if(mAlphavalue>=0xFF)mAlphavalue = 0xFF;
        if(mAlphavalue<=0x0)mAlphavalue = 0x0;
        mImage.setImageAlpha(mAlphavalue);
        mAlphavalueText.setText("Alpha = " + mAlphavalue*100/0xff + "%");
        return super.onKeyDown(keyCode, msg);
    }




}
