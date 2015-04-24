package com.slin.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import org.w3c.dom.Text;

/**
 * @author :  SongLin.Yang [ysl09240@gmail.com]
 * @version :  1.0
 * @encoding : UTF-8
 * @package : com.slin.myapp
 * @link :  http://lezhai365.com
 * @created on   :  15-4-22
 * @copyright :  Copyright(c) 2013 西安乐宅网络科技有限公司
 * @description :
 */
public class ForwardTargetActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forwardtarget);
        TextView forwardTarget = (TextView) findViewById(R.id.forward_target);
        forwardTarget.setText("这是forwardTarget");
    }


}
