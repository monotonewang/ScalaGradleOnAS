package com.wang.www.rs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wang.www.scalagradleonas.R;
import com.wang.www.scalagradleonas.ScalaActivity;

/**
 * Created by 7 on 2016/10/20.
 */

public class JavaActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        TextView textView= (TextView) findViewById(R.id.secondtitle);
        textView.setText("Writen by java");
        Button button= (Button) findViewById(R.id.secondbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JavaActivity.this, ScalaActivity.class));
            }
        });

    }
}
