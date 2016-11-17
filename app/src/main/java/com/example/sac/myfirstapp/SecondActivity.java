package com.example.sac.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Naik Junior on 11/16/2016.
 */

public class SecondActivity extends Activity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView= (TextView)findViewById(R.id.secondActivity);
        setContentView(R.layout.second_activity);
    }
}
