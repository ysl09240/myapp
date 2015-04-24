package com.slin.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


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
public class ReceiveResult extends Activity{

    static final private int GET_CODE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receiveresult);
        Button receieve = (Button) findViewById(R.id.receieve);
        receieve.setOnClickListener(mGetListener);
    }

    private View.OnClickListener mGetListener = new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(ReceiveResult.this,SendResult.class);
            startActivityForResult(intent,GET_CODE);

        }
    };

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//      if(requestCode == GET_CODE){
//          TextView text = (TextView) findViewById(R.id.send);
//          if(resultCode == RESULT_CANCELED){
//              text.append("(cancelled)");
//          }else{
//              text.append("(okay ");
//              text.append("(okay ");
//              text.append(Integer.toString(resultCode));
//              text.append(") ");
//              if (data != null) {
//                  text.append(data.getAction());
//              }
//          }
//          text.append("\n");
//      }
//    }
}
