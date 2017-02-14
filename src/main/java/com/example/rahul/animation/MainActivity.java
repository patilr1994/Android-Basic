package com.example.rahul.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btnanim).setOnClickListener(this::anim);



    }

    private void anim(View view) {

        findViewById(R.id.imgpalne).startAnimation(AnimationUtils.loadAnimation(this,R.anim.rotate));

    }
}
