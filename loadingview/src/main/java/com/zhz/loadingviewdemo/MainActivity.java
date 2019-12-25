package com.zhz.loadingviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zhz.loadingviewdemo.widget.LoadingDialog;
import com.zhz.loadingviewdemo.widget.LoadingView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LoadingView loadingView;
//    private LoadingSurfaceView loadingView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        loadingView = findViewById(R.id.loadingView);
//        loadingView1 = findViewById(R.id.loadingView1);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        loadingView.start();
//        loadingView1.start();
//        LoadingDialog dialog = new LoadingDialog(this);
//        dialog.show();
//        dialog.start();
    }
}
