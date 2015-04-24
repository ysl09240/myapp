package com.slin.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author :  SongLin.Yang [ysl09240@gmail.com]
 * @version :  1.0
 * @encoding : UTF-8
 * @package : com.slin.myapp
 * @link :  http://lezhai365.com
 * @created on   :  15-4-23
 * @copyright :  Copyright(c) 2013 西安乐宅网络科技有限公司
 * @description :
 */
public class SendResult extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sendresult);

        Button crok = (Button) findViewById(R.id.crok);
        crok.setOnClickListener(mCorkyListener);
        Button violet = (Button) findViewById(R.id.violet);
        violet.setOnClickListener(mVioletListener);

    }

    private View.OnClickListener mCorkyListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setResult(RESULT_OK,(new Intent()).setAction("Corky!"));
            finish();
        }
    };
    private View.OnClickListener mVioletListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            setResult(RESULT_OK,(new Intent()).setAction("Violet!"));
            finish();
        }
    };



}
