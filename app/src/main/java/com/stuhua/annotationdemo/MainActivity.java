package com.stuhua.annotationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.annotation.ViewInject;


public class MainActivity extends AppCompatActivity {

    @ViewInject(1)
    private int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @ViewInject(2)
    public void click() {

    }
}
