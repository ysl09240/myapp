package com.slin.myapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyActivity1 extends Activity {
    private static final String TAG = "MyActivity";
    public MyActivity1(){

    }
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        TextView tv = new TextView(this);
//        tv.setText("this is  my first app ,Hello World!!!!");
//        setContentView(tv);
//        ImageView iv = new ImageView(this);
//        iv.setImageResource(R.drawable.helloworldimage);
//        setContentView(iv);
        setContentView(R.layout.main);

        final TextView text = (TextView) findViewById(R.id.text1);
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setBackgroundColor(Color.RED);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setBackgroundColor(Color.GREEN);
            }
        });


    }
}
