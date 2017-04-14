package com.stuhua.annotationdemo;

import android.os.Bundle;
import android.support.annotation.IntDef;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.annotation.ViewInject;


public class MainActivity extends AppCompatActivity {

    @ViewInject(1)
    private int count;

    //IntDef和StringDef注解
    @IntDef({1, 2, 3})
    public @interface Flavour {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayHi(4);
    }

    @ViewInject(2)
    public void click() {
    }

    void sayHi(@Flavour int id) {
        android.widget.Toast.makeText(this, "fefe", Toast.LENGTH_SHORT).show();
    }
}
