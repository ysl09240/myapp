package com.slin.myapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
public class MyActivity2 extends Activity implements View.OnClickListener {

    private static final String TAG = "TestEvent2";
    private TextView text1;
    private Button button1;
    private Button button2;


    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        text1 = (TextView) findViewById(R.id.text1);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Log.v(TAG,"onclick");
        switch (view.getId()){
            case R.id.button1:
                text1.setBackgroundColor(Color.RED);
                break;
            case R.id.button2:
                text1.setBackgroundColor(Color.GREEN);
                break;
            default:
                Log.v(TAG,"other");
                break;
        }
    }
}
