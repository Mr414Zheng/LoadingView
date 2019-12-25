package com.zhz.loadingviewdemo.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.zhz.loadingviewdemo.R;

public class LoadingDialog extends Dialog{

    public LoadingDialog(@NonNull Context context) {
        super(context);
        init();
    }

    public LoadingDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    private void init() {
        setContentView(R.layout.dialog_loading);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }
}
