package com.slin.myapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
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
public class MyActivity extends Activity implements View.OnClickListener {


    private Button go;
    private TextView forward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        forward = (TextView) findViewById(R.id.forward);
        forward.setText("这是forward---------------->");
        go = (Button) findViewById(R.id.go);
        go.setOnClickListener(this);

    }


    @Override
    public void onClick(View view){
        Intent intent = new Intent();
        intent.setClass(MyActivity.this,ForwardTargetActivity.class);
        startActivity(intent);
        finish();
    }









}
