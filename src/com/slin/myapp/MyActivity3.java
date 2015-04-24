package com.slin.myapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
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
public class MyActivity3 extends Activity {

    private static final String TAG = "TestEvent2";
    private TextView text1;
    private Button1_OnClickListener mlistener1 = new Button1_OnClickListener();
    private Button2_OnClickListener mlistener2 = new Button2_OnClickListener();
    private Button button2;

    class Button1_OnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            text1.setBackgroundColor(Color.RED);
        }
    }
    class Button2_OnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            text1.setBackgroundColor(Color.GREEN);
        }
    }
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        text1 = (TextView) findViewById(R.id.text1);
        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(mlistener1);
        final Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(mlistener2);

    }

}
